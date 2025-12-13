package com.hzwnrw.insurance.service;

import com.hzwnrw.insurance.dto.InsuranceDTO;
import com.hzwnrw.insurance.dto.InsuranceDetailDTO;
import com.hzwnrw.insurance.mapper.GenericMapper;
import com.hzwnrw.insurance.model.Insurance;
import com.hzwnrw.insurance.repository.InsuranceDetailRepository;
import com.hzwnrw.insurance.repository.InsuranceRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final InsuranceDetailRepository insuranceDetailRepository;

    public InsuranceService(InsuranceRepository insuranceRepository, InsuranceDetailRepository insuranceDetailRepository) {
        this.insuranceRepository = insuranceRepository;
        this.insuranceDetailRepository = insuranceDetailRepository;
    }

    public List<InsuranceDTO> getAllInsurance() {
        return insuranceRepository.findAll()
                .stream()
                .map(entity -> GenericMapper.mapToDTO(entity, InsuranceDTO.class))
                .collect(Collectors.toList());
    }

    public InsuranceDTO createInsurance(InsuranceDTO dto) {
        Insurance entity = GenericMapper.mapToEntity(dto, Insurance.class);
        Insurance saved = insuranceRepository.save(entity);
        return GenericMapper.mapToDTO(saved, InsuranceDTO.class);
    }

    public InsuranceDetailDTO getInsuranceDetailById(Long id) {
        return insuranceDetailRepository.findById(id)
                .map(entity -> GenericMapper.mapToDTO(entity, InsuranceDetailDTO.class))
                .orElse(null);
    }

}
