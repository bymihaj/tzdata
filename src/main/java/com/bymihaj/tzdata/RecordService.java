package com.bymihaj.tzdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;
    
    public Object searchByVin(String vin) {
        return recordRepository.findByVin(vin);
    }
    
    public Object searchByRegNumber(String regNumber) {
        return recordRepository.findByRegNew(regNumber);
    }
}
