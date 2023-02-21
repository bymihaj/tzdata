package com.bymihaj.tzdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {

    @Autowired
    private RecordService recordService;
    
    @GetMapping({"search/vin/{vin}"})
    public Object searchByVin(@PathVariable String vin) {
        return recordService.searchByVin(vin);
    }
    
    @GetMapping({"search/regnum/{regnum}"})
    public Object searchByRegNum(@PathVariable String regnum) {
        return recordService.searchByRegNumber(regnum);
    }
}
