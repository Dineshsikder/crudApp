package com.demo.crudapp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.crudapp.bean.CandidateDetails;

public interface DataRepository extends JpaRepository<CandidateDetails, Integer> {

	CandidateDetails findByRollNoAndFirstName(int rollNo, String fName);

	CandidateDetails findByAge(int age1, int age2, int age3);

}
