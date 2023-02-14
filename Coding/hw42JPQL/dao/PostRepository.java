package Coding.hw42JPQL.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author b1go
 * @date 8/22/22 6:48 PM
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // No need to write code

  @Query("select p from Post p where p.id == ?1 or p.title =?2")
  Post getPostByIDOrTitleWithJPQLIndexParameters(Long id, String title);


  @Query("select p from Post p where p.id = :key or p.title = :title")
  Post getPostByIDOrTitleWithJPQLNamedParameters(@Param("key") Long id,
                                                 @Param("title") String title);
  @Query(value = "select * from posts p where p.id = ?1 or p.title = ?2 p.update_date_time", nativeQuery = true)
  Post getPostByIDOrTitleWithSQLIndexParameters(Long id, String title);

  @Query(value = "select * from posts p where p.id = :key or p.title = :title", nativeQuery = true)
  Post getPostByIDOrTitleWithSQLNamedParameters(@Param("key") Long id,
                                                @Param("title") String title);
}
