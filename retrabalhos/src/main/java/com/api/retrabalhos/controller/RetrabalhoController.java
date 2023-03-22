package com.api.retrabalhos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.retrabalhos.entity.RetrabalhoEntity;
import com.api.retrabalhos.service.RetrabalhoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/retrabalho")
public class RetrabalhoController {

	@Autowired
	private RetrabalhoService retrabalhoService;
	
	@PostMapping("/save")
	public ResponseEntity<RetrabalhoEntity> saveRetrabalho(@RequestBody @Valid RetrabalhoEntity retrabalho){
		
		RetrabalhoEntity retrabalhoResponse = retrabalhoService.saveRetrabalho(retrabalho);
		
		return ResponseEntity.status(HttpStatus.OK).body(retrabalhoResponse);
		
	}
	
}
