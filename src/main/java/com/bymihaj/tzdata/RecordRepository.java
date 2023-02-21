package com.bymihaj.tzdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long>{

    List<Record> findByVin(String vin);
    List<Record> findByRegNew(String regNumber);
}
