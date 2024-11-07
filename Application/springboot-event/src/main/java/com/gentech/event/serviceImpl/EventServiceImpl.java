package com.gentech.event.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gentech.event.dto.EventDto;
import com.gentech.event.entity.Event;
import com.gentech.event.mapper.EventMapper;
import com.gentech.event.repository.EventRepository;
import com.gentech.event.service.EventService;
@Service
public class EventServiceImpl implements EventService {
	@Autowired
	private EventRepository eventRepository; 
	
	@Override
	public EventDto createEvent(EventDto eventDto) {
		Event event=EventMapper.mappedToEvent(eventDto);
		Event savedEvent=eventRepository.save(event);
		return EventMapper.mappedToEventDto(savedEvent);
	}

	@Override
	public EventDto getSpecificEvent(Long id) {
		Event event=eventRepository.findById(id).orElseThrow(() -> new RuntimeException("The given Id "+id+" is not fount in database"));
		return EventMapper.mappedToEventDto(event);
	}

	@Override
	public List<EventDto> getAllEvent() {
		return  eventRepository.findAll()
						.stream()
						.map((event) -> EventMapper.mappedToEventDto(event))
						.collect(Collectors.toList());
		
	}

	@Override
	public EventDto updateEvent(EventDto eventDto, Long id) {
		Event event=eventRepository.findById(id).orElseThrow(() -> new RuntimeException("The given Id "+id+" is not fount in database"));

		event.setName(eventDto.getName());
		event.setLocation(eventDto.getLocation());
		event.setStatus(eventDto.getStatus());
		Event savedEvent=eventRepository.save(event);
		return EventMapper.mappedToEventDto(savedEvent);
	}

	@Override
	public void deleteEvent(Long id) {
		eventRepository.findById(id).orElseThrow(() -> new RuntimeException("The given Id "+id+" is not fount in database"));
		eventRepository.deleteById(id);
		
	}

	@Override
	public List<EventDto> getEventsByEventName(String name) {
		
		return eventRepository.findByName(name)
				.stream()
				.map((event)-> EventMapper.mappedToEventDto(event))
				.collect(Collectors.toList());
				
	}

	@Override
	public List<EventDto> getEventsByEventLocation(String loc) {
		
		return eventRepository.findByLocation(loc)
				.stream()
				.map((event) ->EventMapper.mappedToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public List<EventDto> getEventsByStatus(String status) {
		
		return eventRepository.findByStatus(status)
				.stream()
				.map((event) -> EventMapper.mappedToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public List<EventDto> getEventsByNameAndLocation(String name, String location) {
		
		return eventRepository.findByNameAndLocation(name, location)
				.stream()
				.map((event) -> EventMapper.mappedToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public List<EventDto> getEventsByNameAndLocationAndStatus(String name, String location, String status) {
		
		return eventRepository.findByNameAndLocationAndStatus(name, location, status)
				.stream()
				.map((event) -> EventMapper.mappedToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public List<EventDto> getAllEvents(String field) {
		return  eventRepository.findAll(Sort.by(Sort.Direction.ASC ,field))
				.stream()
				.map((event) -> EventMapper.mappedToEventDto(event))
				.collect(Collectors.toList());
		
	}
	public List<EventDto> getEventsWithPagenation(int pageNum,int eventSize)
	{
//		PageRequest resource=PageRequest.of(pageNum, eventSize);
		return eventRepository.findAll(PageRequest.of(pageNum, eventSize))
				.stream()
				.map((event) -> EventMapper.mappedToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public List<EventDto> getEventsWithPagenationAndSort(int pageNum, int eventSize, String columnName) {
		Sort sort=Sort.by(Sort.Direction.ASC, columnName);
//		return eventRepository.findAll(PageRequest.of(pageNum, eventSize).withSort(Sort.by(Sort.Direction.ASC, columnName)))

		return eventRepository.findAll(PageRequest.of(pageNum, eventSize,sort))
				.stream()
				.map((event) -> EventMapper.mappedToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public List<EventDto> getAllEventsByNameorLocation(String name, String loc) {
		
		return eventRepository.getAllEventsByNameAndLocation(name, loc)
				.stream()
				.map((event) -> EventMapper.mappedToEventDto(event))
				.collect(Collectors.toList());
	}

	@Override
	public Integer getDeleteByName(String name) {
		return eventRepository.getDeleteByCustomerName(name);
		 
	}

	@Override
	public Integer updateLocationByName(String loc, String name) {
		
		return eventRepository.updateLocationByName(loc, name);
	}

	@Override
	public Integer updateNameAndStatusById(String name, String status, Long id) {
		
		return eventRepository.updateNameAndStatusById(name, status, id);
	}
	
	
}
