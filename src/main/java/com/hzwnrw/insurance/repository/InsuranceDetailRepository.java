package com.hzwnrw.insurance.repository;

import com.hzwnrw.insurance.model.InsuranceDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceDetailRepository extends JpaRepository<InsuranceDetail, Long> {
}
