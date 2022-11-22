package com.codeup.springpractice.repositories;

import com.codeup.springpractice.models.NationalParks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParksRepository  extends JpaRepository<NationalParks, Long>{
}
