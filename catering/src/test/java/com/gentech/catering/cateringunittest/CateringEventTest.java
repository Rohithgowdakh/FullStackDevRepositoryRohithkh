package com.gentech.catering.cateringunittest;

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

import com.gentech.catering.entity.Catering;
import com.gentech.catering.repository.CateringRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CateringEventTest {
	
	@LocalServerPort
	private int port;
	
	private String baseURL="http://localhost";
	
	private static RestTemplate restTemplate;
	
	@Autowired
	private CateringRepository cateringRepository;
	
	@BeforeAll
	public static void initialization()
	{
		restTemplate=new RestTemplate();
	}
	
	@BeforeEach
	public void setUp()
	{
		baseURL=baseURL+":"+port+"/v1/api/catering";
	}
	
//	@AfterEach
//	public void tearDown()
//	{
//		cateringRepository.deleteAll();
//	}
	
	@Test
	void shouldCreateCatering()
	{
		Catering catering=new Catering();
		catering.setName("Putin");
		catering.setLocation("Russia");
		catering.setItems("Missile Type Of Foods");
		catering.setAmount(999999);
		
		Catering newCatering=restTemplate.postForObject(baseURL, catering,Catering.class);
		
		assertNotNull(newCatering);
		assertEquals("Putin", newCatering.getName());
		assertThat(newCatering.getId()).isNotNull();
		
		cateringRepository.deleteById(newCatering.getId());
	}
	
	@Test
	void shoulDisplayAllCateringTest()
	{
		List<Catering> catering=restTemplate.getForObject(baseURL+"s", List.class);
		
		assertNotNull(catering);
		assertEquals(catering.size(), cateringRepository.findAll().size());
	}
	
	@Test
	void shouldDisplayOneCateringTest()
	{
		Catering catering=new Catering();
		catering.setName("Putin");
		catering.setLocation("Russia");
		catering.setItems("Missile Type Of Foods");
		catering.setAmount(999999);
		
		Catering newCatering=restTemplate.postForObject(baseURL, catering,Catering.class);
		
		restTemplate.getForObject(baseURL+"/"+newCatering.getId(), Catering.class);
		
		assertNotNull(newCatering);
		assertEquals("Putin", newCatering.getName());
		
		cateringRepository.deleteById(newCatering.getId());
		
	}
	
	@Test
	void shouldUpdateCateringTest()
	{
		Catering catering=new Catering();
		catering.setName("Putin");
		catering.setLocation("Russia");
		catering.setItems("Missile Type Of Foods");
		catering.setAmount(999999);
		
		Catering newCatering=restTemplate.postForObject(baseURL, catering,Catering.class);
		
		newCatering.setName("Trump");
		
		restTemplate.put(baseURL+"/"+newCatering.getId(), newCatering,Catering.class);
		
		assertNotNull(newCatering);
		assertEquals("Trump", newCatering.getName());
		
		cateringRepository.deleteById(newCatering.getId());
	}
	
	@Test
	void shouldDeleteCateringTest()
	{
		Catering catering=new Catering();
		catering.setName("Putin");
		catering.setLocation("Russia");
		catering.setItems("Missile Type Of Foods");
		catering.setAmount(999999);
		
		Catering newCatering=restTemplate.postForObject(baseURL, catering,Catering.class);
		
		restTemplate.delete(baseURL+"/"+newCatering.getId());
		
		assertFalse(cateringRepository.findById(newCatering.getId()).isPresent());
		
	}
	
	@Test
	void shouldDisplayCateringByCateringName()
	{
//		Catering catering=new Catering();
//		catering.setName("Putin");
//		catering.setLocation("Russia");
//		catering.setItems("Missile Type Of Foods");
//		catering.setAmount(999999);
//		
//		Catering newCatering=restTemplate.postForObject(baseURL, catering,Catering.class);
		
		List<Catering> catering1=restTemplate.getForObject(baseURL+"/"+"findbyname?"+"name=Putin", List.class);
		
		assertNotNull(catering1);
		assertEquals(catering1.size(),cateringRepository.findByName("Putin").size());
		
//		cateringRepository.deleteById(newCatering.getId());
	}
	
	@Test
	void shouldDisplayCateringByCateringLocation()
	{
		List<Catering> catering1=restTemplate.getForObject(baseURL+"/"+"findbylocation?"+"location=Belur", List.class);
		
		assertNotNull(catering1);
		assertEquals(catering1.size(),cateringRepository.findByLocation("Belur").size());

	}
	
	@Test
	void shouldDiaplayCateringByCateringNameandLocation()
	{
		List<Catering> catering=restTemplate.getForObject(baseURL+"/"+"findbynameandlocation?"+"name=Putin&location=Belur", List.class);
		assertNotNull(catering);
		assertEquals(catering.size(), cateringRepository.findByNameAndLocation("Putin", "Belur").size());
	}
}
