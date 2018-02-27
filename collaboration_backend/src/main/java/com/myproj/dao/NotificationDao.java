package com.myproj.dao;

import java.util.List;

import com.myproj.model.Notification;

public interface NotificationDao {
	
	List<Notification> getAllNotification(String email);// login id

	void updateViewedStatus(int notificationId);

	Notification getNotification(int id);
}