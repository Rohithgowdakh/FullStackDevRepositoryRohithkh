package com.gentech.event.EventUnitTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import com.gentech.event.entity.Event;
import com.gentech.event.repository.EventRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EventUnitTest {
	
	@LocalServerPort
	private int port;
	
	private String baseURL="http://localhost";
	
	private static RestTemplate restTemplate;
	
	@Autowired
	private EventRepository eventRepository;
	
	@BeforeAll
	public static void initialization()
	{
		restTemplate=new RestTemplate();
	}
	
	@BeforeEach
	public void setUp()
	{
		baseURL=baseURL+":"+port+"/v1/api/event";
	}
	
//	@AfterEach
//	public void tearDown()
//	{
//		eventRepository.deleteAll();
//	}
	
	@Test
	void shouldCreateEvent()
	{
		Event event=new Event();
		event.setName("House Warming");
		event.setStatus("Active");
		event.setLocation("Russia");
		
		Event newEvent=restTemplate.postForObject(baseURL, event, Event.class);
//		EventDto eevd=EventMapper.mappedToEventDto(newEvent);
		assertNotNull(newEvent);
		assertThat(newEvent.getId()).isNotNull();
		assertEquals("House Warming", newEvent.getName());
		
		eventRepository.deleteById(newEvent.getId());
	}
	
	@Test
	void shouldDisplayAllEventTest()
	{
		Event event=new Event();
		event.setName("House Warming");
		event.setStatus("Active");
		event.setLocation("Russia");
		
		Event event1=new Event();
		event1.setName("New Year");
		event1.setStatus("Active");
		event1.setLocation("Ukraine");
		
		Event newEvent=restTemplate.postForObject(baseURL, event, Event.class);
		
		Event newEvent2=restTemplate.postForObject(baseURL, event, Event.class);
		
		
		List<Event> list=restTemplate.getForObject(baseURL+"s", List.class);
		assertNotNull(list);
		assertThat(list.size()).isEqualTo(eventRepository.findAll().size());
		
		eventRepository.deleteById(newEvent.getId());
		eventRepository.deleteById(newEvent2.getId());
	}
	
	@Test
	void shouldDisplayOneEventTest()
	{
		Event event=new Event();
		event.setName("House Warming");
		event.setStatus("Active");
		event.setLocation("Russia");
		
		Event newEvent=restTemplate.postForObject(baseURL, event, Event.class);
		Event existingEvent=restTemplate.getForObject(baseURL+"/"+newEvent.getId(), Event.class);
		
		assertNotNull(existingEvent);
		assertEquals("House Warming",existingEvent.getName());
		eventRepository.deleteById(newEvent.getId());
	}
	
	@Test
	void shouldUpdateExistingEventTest()
	{
		Event event=new Event();
		event.setName("House Warming");
		event.setStatus("Active");
		event.setLocation("Russia"); 
		
		Event newEvent=restTemplate.postForObject(baseURL, event, Event.class);
		
		newEvent.setName("Birthday");
		
		restTemplate.put(baseURL+"/"+newEvent.getId(), newEvent,Event.class);
		
		assertEquals("Birthday", newEvent.getName());
		
		eventRepository.deleteById(newEvent.getId());
	}
	
	@Test
	void shouldDeleteEventTest()
	{
		Event event=new Event();
		event.setName("House Warming");
		event.setStatus("Active");
		event.setLocation("Russia"); 
		
		Event newEvent=restTemplate.postForObject(baseURL, event, Event.class);
		
		restTemplate.delete(baseURL+"/"+newEvent.getId());
		
		assertFalse(eventRepository.findById(newEvent.getId()).isPresent());
	}
}
