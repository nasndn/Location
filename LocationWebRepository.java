package com.locationweb.repository;

import org.springframework.beans.factory.parsing.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import com.locationweb.enitity.Locations;


public interface LocationWebRepository extends JpaRepository<Locations, Long> {

}
