package com.demo.crudapp.endpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.crudapp.bean.CandidateDetails;
import com.demo.crudapp.service.DemoService;

@RestController
public class Endpoint {
	
	@Autowired
	private DemoService demoService;

	@GetMapping("/greeting")
	public String greeting() {
		return "Keep Hustling";
	}
	
	@GetMapping("/practice_1")
	public String firstOne() {
		return "You are doing good";
	}
	
//	@GetMapping("/get_details")
//	public CandidateDetails detailsByClass() {
//		return demoService.saveAllDetails();
//	}
	@PostMapping("/save_data")
	public ResponseEntity saveCandiData(@RequestBody CandidateDetails candidate) {
		demoService.saveCandidateDetails(candidate);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	@GetMapping("/fetch_userdata/{rollNo}")
	public Optional<CandidateDetails> retrieveUserDataById(@PathVariable("rollNo") int rollNo){
		return demoService.fetchUserByRoll(rollNo);
	}
	@DeleteMapping("/delete_data/{rollNo}")
	public void deleteCandiData(@PathVariable("rollNo") int rollNo) {
		demoService.deleteCandidateDetails(rollNo);
	}
	@PutMapping("/update_table")
	public String updateData(@RequestBody CandidateDetails candidate1) {
		if(demoService.updateDetails(candidate1)){
			return "Saved";
			} else { 
				return "Successfully Updated";
			}
	}
	@GetMapping("/get_alldata")
	public List<CandidateDetails> getAllData(){
		return demoService.returnAllDetails();
	}
	@GetMapping("/get_specified/{rollNo}/{fName}")
	public CandidateDetails fetchByTwo (@PathVariable int rollNo,@PathVariable String fName){
		return demoService.fetchByTwoVar(rollNo,fName);
	}
	@GetMapping("/fetch_specified_second/{age}/{age}/{age}")
	public CandidateDetails fetchByAge(@PathVariable int age1,@PathVariable int age2,@PathVariable int age3) {
		return demoService.fetchAge(age1,age2,age3);
	}
	
	
	@GetMapping("/if_exist/{rollNo}")
	public boolean checking(@PathVariable("rollNo") int rollNo) {
		return demoService.ifExists(rollNo);
	}
}
