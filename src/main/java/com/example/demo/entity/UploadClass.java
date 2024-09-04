package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="upload")
public class UploadClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pet_id;
    private int owner_id;
    private String pet_name;
    @Lob
    private byte[] image;
    private String age;
    private String color;
    private String gender;
    private String vaccinated;
    
	public int getPet_id() {
		return pet_id;
	}
	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public String getPet_name() {
		return pet_name;
	}
	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getVaccinated() {
		return vaccinated;
	}
	public void setVaccinated(String vaccinated) {
		this.vaccinated = vaccinated;
	}
	
	public UploadClass(int pet_id, int owner_id, String pet_name, byte[] image, String age, String color, String gender,
			String vaccinated) {
		
		this.pet_id = pet_id;
		this.owner_id = owner_id;
		this.pet_name = pet_name;
		this.image = image;
		this.age = age;
		this.color = color;
		this.gender = gender;
		this.vaccinated = vaccinated;
	}
	
	public UploadClass() {
	
	}

}