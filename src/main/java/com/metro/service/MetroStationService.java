package com.metro.service;

import java.util.List;
import java.util.Optional;

import com.metro.bean.MetroStation;

public interface MetroStationService {
	double calculateFare(MetroStation source, MetroStation destination);
	
	Optional<MetroStation> getMetroStationById(int metroStationId);
	
	List<MetroStation> getAllMetroStations();
}