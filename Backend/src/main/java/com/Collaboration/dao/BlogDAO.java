package com.Collaboration.dao;

import java.util.List;

import com.Collaboration.model.Blog;


public interface BlogDAO {

	public boolean addBlog(Blog blog);
	public boolean updateBlog(Blog blog);
	public boolean deleteBlog(Blog blog);
	public Blog getBlog(int blogId);
	public List<Blog> getBlogs();
	public boolean incrementLikes(int blogId);
	public boolean incrementDislikes(int blogId);
	public boolean approveBlog(int blogId);
	public boolean rejectBlog(int blogId);	
}
