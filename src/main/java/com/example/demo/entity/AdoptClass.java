package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="AdoptClass")
public class AdoptClass {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adopt_id;
	private int pet_id;
	private int owner_id;
	@Lob
    private byte[] image;
	private String pet_name;
	private String adopt_name;
	private String contact;
	private String adopt_city;
	private String mail;
	private String reason;
	
	public int getAdopt_id() {
		return adopt_id;
	}
	public void setAdopt_id(int adopt_id) {
		this.adopt_id = adopt_id;
	}
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
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getPet_name() {
		return pet_name;
	}
	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}
	public String getAdopt_name() {
		return adopt_name;
	}
	public void setAdopt_name(String adopt_name) {
		this.adopt_name = adopt_name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAdopt_city() {
		return adopt_city;
	}
	public void setAdopt_city(String adopt_city) {
		this.adopt_city = adopt_city;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public AdoptClass() {
		
	}
	public AdoptClass(int adopt_id, int pet_id, int owner_id, byte[] image, String pet_name, String adopt_name,
			String contact, String adopt_city, String mail, String reason) {
		
		this.adopt_id = adopt_id;
		this.pet_id = pet_id;
		this.owner_id = owner_id;
		this.image = image;
		this.pet_name = pet_name;
		this.adopt_name = adopt_name;
		this.contact = contact;
		this.adopt_city = adopt_city;
		this.mail = mail;
		this.reason = reason;
	}
	
	
	
}
