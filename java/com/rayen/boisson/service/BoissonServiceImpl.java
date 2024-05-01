package com.rayen.boisson.service;


import com.rayen.boisson.entities.Boisson;

import com.rayen.boisson.repos.BoissonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoissonServiceImpl implements BoissonService{


    @Autowired
    BoissonRepository boissonRepository;
    @Override
    public Boisson saveBoisson(Boisson b) {
        return boissonRepository.save(b);
    }

    @Override
    public Boisson updateBoisson(Boisson b) {
        return boissonRepository.save(b);
    }

    @Override
    public void deleteBoisson(Boisson b) {
        boissonRepository.delete(b);
    }

    @Override
    public void deleteBoissonById(Long id) {
        boissonRepository.deleteById(id);

    }

    @Override
    public Boisson getBoisson(Long id) {
        return boissonRepository.findById(id).get();
    }

    @Override
    public List<Boisson> getAllBoisson() {
        return boissonRepository.findAll();
    }

   
}
