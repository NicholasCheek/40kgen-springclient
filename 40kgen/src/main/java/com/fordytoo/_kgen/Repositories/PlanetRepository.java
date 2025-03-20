package com.fordytoo._kgen.Repositories;

import com.fordytoo._kgen.Entities.Planet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends CrudRepository<Planet, Long> {
}