package com.metro.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metro.bean.MetroStation;
import com.metro.service.MetroStationService;

@RestController
public class MetroStationResource {
	@Autowired
	private MetroStationService metroStationService;
	
	@GetMapping(path = "/metroStations", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MetroStation> getAllMetroStations() {
		return metroStationService.getAllMetroStations();
	}
}