package com.step.tourist_agency.service;

import com.step.tourist_agency.Dto.TravelDto;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface TravelService {

    TravelDto findOne(Long id);

    List<TravelDto> findAll(Sort sort);

    List<TravelDto> findAllByOrder(Long orderId);

    TravelDto save(TravelDto travelDto);

    void remove(Long id);
}