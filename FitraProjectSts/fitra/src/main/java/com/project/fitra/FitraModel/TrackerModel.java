package com.project.fitra.FitraModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tracker")
public class TrackerModel {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	public TrackerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="email")
	String email;
	int Target_Calories;
	int Had_Calories;
	int Remaining_Calories;
	
	
	public int getTarget_Calories() {
		return Target_Calories;
	}
	public void setTarget_Calories(int target_Calories) {
		Target_Calories = target_Calories;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRemaining_Calories(int remaining_Calories) {
		Remaining_Calories = remaining_Calories;
	}
	public int getHad_Calories() {
		return Had_Calories;
	}
	public void setHad_Calories(int had_Calories) {
		Had_Calories = had_Calories;
	}
	public int getRemaining_Calories() {
		return Remaining_Calories;
	}
	public TrackerModel(int target_Calories, int had_Calories,int remaining_Calories) {
		super();
		Target_Calories = target_Calories;
		Had_Calories = had_Calories;
		remaining_Calories=Remaining_Calories;
	}
	public void addCalories(int n)
	{
		Remaining_Calories-=n;
		Had_Calories+=n;
	}
	@Override
	public String toString() {
		return "TrackerModel [Target_Calories=" + Target_Calories + ", Had_Calories=" + Had_Calories
				+ ", Remaining_Calories=" + Remaining_Calories + "]";
	}
	
}
