package com.step.tourist_agency.Dto;

import com.step.tourist_agency.Dto.parent.NameDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TravelDto extends NameDto {

    private LogDto log;
}
