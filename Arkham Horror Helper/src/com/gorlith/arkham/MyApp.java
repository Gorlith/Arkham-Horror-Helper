package com.gorlith.arkham;

import java.util.ArrayList;
import java.util.List;

import android.app.Application;

public class MyApp extends Application {

	public static List<Investigator> INVESTIGATORS = new ArrayList<Investigator>();
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		INVESTIGATORS.add(new Investigator("Amanda Sharpe", "the Student", 4, 5));
		INVESTIGATORS.add(new Investigator("Ashcan Pete", "the Drifter", 5, 6));
		INVESTIGATORS.add(new Investigator("Bob Jenkins", "the Salesman", 4, 6));
		INVESTIGATORS.add(new Investigator("Carolyn Fern", "the Psychologist", 6, 5));
		INVESTIGATORS.add(new Investigator("Darrell Simmons", "the Photographer", 4, 6));
		INVESTIGATORS.add(new Investigator("Dexter Drak", "the Magician", 5, 5));
		INVESTIGATORS.add(new Investigator("Gloria Goldberg", "the Author", 6, 5));
		INVESTIGATORS.add(new Investigator("Harvey Walters", "the Professor", 7, 3));
		INVESTIGATORS.add(new Investigator("Jenny Barnes", "the Dilettante", 6, 4));
		INVESTIGATORS.add(new Investigator("Joe Diamond", "the Private Eye", 4, 6));
		INVESTIGATORS.add(new Investigator("Kate Winthrop", "the Scientist", 6, 4));
		INVESTIGATORS.add(new Investigator("Mandy Thompson", "the Researcher", 5, 5));
		INVESTIGATORS.add(new Investigator("Michael McGlen", "the Gangster", 3, 7));
		INVESTIGATORS.add(new Investigator("Monterey Jack", "the Archeologist", 3, 7));
		INVESTIGATORS.add(new Investigator("Sister Mary", "the Nun", 7, 3));
		INVESTIGATORS.add(new Investigator("Vincent Lee", "the Doctor", 5, 5));
	}
}
