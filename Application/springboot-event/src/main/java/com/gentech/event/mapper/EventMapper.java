package com.gentech.event.mapper;

import com.gentech.event.dto.EventDto;
import com.gentech.event.entity.Event;

public class EventMapper {
	
	public static Event mappedToEvent(EventDto eventDto)
	{
		Event event=new Event(
				eventDto.getId(),
				eventDto.getName(),
				eventDto.getLocation(),
				eventDto.getStatus(),
				eventDto.getCreatedAt(),
				eventDto.getUpdatedAt());
		return event;
	}
	
	public static EventDto mappedToEventDto(Event event)
	{
		EventDto eventDto=new EventDto(
				event.getId(),
				event.getName(),
				event.getLocation(),
				event.getStatus(),
				event.getCreatedAt(),
				event.getUpdatedAt()); 
		return eventDto;
	}
}
