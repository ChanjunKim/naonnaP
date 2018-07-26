package com.spring.naonnaP;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class GroundVO {
	private String ground_Name;
	private String ground_admin;
	private String ground_addr;
	private int grass;
	private int shower;
	private int parking;
	private int light;
	private int week_morning;
	private int week_evening;
	private int weekend_morning;
	private int weekend_evening;
	private String review;
	private String photo;
	private String rule;
	private int size;
	
	public String getGround_Name() {
		return ground_Name;
	}
	public void setGround_Name(String ground_Name) {
		this.ground_Name = ground_Name;
	}
	public String getGround_admin() {
		return ground_admin;
	}
	public void setGround_admin(String ground_admin) {
		this.ground_admin = ground_admin;
	}
	public String getGround_addr() {
		return ground_addr;
	}
	public void setGround_addr(String ground_addr) {
		this.ground_addr = ground_addr;
	}
	public int getGrass() {
		return grass;
	}
	public void setGrass(int grass) {
		this.grass = grass;
	}
	public int getShower() {
		return shower;
	}
	public void setShower(int shower) {
		this.shower = shower;
	}
	public int getParking() {
		return parking;
	}
	public void setParking(int parking) {
		this.parking = parking;
	}
	public int getLight() {
		return light;
	}
	public void setLight(int light) {
		this.light = light;
	}
	public int getWeek_morning() {
		return week_morning;
	}
	public void setWeek_morning(int week_morning) {
		this.week_morning = week_morning;
	}
	public int getWeek_evening() {
		return week_evening;
	}
	public void setWeek_evening(int week_evening) {
		this.week_evening = week_evening;
	}
	public int getWeekend_morning() {
		return weekend_morning;
	}
	public void setWeekend_morning(int weekend_morning) {
		this.weekend_morning = weekend_morning;
	}
	public int getWeekend_evening() {
		return weekend_evening;
	}
	public void setWeekend_evening(int weekend_evening) {
		this.weekend_evening = weekend_evening;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
