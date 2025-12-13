package com.hzwnrw.insurance.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "insurance_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsuranceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "insurance_id", nullable = false)
    private Long insuranceId;

    @Column(name = "coverage_details")
    private String coverageDetails;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Column(name = "premium_amount", nullable = false)
    private double premiumAmount;

    @Column(name = "coverage_limit", nullable = false)
    private double coverageLimit;

    @Column(name = "policy_status", nullable = false)
    private String policyStatus;
}
