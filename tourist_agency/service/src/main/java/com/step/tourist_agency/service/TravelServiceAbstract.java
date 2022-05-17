package com.step.tourist_agency.service;

import com.step.tourist_agency.Dto.TravelDto;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface TravelServiceAbstract {

    TravelDto save(TravelDto entity);

    List<TravelDto> findAllTravel();

    List<TravelDto> findAllByType(String type);

    List<TravelDto> findAll(Sort sort);

    Optional<TravelDto> findById(Long id);

    void deleteById(Long id);

}