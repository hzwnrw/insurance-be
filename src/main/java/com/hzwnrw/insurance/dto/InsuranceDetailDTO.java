package com.hzwnrw.insurance.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class InsuranceDetailDTO {

    private long id;
    private Long insuranceId;
    private String coverageDetails;
    private LocalDate startDate;
    private LocalDate endDate;
    private double premiumAmount;
    private double coverageLimit;
    private String policyStatus;

    public InsuranceDetailDTO(long id, Long insuranceId, String coverageDetails, LocalDate startDate, LocalDate endDate, double premiumAmount, double coverageLimit, String policyStatus) {
        this.id = id;
        this.insuranceId = insuranceId;
        this.coverageDetails = coverageDetails;
        this.startDate = startDate;
        this.endDate = endDate;
        this.premiumAmount = premiumAmount;
        this.coverageLimit = coverageLimit;
        this.policyStatus = policyStatus;
    }
}
