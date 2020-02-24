package com.streams.domains;

public class Patient {

	private int id;
	private String name;
	private String doctorId;
	private int age;
	
	public Patient() {	
	}

	public Patient(int id, String name, String doctorId, int age) {
		super();
		this.id = id;
		this.name = name;
		this.doctorId = doctorId;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", doctorId=" + doctorId + ", age=" + age + "]";
	}
}
