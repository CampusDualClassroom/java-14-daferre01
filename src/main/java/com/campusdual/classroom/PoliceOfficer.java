package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}
	@Override
	public void getDetails(){
		System.out.println("Nombre:"+name);
		System.out.println("Apellidos: "+surname);
		System.out.println("Squad: "+squad);
	}
}
