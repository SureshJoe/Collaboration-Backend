package com.Collaboration.dao;

import java.util.List;

import com.Collaboration.model.ForumComment;


public interface ForumCommentDAO {

public boolean addForumComment(ForumComment forumcomment);
public boolean updateForumComment(ForumComment forumcomment);
public boolean deleteForumComment(ForumComment forumcomment);
public ForumComment getForumComment(int commentId);
public List<ForumComment> getForumComments();
}
