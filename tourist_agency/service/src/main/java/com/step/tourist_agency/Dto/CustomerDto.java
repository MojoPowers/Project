package com.step.tourist_agency.Dto;

import com.step.tourist_agency.Dto.parent.NameDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto extends NameDto {

    private LogDto log;
}
