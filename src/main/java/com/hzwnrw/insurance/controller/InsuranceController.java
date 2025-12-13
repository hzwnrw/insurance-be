package com.hzwnrw.insurance.controller;

import com.hzwnrw.insurance.dto.InsuranceDTO;
import com.hzwnrw.insurance.dto.InsuranceDetailDTO;
import com.hzwnrw.insurance.service.InsuranceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/insurance")
public class InsuranceController {

    private final InsuranceService insuranceService;
    public InsuranceController(InsuranceService insuranceService){
        this.insuranceService = insuranceService;
    }

    @PostMapping("/add")
    public ResponseEntity<InsuranceDTO> createInsurance(@RequestBody InsuranceDTO insurance){
        return ResponseEntity.ok(insuranceService.createInsurance(insurance));
    }

    @GetMapping("/all")
    public List<InsuranceDTO> getAllInsurance() {
        return insuranceService.getAllInsurance();
    }


    @GetMapping("/detail/{id}")
    public ResponseEntity<InsuranceDetailDTO> getInsuranceDetail(@PathVariable Long id) {
        InsuranceDetailDTO detail = insuranceService.getInsuranceDetailById(id);
        if (detail != null) {
            return ResponseEntity.ok(detail);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
