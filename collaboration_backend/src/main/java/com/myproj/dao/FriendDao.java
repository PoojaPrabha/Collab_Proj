package com.myproj.dao;

import java.util.List;

import com.myproj.model.Friend;
import com.myproj.model.User;

public interface FriendDao {
	List<User> listOfSuggestedUsers(String email);

	void addFriendRequest(Friend friend);

	List<Friend> getAllPendingRequests(String email);// loggedin user id

	void updateFriendRequest(Friend friend);

	List<User> listOfFriends(String email);
}
