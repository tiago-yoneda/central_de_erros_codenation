package com.codenation.central.mapper;

import com.codenation.central.dto.EventDTO;
import com.codenation.central.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface EventMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "level", target = "level"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "origem", target = "origem"),
            @Mapping(source = "createdAt", target = "createdAt", dateFormat = "yyyy-MM-dd HH:mm"),
    })

    EventDTO map(Event event);

    List<EventDTO> map(List<Event> events);
}
