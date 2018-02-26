package com.myproj.dao;

import com.myproj.model.BlogPost;
import com.myproj.model.BlogPostLikes;

public interface BlogPostLikesDao {
	BlogPostLikes hasUserLikedPost(int postId, String email);

	BlogPost updateLikes(int postId, String email);
}