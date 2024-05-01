package com.rayen.boisson.repos;

import com.rayen.boisson.entities.Boisson;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoissonRepository extends JpaRepository<Boisson,Long> {
  

}
