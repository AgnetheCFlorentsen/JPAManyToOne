package com.example.jpamanytoone.repository;

import com.example.jpamanytoone.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository <Region, Integer> {
    Region findRegionByHref (String href);



}
