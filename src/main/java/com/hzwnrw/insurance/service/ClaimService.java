package com.hzwnrw.insurance.service;

import com.hzwnrw.insurance.dto.ClaimDTO;
import com.hzwnrw.insurance.exception.ResourceNotFoundException;
import com.hzwnrw.insurance.mapper.GenericMapper;
import com.hzwnrw.insurance.model.Claim;
import com.hzwnrw.insurance.repository.ClaimRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClaimService {

    private final ClaimRepository claimRepository;

    public ClaimService(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    public Page<ClaimDTO> getAllClaims(Pageable pageable) {
        return claimRepository.findAll(pageable)
                .map(entity -> GenericMapper.mapToDTO(entity, ClaimDTO.class));
    }


    public ClaimDTO createClaim(ClaimDTO dto) {
        Claim entity = GenericMapper.mapToEntity(dto, Claim.class);
        Claim saved = claimRepository.save(entity);
        return GenericMapper.mapToDTO(saved, ClaimDTO.class);
    }

    public ClaimDTO updateStatus(Long claimId, String status) {
        Claim claim = claimRepository.findById(claimId)
                .orElseThrow(() -> new ResourceNotFoundException("Claim not found with id " + claimId));

        claim.setStatus(status);
        Claim updatedClaim = claimRepository.save(claim);

        return GenericMapper.mapToDTO(updatedClaim,ClaimDTO.class);
    }

}
