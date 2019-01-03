package com.velocity.aldemo.repository;


import com.velocity.aldemo.entity.CsvEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CsvEntityRepo extends JpaRepository<CsvEntity, Long> {
}
