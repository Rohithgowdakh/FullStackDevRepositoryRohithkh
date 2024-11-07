package com.gentech.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.event.dto.EventDto;
import com.gentech.event.service.EventService;

@RestController
@RequestMapping("/v1/api")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@PostMapping("/event")
	public ResponseEntity<EventDto> createEvent(@RequestBody EventDto eventDto)
	{
		return new ResponseEntity<EventDto>(eventService.createEvent(eventDto),HttpStatusCode.valueOf(201));
	}
	
	@GetMapping("/event/{id}")
	public ResponseEntity<EventDto> getSpecificEvent(@PathVariable Long id)
	{
		return new ResponseEntity<EventDto>(eventService.getSpecificEvent(id),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/events")
	public ResponseEntity<List<EventDto>> getAllEvents()
	{
		return new ResponseEntity<List<EventDto>>(eventService.getAllEvent(),HttpStatusCode.valueOf(200));
	}
	
	
	@PutMapping("/event/{id}")
	public ResponseEntity<EventDto> updateEvent(@RequestBody EventDto eventDto,@PathVariable Long id)
	{
		
		return new ResponseEntity<EventDto>(eventService.updateEvent(eventDto,id),HttpStatusCode.valueOf(200));
	}
	
	@DeleteMapping("/event/{id}")
	public ResponseEntity<String> deleteEvent(@PathVariable Long id)
	{
		eventService.deleteEvent(id);
		return new ResponseEntity<String>("The given id "+id+" is deleted",HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/event/filterbyname")
	public ResponseEntity<List<EventDto>> getEventsByEventName(@RequestParam String name)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getEventsByEventName(name),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/event/filterbylocation")
	public ResponseEntity<List<EventDto>> getEventsByEventLocation(@RequestParam String location)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getEventsByEventLocation(location),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/event/filterbystatus")
	public ResponseEntity<List<EventDto>> getEventsByEventStatus(@RequestParam String status)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getEventsByStatus(status),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/event/filterbynameandlocation")
	public ResponseEntity<List<EventDto>> getEventsByNameAndLocation(@RequestParam String name,@RequestParam String location)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getEventsByNameAndLocation(name, location),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/event/filterbynameandlocationAndstatus")
	public ResponseEntity<List<EventDto>> getEventsByNameAndLocationAndStatus(@RequestParam String name,@RequestParam String location,@RequestParam String status)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getEventsByNameAndLocationAndStatus(name, location, status),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/event/all/{field}")
	public ResponseEntity<List<EventDto>> getAllEventsUseFieldName(@PathVariable String field) {
		return new ResponseEntity<List<EventDto>>(eventService.getAllEvents(field),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/event/filterbypagenation")
	public ResponseEntity<List<EventDto>> getAllEventWithPagenation(@RequestParam int pageNumber,@RequestParam int eventSize)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getEventsWithPagenation(pageNumber, eventSize),HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/event/filterbypagenationandsort")
	public ResponseEntity<List<EventDto>> getAllEventWithPagenationAndSort(@RequestParam int pageNumber,@RequestParam int eventSize,@RequestParam String column)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getEventsWithPagenationAndSort(pageNumber, eventSize, column),HttpStatus.OK);
	}
	
	@GetMapping("/event/query")
	public ResponseEntity<List<EventDto>> getAllEventsByNameAndLocation(@RequestParam String name,@RequestParam String loc)
	{
		return new ResponseEntity<List<EventDto>>(eventService.getAllEventsByNameorLocation(name, loc), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteevent")
	public ResponseEntity<String> getDeleteByName(@RequestParam String name)
	{
		Integer count=eventService.getDeleteByName(name);
		return new ResponseEntity<String>(count+" event records have deleted successfully ",HttpStatus.OK);
	}
	
	@PutMapping("/updateeventlocation")
	public ResponseEntity<String> updateLocationByName(@RequestParam String loc,@RequestParam String name)
	{
		Integer count=eventService.updateLocationByName(loc, name);
		return new ResponseEntity<String>(count+" event location have updated successfully",HttpStatus.OK);
	}
	
	@PutMapping("/event/updatenameandstatus")
	public ResponseEntity<String > updateNameAndStatusById(@RequestParam String name,@RequestParam String status,@RequestParam Long id)
	{
		Integer count=eventService.updateNameAndStatusById(name, status, id);
		return new ResponseEntity<String>(count+" event name and status have updated successfully",HttpStatus.OK);
	}
}