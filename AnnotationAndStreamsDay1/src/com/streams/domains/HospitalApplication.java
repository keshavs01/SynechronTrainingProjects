package com.streams.domains;

public class HospitalApplication {
	
	public static void main(String[] args) {
		
		DoctorManager doctorMgr = new DoctorManager();
		PatientManager patientMgr = new PatientManager();
		
		System.out.println("******************");
		System.out.println("All Doctors");
		System.out.println(doctorMgr.getDoctor());		
		System.out.println("Doctor with Id:D0101 - "+doctorMgr.getDoctor("D101"));
		System.out.println("Doctor with Id:D0102 - "+doctorMgr.getDoctor("D102"));
		
		System.out.println("******************");
		System.out.println("All Patients");
		System.out.println(patientMgr.getPatient());		
		System.out.println("Patient with Id:21 - "+patientMgr.getPatient(21));
		System.out.println("Patient with Id:22 - "+patientMgr.getPatient(22));
		
		System.out.println("******************");
//		System.out.println(doctorMgr.getDoctorsSpeciality());		
		System.out.println("Doctor with �PD - "+doctorMgr.getDoctorsSpeciality("�PD"));
		System.out.println("Doctor with Child - "+doctorMgr.getDoctorsSpeciality("Child"));
		
		
		System.out.println("******************");		
		System.out.println("Senior Citizen for Dr.Subhas "+doctorMgr.getSeniorCitizenPatient("Subhas Pandey"));
		System.out.println("Senior Citizen for Dr.Priyanka "+doctorMgr.getSeniorCitizenPatient("Priyanka Dhamankar"));
		
	}
	
}
