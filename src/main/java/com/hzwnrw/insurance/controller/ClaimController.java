package com.hzwnrw.insurance.controller;

import com.hzwnrw.insurance.dto.ClaimDTO;
import com.hzwnrw.insurance.service.ClaimService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claim")
public class ClaimController {

    private final ClaimService claimService;

    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @GetMapping("/all")
    public ResponseEntity<Page<ClaimDTO>> getAllClaims(Pageable pageable) {
        Page<ClaimDTO> claims = claimService.getAllClaims(pageable);
        return ResponseEntity.ok(claims);
    }

    @PostMapping("/add")
    public ResponseEntity<ClaimDTO> createClaim(@RequestBody ClaimDTO claim){
        return ResponseEntity.ok(claimService.createClaim(claim));
    }

    @PutMapping("/{id}/status")
    public ClaimDTO updateStatus(@PathVariable Long id, @RequestParam String status) {
        return claimService.updateStatus(id, status);
    }
}
