package com.metro.service;

import java.util.List;

import com.metro.bean.MetroStation;

public interface MetroStationService {
	double calculateFare(MetroStation source, MetroStation destination);
	
	MetroStation getMetroStation(int metroStationId);
	
	List<MetroStation> getAllMetroStations();
}