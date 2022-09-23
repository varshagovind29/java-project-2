package com.ta.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class SelectionAppDto 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Fullname;
	private String Gender;
	private long Mobileno;
	private String Email;
	private String InterestingIn;
	private String LocationPrefrence;
	private String ExperienceIn;
	private String NumberOfyearOfexperience;
	private String SubjectSpecialization;
	private String AvailableForJoining;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public long getMobileno() {
		return Mobileno;
	}
	public void setMobileno(long mobileno) {
		Mobileno = mobileno;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getInterestingIn() {
		return InterestingIn;
	}
	public void setInterestingIn(String interestingIn) {
		InterestingIn = interestingIn;
	}
	public String getLocationPrefrence() {
		return LocationPrefrence;
	}
	public void setLocationPrefrence(String locationPrefrence) {
		LocationPrefrence = locationPrefrence;
	}
	public String getExperienceIn() {
		return ExperienceIn;
	}
	public void setExperienceIn(String experienceIn) {
		ExperienceIn = experienceIn;
	}
	public String getNumberOfyearOfexperience() {
		return NumberOfyearOfexperience;
	}
	public void setNumberOfyearOfexperience(String numberOfyearOfexperience) {
		NumberOfyearOfexperience = numberOfyearOfexperience;
	}
	public String getSubjectSpecialization() {
		return SubjectSpecialization;
	}
	public void setSubjectSpecialization(String subjectSpecialization) {
		SubjectSpecialization = subjectSpecialization;
	}
	public String getAvailableForJoining() {
		return AvailableForJoining;
	}
	public void setAvailableForJoining(String availableForJoining) {
		AvailableForJoining = availableForJoining;
	}
	

}
