package com.project.fitra.FitraModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="progress")
@JsonPropertyOrder({ "email","monday", "tuesday","wednesday","thursday","friday","saturday","sunday" })
public class ProgressModel {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="email")
	@JsonProperty
	String email;
	@Column(name="monday")
int monday;
	@Column(name="tuesday")
int tuesday;
	@Column(name="target_calories")
	int target_calories;
	@Column(name="Maintanance_Calories")
	int maintanace_calories;
	
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getaverage_calories() {
	return average_calories;
}
public void setaverage_calories(int average_calories) {
	this.average_calories = average_calories;
}
public float getWeightloss_in_kg() {
	return Weightloss_in_kg;
}
public void setWeightloss_in_kg(float weightloss_in_kg) {
	Weightloss_in_kg = weightloss_in_kg;
}

@Column(name="wednesday")
int wednesday;
@Column(name="thursday")
int thursday;
@Column(name="friday")
int friday;
@Column(name="saturday")
int saturday;
@Column(name="sunday")
int sunday;
@Column(name="average_calories")
int average_calories=(monday+tuesday+wednesday+thursday+friday+saturday+sunday)/7;
@JsonProperty("monday")
public int getmonday() {
	return monday;
}
public void setmonday(int monday) {
	this.monday = monday;
}
@JsonProperty("tuesday")
public int gettuesday() {
	return tuesday;
}
public void settuesday(int tuesday) {
	this.tuesday = tuesday;
}
@JsonProperty("wednesday")
public int getwednesday() {
	return wednesday;
}
public void setwednesday(int wednesday) {
	this.wednesday = wednesday;
}
@JsonProperty("thursday")
public int getthursday() {
	return thursday;
}
public void setthursday(int thursday) {
	this.thursday = thursday;
}
@JsonProperty("friday")
public int getfriday() {
	return friday;
}
public void setfriday(int friday) {
	this.friday = friday;
}
@JsonProperty("saturday")
public int getsaturday() {
	return saturday;
}
public void setsaturday(int saturday) {
	this.saturday = saturday;
}
@JsonProperty("sunday")
public int getsunday() {
	return sunday;
}
public void setsunday(int sunday) {
	this.sunday = sunday;
}
static
{
	
}
@Override
public String toString() {
	return "ProgressModel [monday=" + monday + ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thursday="
			+ thursday + ", friday=" + friday + ", saturday=" + saturday + ", sunday=" + sunday + ", average_calories="
			+ average_calories + ", target_calories=" + target_calories + ", maintanace_calories="
			+ maintanace_calories + ", Weightloss_in_kg=" + Weightloss_in_kg + "]";
}

public int gettarget_calories() {
	return target_calories;
}
public ProgressModel(String email,int monday, int tuesday, int wednesday, int thursday, int friday, int saturday, int sunday,
		int target_calories, int maintanace_calories) {
	super();
	this.email=email;
	this.monday = monday;
	this.tuesday = tuesday;
	this.wednesday = wednesday;
	this.thursday = thursday;
	this.friday = friday;
	this.saturday = saturday;
	this.sunday = sunday;
	this.target_calories = target_calories;
	this.maintanace_calories = maintanace_calories;
	average_calories=(monday+tuesday+wednesday+thursday+friday+saturday+sunday)/7;
	Weightloss_in_kg=(float) (((maintanace_calories-average_calories)*7.0)/7700.0);
	//Weightloss_in_kg.7;
}
public ProgressModel() {
	super();
	// TODO Auto-generated constructor stub
}
public void settarget_calories(int target_calories) {
	this.target_calories = target_calories;
}

public int getmaintanace_calories() {
	return maintanace_calories;
}

public void setmaintanace_calories(int maintanace_calories) {
	this.maintanace_calories = maintanace_calories;
}

@Column(name="Weightloss_in_kg")
float Weightloss_in_kg=(float) (((maintanace_calories-average_calories)*7.0)/7700);
public void init()
{
	average_calories=(monday+tuesday+wednesday+thursday+friday+saturday+sunday)/7;
	Weightloss_in_kg=(float) (((maintanace_calories-average_calories)*7.0)/7700.0);
}
}
