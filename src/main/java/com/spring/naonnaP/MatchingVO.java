package com.spring.naonnaP;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class MatchingVO {
	private String matchingID;
	private String homeTeam;
	private String awayTeam;
	private String ground_Name;
	private String match_location;
	private Date play_Date;
	private Date time;
	private int score;
	private int people;
	private int finish;
	
	public String getMatchingID() {
		return matchingID;
	}
	public void setMatchingID(String matchingID) {
		this.matchingID = matchingID;
	}
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	public String getGround_Name() {
		return ground_Name;
	}
	public void setGround_Name(String ground_Name) {
		this.ground_Name = ground_Name;
	}
	public String getMatch_location() {
		return match_location;
	}
	public void setMatch_location(String match_location) {
		this.match_location = match_location;
	}
	public Date getPlay_Date() {
		return play_Date;
	}
	public void setPlay_Date(Date play_Date) {
		this.play_Date = play_Date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public int getFinish() {
		return finish;
	}
	public void setFinish(int finish) {
		this.finish = finish;
	}
	
}
