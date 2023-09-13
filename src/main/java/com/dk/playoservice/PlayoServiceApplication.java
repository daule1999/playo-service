package com.dk.playoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayoServiceApplication.class, args);
	}
	//   activity-public/list/location

	// sports add, get, getById, getByName, delete, update
	// sportsCategory add, get, getById, getByName, delete, update

	//userInfo =>
	// userSportsData
	// upcomingActivities
	// venueList

	//https://api.playo.io/onboard/generateOTP
	//https://api.playo.io/onboard/verifyOTP
	// https://playo.co/api/login
}
