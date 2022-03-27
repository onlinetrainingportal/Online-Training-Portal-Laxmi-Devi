package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Model.Trainer;


	@Repository
	public interface TrainerRepository extends JpaRepository<Trainer, String> {

		Trainer findByNameAndPassword(String UserName, String password);

	}



