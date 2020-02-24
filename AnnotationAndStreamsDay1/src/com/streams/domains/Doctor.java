package com.streams.domains;

public class Doctor {

	private String doctorId;
	private String name;
	private String speciality;

	public Doctor(String doctorId, String name, String speciality) {
		this.doctorId = doctorId;
		this.name = name;
		this.speciality = speciality;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[doctorId=" + doctorId + ", name=" + name + ", speciality=" + speciality + "]";
	}

}
