package com.step.tourist_agency.controller;

import com.step.tourist_agency.Dto.TravelDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface TravelController {

    @GetMapping("/one")
    ResponseEntity<TravelDto> findOne(@RequestParam("id") Long id);

    @GetMapping("/all")
    ResponseEntity<List<TravelDto>> findAll(@RequestParam("orderId") Long orderId);

    @PostMapping("/save")
    ResponseEntity<TravelDto> save(@RequestBody TravelDto itemDto);

    @DeleteMapping("/remove")
    void remove(@RequestParam("id") Long id);

}