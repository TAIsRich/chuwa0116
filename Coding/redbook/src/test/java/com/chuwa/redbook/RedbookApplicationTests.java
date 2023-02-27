package com.chuwa.redbook;

import com.chuwa.redbook.dao.security.RoleRepository;
import com.chuwa.redbook.entity.security.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedbookApplicationTests {

	@Autowired
	private RoleRepository roleRepository;

	@Test
	void saveRoles() {
//		roleRepository.save(new Role("ROLE_USER"));
//		roleRepository.save(new Role("ROLE_ADMIN"));
	}

}
