package com.hzwnrw.insurance.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "claim")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "policy_id", nullable = false)
    private String policyID;

    @Column(name = "claim_reason", nullable = false)
    private String claimReason;

    @Column(name = "claim_amount", nullable = false)
    private double claimAmount;

    @Column(name = "status")
    private String status;
}
