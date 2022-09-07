package com.metro.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metro.bean.MetroStation;

@Repository
public interface MetroStationDao extends JpaRepository<MetroStation, Integer> {
	Optional<MetroStation> findById(int metroStationId);
	
	List<MetroStation> findAllByOrderByIdAsc();
}