package com.chuwa.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String body;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
	@CreationTimestamp
	private LocalDateTime createDateTime;
	@UpdateTimestamp
	private LocalDateTime updateDateTime;

	@Override
	public String toString() {
		return "Comment{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", body='" + body + '\'' +
				", post=" + post +
				", createDateTime=" + createDateTime +
				", updateDateTime=" + updateDateTime +
				'}';
	}

	public Comment() {
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getBody() {
		return body;
	}

	public Post getPost() {
		return post;
	}

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	public Comment(Long id, String name, String email, String body, Post post, LocalDateTime createDateTime, LocalDateTime updateDateTime) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.body = body;
		this.post = post;
		this.createDateTime = createDateTime;
		this.updateDateTime = updateDateTime;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
}
