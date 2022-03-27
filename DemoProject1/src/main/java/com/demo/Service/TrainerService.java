package com.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Model.Trainer;
import com.demo.Repository.TrainerRepository;




	@Service
	public class TrainerService {

		@Autowired
		TrainerRepository repo;

		public Trainer addTrainer(Trainer t) {
			Trainer tr = repo.save(t);
			return tr;
		}

		public Trainer login(String UserName, String password) {
			Trainer obj = repo.findByNameAndPassword(UserName, password);
			return obj;
		}

	}



