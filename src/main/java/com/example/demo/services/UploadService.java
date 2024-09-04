package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UploadClass;
import com.example.demo.repository.UploadRepository;

@Service
public class UploadService {
	@Autowired
	private UploadRepository uploadRepo;

	
	public UploadClass uploadPets(UploadClass uploads) {
		return uploadRepo.save(uploads);
		
	}
	
	public List<UploadClass> viewPets() {
		return uploadRepo.findAll();
		
	}
	
	public void deletePetById(int pet_id) {
		uploadRepo.deleteById(pet_id);
	}
}
