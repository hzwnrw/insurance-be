//package com.hzwnrw.insurance.mapper;
//
//import com.hzwnrw.insurance.dto.InsuranceDTO;
//import com.hzwnrw.insurance.model.Insurance;
//
//import java.text.SimpleDateFormat;
//
//public class InsuranceMapper {
//
//    private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//
//    public static InsuranceDTO toDTO(Insurance insurance){
//        return new InsuranceDTO(
//                insurance.getId(),
//                insurance.getName(),
//                insurance.getCategory(),
//                insurance.getPrice()
//        );
//    }
//
//    public static Insurance toEntity(InsuranceDTO dto){
//        return Insurance.builder()
////                .id(dto.getId())
//                .name(dto.getName())
//                .category(dto.getCategory())
//                .price(dto.getPrice())
//                .build();
//    }
//}
