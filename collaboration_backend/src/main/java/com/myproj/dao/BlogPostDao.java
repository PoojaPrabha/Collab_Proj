package com.myproj.dao;

import java.util.List;

import com.myproj.model.BlogPost;

public interface BlogPostDao {

	void addBlogPost(BlogPost blogPost);

	List<BlogPost> getBlogs(boolean approved);

	BlogPost getBlogById(int id);

	void blogApproved(int id);

	void blogRejected(int id, String rejectionReason);
}