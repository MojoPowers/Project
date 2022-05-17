package com.step.tourist_agency.controller.impl;

import com.step.tourist_agency.Dto.TravelDto;
import com.step.tourist_agency.controller.TravelController;
import com.step.tourist_agency.service.TravelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travel")
public class TravelControllerImpl implements TravelController {

    private final TravelService travelService;

    public TravelControllerImpl(TravelService travelService) {
        this.travelService = travelService;
    }

    @Override
    public ResponseEntity<TravelDto> findOne(Long id) {
        return new ResponseEntity<>(travelService.findOne(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<TravelDto>> findAll(Long orderId) {
        return orderId == null ?
                new ResponseEntity<>(travelService.findAll(), HttpStatus.OK) :
                new ResponseEntity<>(travelService.findAllByOrder(orderId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TravelDto> save(TravelDto travelDto) {
        return new ResponseEntity<>(travelService.save(travelDto), HttpStatus.OK);
    }

    @Override
    public void remove(Long id) {
        travelService.remove(id);
    }
}