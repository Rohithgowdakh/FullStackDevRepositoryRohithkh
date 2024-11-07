package com.gentech.event.service;

import java.util.List;

import com.gentech.event.dto.EventDto;

public interface EventService {
	
	EventDto createEvent(EventDto eventDto);
	
	EventDto getSpecificEvent(Long id);
	
	List<EventDto> getAllEvent();
	
	EventDto updateEvent(EventDto eventDto,Long id);
	
	void deleteEvent(Long id);
	
	List<EventDto> getEventsByEventName(String name);
	
	List<EventDto> getEventsByEventLocation(String loc);
	
	List<EventDto> getEventsByStatus(String status);
	
	List<EventDto> getEventsByNameAndLocation(String name,String location);
	
	List<EventDto> getEventsByNameAndLocationAndStatus(String name,String location,String status);
	
	List<EventDto> getAllEvents(String field);
	
	 List<EventDto> getEventsWithPagenation(int pageNum,int eventSize);
	 
	 List<EventDto> getEventsWithPagenationAndSort(int pageNum,int eventSize,String columnName);
	 
	 List<EventDto> getAllEventsByNameorLocation(String name,String loc);
	 
	 Integer getDeleteByName(String name);
	 
	 Integer updateLocationByName(String loc,String name);
	 
	 Integer updateNameAndStatusById(String name,String status ,Long id);
}
