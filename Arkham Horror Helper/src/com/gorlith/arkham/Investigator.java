package com.gorlith.arkham;

public class Investigator {

	private final String name;
	
	private final String occupation;
	
	private final int sanity;
	
	private final int stamina;
	
	private final String expansion;
	
	private final String imgName;
	
	public Investigator(String name, String occupation, int sanity, int stamina, String expansion, String imgName)
	{
		this.name = name;
		this.occupation = occupation;
		this.sanity = sanity;
		this.stamina = stamina;
		this.expansion = expansion;
		this.imgName = imgName;
	}
	
	public Investigator(String name, String occupation, int sanity, int stamina, String expansion)
	{
		this(name, occupation, sanity, stamina, expansion, name.toLowerCase().replace(' ', '_'));
	}
	
	public Investigator(String name, String occupation, int sanity, int stamina)
	{
		this(name, occupation, sanity, stamina, "Arkham Horror", name.toLowerCase().replace(' ', '_'));
	}
	@Override
	public String toString() {
		return this.name +" "+ this.occupation;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getOccupation()
	{
		return this.occupation;
	}
	
	public int getSanity()
	{
		return this.sanity;
	}
	
	public int getStamina()
	{
		return this.stamina;
	}
	
	public String getExpansion()
	{
		return this.expansion;
	}
	
	public String getImgName()
	{
		return this.imgName;
	}
}
