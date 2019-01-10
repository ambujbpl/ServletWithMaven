package com.ideata.model;

import java.util.Date;

public class Alert {
	String lr_no;
	int user_id;
	Date created_date;
	int notification;
	public String getLr_no() {
		return lr_no;
	}
	public void setLr_no(String lr_no) {
		this.lr_no = lr_no;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public int getNotification() {
		return notification;
	}
	public void setNotification(int notification) {
		this.notification = notification;
	}
}
