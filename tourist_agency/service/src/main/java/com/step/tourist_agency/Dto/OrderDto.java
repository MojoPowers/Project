package com.step.tourist_agency.Dto;


import com.step.tourist_agency.Dto.parent.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto extends BaseDto {

    private CustomerDto customer;
    private LogDto log;
}