package com.metro.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metro.bean.MetroStation;
import com.metro.bean.MetroStations;
import com.metro.service.MetroStationService;

@RestController
@RequestMapping("/stations")
public class MetroStationResource {
	@Autowired
	private MetroStationService metroStationService;
	
	@GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MetroStations> getAllMetroStations() {
		List<MetroStation> metroStations = metroStationService.getAllMetroStations();

		return new ResponseEntity<MetroStations>(new MetroStations(metroStations), metroStations.size() > 0 ? HttpStatus.FOUND: HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MetroStation> getMetroStationById(@PathVariable("id") int metroStationId) {
		Optional<MetroStation> metroStation = metroStationService.getMetroStationById(metroStationId);
		if(metroStation.isPresent()) {
			return new ResponseEntity<MetroStation>(metroStation.get(), HttpStatus.FOUND);
		}
		
		return new ResponseEntity<MetroStation>(new MetroStation(), HttpStatus.NOT_FOUND);
	}
}