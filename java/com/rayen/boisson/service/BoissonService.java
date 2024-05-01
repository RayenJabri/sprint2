package com.rayen.boisson.service;
import java.util.List;
import com.rayen.boisson.entities.Boisson;


public interface BoissonService {

        Boisson saveBoisson(Boisson b);
    Boisson updateBoisson(Boisson b);
    void deleteBoisson(Boisson b);
    void deleteBoissonById(Long id);
    Boisson getBoisson(Long id);
    List<Boisson> getAllBoisson();
   

}
