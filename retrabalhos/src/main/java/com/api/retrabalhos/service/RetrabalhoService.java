package com.api.retrabalhos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.retrabalhos.entity.RetrabalhoEntity;
import com.api.retrabalhos.repository.RetrabalhoRepository;

@Service
public class RetrabalhoService {

	@Autowired
	private RetrabalhoRepository retrabalhoRepository;
	
	public RetrabalhoEntity saveRetrabalho(RetrabalhoEntity retrabalho) {
		
		return retrabalhoRepository.save(retrabalho);
		
	}
	
}
