package com.myproj.dao;

import com.myproj.model.ProfilePicture;

public interface ProfilePictureDao {

	//void save(ProfilePicture profilePicture);
	
	void uploadProfilePicture(ProfilePicture profilePicture);

	ProfilePicture getProfilePicture(String email);

	

}
