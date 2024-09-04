package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AdoptClass;
import com.example.demo.repository.AdoptRepository;

@Service
public class AdoptService {
    @Autowired
    private AdoptRepository adoptRepo;

    public AdoptClass adoptProcess(AdoptClass adopts) {
        return adoptRepo.save(adopts);
    }

    public List<AdoptClass> notifications(int owner_id) {
        return adoptRepo.notificationsByOwner(owner_id);
    }

    public List<AdoptClass> viewNotifications() {
        return adoptRepo.findAll();
    }
    
    public void deleteById(int pet_id) {
    	adoptRepo.deleteById(pet_id);
    }
}
