package com.metro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metro.bean.MetroStation;
import com.metro.persistence.MetroStationDao;

@Service
public class MetroStationServiceImpl implements MetroStationService {
	@Autowired
	private MetroStationDao metroStationDao;

	@Override
	public double calculateFare(MetroStation source, MetroStation destination) {
		int factor = Math.abs(source.getId() - destination.getId());
		double fair = factor * 5;
		
		return fair;
	}

	@Override
	public Optional<MetroStation> getMetroStationById(int metroStationId) {
		return metroStationDao.findById(metroStationId);
	}

	@Override
	public List<MetroStation> getAllMetroStations() {
		return metroStationDao.findAllByOrderByIdAsc();
	}
}