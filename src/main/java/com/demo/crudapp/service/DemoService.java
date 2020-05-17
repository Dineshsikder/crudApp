package com.demo.crudapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.crudapp.bean.CandidateDetails;
import com.demo.crudapp.repo.DataRepository;
@Service
public class DemoService {
	@Autowired
	private CandidateDetails candidate;
	
	@Autowired
	private DataRepository datarepo;
	
//	public CandidateDetails saveAllDetails() {
//		
//		CandidateDetails candidate = new CandidateDetails();
//		candidate.setRollNo(1);
//		candidate.setFirstName("Sourav");
//		candidate.setLastName("Chakladar");
//		candidate.setQualification("B.Tech");
//		candidate.setAddress("Kolkata");
//		candidate.setPhoneNo(99032564);
//		
//		return candidate;
//	}
	
	public void saveCandidateDetails(CandidateDetails candidate) {
		this.datarepo.save(candidate);
	}
	public Optional<CandidateDetails> fetchUserByRoll(int rollNo){
		return this.datarepo.findById(rollNo);
	}	
	public void deleteCandidateDetails (int rollNo) {
		this.datarepo.deleteById(rollNo);
	}
	public boolean ifExists(int rollNo) {
		return this.datarepo.existsById(rollNo);
	}
	public boolean updateDetails(CandidateDetails candidate1) {
			if(this.datarepo.existsById(candidate1.getRollNo())) {
				this.datarepo.save(candidate1);
				return true;
			}
			this.datarepo.save(candidate1);
			return false;
			 
	}
	public List<CandidateDetails> returnAllDetails() {
		return this.datarepo.findAll();
		}
	public CandidateDetails fetchByTwoVar(int rollNo, String fName) {
			return this.datarepo.findByRollNoAndFirstName(rollNo,fName);
	}
	public CandidateDetails fetchAge(int age1, int age2, int age3) {
		return this.datarepo.findByAge(age1,age2,age3);
	}
	
}
