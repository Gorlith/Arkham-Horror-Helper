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
		
		ahInvestigators();
	}
	
	public static void ihInvestigators() {
		INVESTIGATORS.clear();
		INVESTIGATORS.add(new Investigator("Agnes Baker", "the Waitress", 5, 5, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Akachi Onyele", "the Shaman", 7, 3, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Finn Edwards", "the Bootlegger", 4, 6, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("George Barnaby", "the Lawyer", 7, 3, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Hank Samson", "the Farmhand", 5, 6, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Minh Thi Phan", "the Secretary", 6, 4, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Norman Withers", "the Astronomer", 6, 4, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Patrice Hathaway", "the Violinist", 5, 5, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Roland Banks", "the Fed", 4, 6, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Silas Marsh", "the Sailor", 4, 6, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Skids O'Toole", "the Ex-Convict", 3, 7, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Tommy Muldoon", "the Rookie Cop", 5, 5, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Trish Scarborough", "the Spy", 6, 4, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Ursula Downs", "the Explorer", 5, 5, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("William Yorick", "the Gravedigger", 4, 6, "Innsmouth Horror"));
		INVESTIGATORS.add(new Investigator("Zoey Samaras", "the Chef", 3, 7, "Innsmouth Horror"));
	}
	
	public static void khInvestigators() {
		INVESTIGATORS.clear();
		INVESTIGATORS.add(new Investigator("Charlie Kane", "the Politician", 4, 6, "Kingsport Horror"));
		INVESTIGATORS.add(new Investigator("Daisy Walker", "the Librarian", 5, 5, "Kingsport Horror"));
		//INVESTIGATORS.add(new Investigator("Lily Chen", "the Martial Artist", 4, 6, "Kingsport Horror"));
		INVESTIGATORS.add(new Investigator("Lola Hayes", "the Actress", 6, 4, "Kingsport Horror"));
		INVESTIGATORS.add(new Investigator("Luke Robinson", "the Dreamer", 7, 3, "Kingsport Horror"));
		INVESTIGATORS.add(new Investigator("Tony Morgan", "the Bounty Hunter", 3, 7, "Kingsport Horror"));
		INVESTIGATORS.add(new Investigator("Wendy Adams", "the Urchin", 4, 4, "Kingsport Horror"));
		
	}
	
	public static void dhInvestigators() {
		//Dunwich Horror Expansion Investigators
		INVESTIGATORS.clear();
		INVESTIGATORS.add(new Investigator("Diana Stanley", "the Redeemed Cultist", 4, 6, "Dunwich Horror"));
		INVESTIGATORS.add(new Investigator("Jacqueline Fine", "the Psychic", 7, 3, "Dunwich Horror"));
		INVESTIGATORS.add(new Investigator("Jim Culver", "the Musician", 6, 4, "Dunwich Horror"));
		INVESTIGATORS.add(new Investigator("Leo Anderson", "the Expedition Dinner", 5, 5, "Dunwich Horror"));
		INVESTIGATORS.add(new Investigator("Marie Lambeau", "the Entertainer", 6, 4, "Dunwich Horror"));
		INVESTIGATORS.add(new Investigator("Mark Harrigan", "the Soldier", 3, 7, "Dunwich Horror"));
		INVESTIGATORS.add(new Investigator("Rita Young", "the Athlete", 4, 6, "Dunwich Horror"));
		INVESTIGATORS.add(new Investigator("Wilson Richards", "the Handyman", 6, 4, "Dunwich Horror"));
	}

	public static void ahInvestigators() {
		//Main Arkham Horror Investigators
		INVESTIGATORS.clear();
		INVESTIGATORS.add(new Investigator("Amanda Sharpe", "the Student", 4, 5));
		INVESTIGATORS.add(new Investigator("Ashcan Pete", "the Drifter", 5, 6));
		INVESTIGATORS.add(new Investigator("Bob Jenkins", "the Salesman", 4, 6));
		INVESTIGATORS.add(new Investigator("Carolyn Fern", "the Psychologist", 6, 5));
		INVESTIGATORS.add(new Investigator("Darrell Simmons", "the Photographer", 4, 6));
		INVESTIGATORS.add(new Investigator("Dexter Drake", "the Magician", 5, 5));
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
