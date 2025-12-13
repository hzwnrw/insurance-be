package com.hzwnrw.insurance.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InsuranceDTO {
    private long id;
    private String name;
    private String category;
    private double price;

    public InsuranceDTO(long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }


}
