package com.streams.domains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PatientManager {

	List<Patient> patientList = new ArrayList<Patient>();
	
	public PatientManager() {
		init();
	}
	
	private void init(){
		this.patientList.add(new Patient(21, "PN11", "D101",24));
		this.patientList.add(new Patient(22, "PN12", "D101",33));
		this.patientList.add(new Patient(23, "PN23", "D102",64));
		this.patientList.add(new Patient(24, "PN24", "D102",81));
		this.patientList.add(new Patient(25, "PN25", "D103",11));
		this.patientList.add(new Patient(26, "PN26", "D103",16));
		this.patientList.add(new Patient(27, "PN27", "D103",33));
		this.patientList.add(new Patient(28, "PN28", "D103",35));
		this.patientList.add(new Patient(29, "PN29", "D104",78));
		this.patientList.add(new Patient(30, "PN30", "D104",12));
		this.patientList.add(new Patient(31, "PN31", "D104",99));
	}
	
	public Map<Integer, String> getPatient(Integer ...id){
		Map<Integer, String> patientMap = new HashMap<>();
		
		if(id.length == 0){
			
			patientMap = this.patientList.stream()
					.collect(Collectors.toMap(Patient::getId, Patient::getName));
		} else {
			patientMap = this.patientList.stream()
					.filter((pat)-> pat.getId() == id[0])
					.collect(Collectors.toMap(Patient::getId, Patient::getName));
		}
		return patientMap;		
	}

	public List<Patient> getPatientList(){
		List<Patient> patientList = new ArrayList<>();
		patientList = this.patientList.stream().collect(Collectors.toList());
		return patientList;		
	}

}
