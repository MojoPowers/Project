package com.step.tourist_agency.converter;

import com.step.tourist_agency.Dto.OrderDto;
import com.step.tourist_agency.Dto.OrderTravelDto;
import com.step.tourist_agency.converter.Customer.DateTimeMapper;
import com.step.tourist_agency.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", uses = {
        CustomerConverter.class,
        DateTimeMapper.class
})
public interface OrderConverter {

    Order convert(OrderDto source);

    @Mapping(source = "dateCreation", target = "log.dateCreation")
    @Mapping(source = "lastModified", target = "log.lastModified")
    @Mapping(source = "version", target = "log.version")
    OrderDto convert(Order source);

    @Mapping(source = "dateCreation", target = "log.dateCreation")
    @Mapping(source = "lastModified", target = "log.lastModified")
    @Mapping(source = "version", target = "log.version")
    OrderTravelDto convertFull(Order source);
}