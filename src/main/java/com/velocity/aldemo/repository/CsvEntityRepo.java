package com.velocity.aldemo.repository;


import com.velocity.aldemo.domain.CsvEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CsvEntityRepo extends JpaRepository<CsvEntity, Long> {
}
