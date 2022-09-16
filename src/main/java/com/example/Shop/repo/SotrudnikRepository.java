package com.example.Shop.repo;

import com.example.Shop.Models.Personal;
import org.springframework.data.repository.CrudRepository;

public interface SotrudnikRepository extends CrudRepository<Personal, Long> {
}
