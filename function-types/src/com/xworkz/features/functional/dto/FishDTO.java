package com.xworkz.features.functional.dto;

import java.io.Serializable;

import com.xworkz.features.functional.dto.constants.FishType;
import com.xworkz.features.functional.dto.constants.Gender;

public class FishDTO  implements Serializable {

	private String name;
	private String color;
	private FishType type;
	private int lifeSpan;
	private double cost;
	private Gender gender;
	
	public FishDTO() {
		// TODO Auto-generated constructor stub
	}

	public FishDTO(String name, String color, FishType type, int lifeSpan, double cost, Gender gender) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.lifeSpan = lifeSpan;
		this.cost = cost;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "FishDTO [name=" + name + ", color=" + color + ", type=" + type + ", lifeSpan=" + lifeSpan + ", cost="
				+ cost + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public FishType getType() {
		return type;
	}

	public void setType(FishType type) {
		this.type = type;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
