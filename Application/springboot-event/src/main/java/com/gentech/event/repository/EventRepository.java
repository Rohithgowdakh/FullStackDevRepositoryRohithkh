package com.gentech.event.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gentech.event.entity.Event;

import jakarta.transaction.Transactional;

public interface EventRepository extends JpaRepository<Event, Long> {

	List<Event> findByName( String name);
	
	List<Event> findByLocation(String loc);
	
	List<Event> findByStatus(String status);
	
	List<Event> findByNameAndLocation(String name,String location);
	
	List<Event> findByNameAndLocationAndStatus(String name,String location,String status);
	
	//Native SQL with named parameters
	//@Query(value="select * from tbl_event e where e.event_name=:ename OR e.event_location=:loc" , nativeQuery=true)
	
	//Native SQL with index parameters
	//@Query(value="select * from tbl_event e where e.event_name=?1 OR e.event_location=?2", nativeQuery=true)
	
	//JPQL with index parameter
	//@Query("SELECT e FROM Event e WHERE e.name=?1 OR e.location=?2")
	
	//JPQL with Named Parameters
	@Query("FROM Event WHERE name=:ename OR location=:loc")
	List<Event> getAllEventsByNameAndLocation(@Param("ename") String name,String loc);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Event  WHERE name=:name")
	Integer getDeleteByCustomerName(String name);
	
	@Transactional
	@Modifying
	@Query("update Event e SET e.location=?1 Where e.name=?2")
	Integer updateLocationByName(String loc,String name);
	
	@Transactional
	@Modifying
	@Query(value="UPDATE tbl_event  SET event_name=:name ,event_status=:status WHERE event_id=:id",nativeQuery = true)
	Integer updateNameAndStatusById(String name,String status,Long id);
	
}
