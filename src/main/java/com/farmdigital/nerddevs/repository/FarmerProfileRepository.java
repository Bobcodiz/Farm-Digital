package com.farmdigital.nerddevs.repository;

import com.farmdigital.nerddevs.model.FarmerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerProfileRepository extends JpaRepository<FarmerProfile,Integer> {

}
