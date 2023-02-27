package com.project.fitra.FitraModel;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(
{
	"Meal Name","ID","Time Required(Mins)","Required Items"

})
public class MealModel {
	@JsonProperty("Time Required(Mins)")
	int cooking_time_in_mins;

	public MealModel( int id, String mealName, List<String> requiredItem,
			List<String> procedure,int cooking_time_in_mins) {
		super();
		this.cooking_time_in_mins = cooking_time_in_mins;
		Id = id;
		MealName = mealName;
		RequiredItem = requiredItem;
		Procedure = procedure;
	}
	public int getCooking_time_in_mins() {
		return cooking_time_in_mins;
	}
	public void setCooking_time_in_mins(int cooking_time_in_mins) {
		this.cooking_time_in_mins = cooking_time_in_mins;
	}
	@JsonProperty("ID")
	int Id;
	@JsonProperty("Meal Name")
	String MealName;
	@JsonProperty("Required Item")
	List<String> RequiredItem=new ArrayList<>();
	@JsonProperty("Procedure")
	List<String> Procedure=new ArrayList<>();
	@JsonProperty("ID")
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@JsonProperty("Meal Name")
	public String getMealName() {
		return MealName;
	}
	public void setMealName(String mealName) {
		MealName = mealName;
	}
	@Override
	public String toString() {
		return "MealModel [cooking_time_in_mins=" + cooking_time_in_mins + ", Id=" + Id + ", MealName=" + MealName
				+ ", RequiredItem=" + RequiredItem + ", Procedure=" + Procedure + "]";
	}
	@JsonProperty("Required Item")
	public List<String> getRequiredItem() {
		return RequiredItem;
	}
	public void setRequiredItem(List<String> requiredItem) {
		RequiredItem = requiredItem;
	}
	@JsonProperty("Procedure")
	public List<String> getProcedure() {
		return Procedure;
	}
	public void setProcedure(List<String> procedure) {
		Procedure = procedure;
	}
}
