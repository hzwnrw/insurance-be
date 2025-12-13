package com.hzwnrw.insurance.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClaimDTO {

    private Long id;
    private String name;
    private String policyID;
    private String claimReason;
    private double claimAmount;
    private String status;

    public ClaimDTO(Long id, String name, String policyID, String claimReason, double claimAmount, String status) {
        this.id = id;
        this.name = name;
        this.policyID = policyID;
        this.claimReason = claimReason;
        this.claimAmount = claimAmount;
        this.status = status;
    }
}
