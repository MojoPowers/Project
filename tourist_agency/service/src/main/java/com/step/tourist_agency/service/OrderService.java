package com.step.tourist_agency.service;

import com.step.tourist_agency.Dto.OrderDto;
import com.step.tourist_agency.Dto.OrderTravelDto;
import com.step.tourist_agency.Dto.TravelDto;

import java.util.List;

public interface OrderService {
    OrderDto findOne(Long id);

    OrderTravelDto findOneFull(Long id);

    List<OrderDto> findAll();

    List<OrderTravelDto> findAllFull();

    OrderDto save(OrderDto orderDto);

    void remove(Long id);
}