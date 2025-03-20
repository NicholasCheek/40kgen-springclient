package com.fordytoo._kgen.Controllers;

import com.fordytoo._kgen.Entities.Planet;
import com.fordytoo._kgen.Repositories.PlanetRepository;
import com.fordytoo._kgen.Services.PlanetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlanetController {

    public PlanetController(PlanetRepository planetRepository, PlanetService planetService) {
        this.planetRepository = planetRepository;
        this.planetService = planetService;
    }

    private final PlanetRepository planetRepository;
    private final PlanetService planetService;

    @GetMapping("/planets")
    public List<Planet> getPlanets() {
        return (List<Planet>) planetRepository.findAll();
    }

    @PostMapping("/planets")
    public Planet addPlanet(@RequestBody Planet planet) {
        return planetRepository.save(planet);
    }

    @GetMapping(value = "/planets/random-segmentum", produces = "application/json")
    public Map<String, String> getRandomSegmentum() {
        return Map.of("value", planetService.getRandomSegmentum());
    }

    @GetMapping(value = "planets/random-planet-class", produces = "application/json")
    public Map<String, String> getRandomPClass() {
        return Map.of("value", planetService.getRandomPClass());
    }

    @GetMapping(value = "planets/random-star-size", produces = "application/json")
    public Map<String, String> getRandomStarSize() {
        return Map.of("value", planetService.getRandomStarSize());
    }

    @GetMapping(value = "planets/random-planet-size", produces = "application/json")
    public Map<String, String> getRandomPlanetSize() {
        return Map.of("value", planetService.getRandomPlanetSize());
    }

    @GetMapping(value = "planets/random-axial-tilt", produces = "application/json")
    public Map<String, String> getRandomAxialTilt() {
        return Map.of("value", planetService.getRandomAxialTilt());
    }

    @PostMapping(value = "/planets/random-tech-level", produces = "application/json")
    public Map<String, String> getRandomTechLevel(@RequestBody Map<String, String> request) {
        String pClass = request.get("pClass");
        String techLevel = planetService.getRandomTechLevel(pClass);
        return Map.of("result", techLevel);
    }

    @PostMapping(value = "/planets/random-day-length", produces = "application/json")
    public Map<String, String> getRandomDayLength(@RequestBody Map<String, String> request) {
        String planetSize = request.get("planetSize");
        String dayLength = planetService.getRandomDayLength(planetSize);
        return Map.of("result", dayLength);
    }

    @GetMapping(value = "planets/random-year-length", produces = "application/json")
    public Map<String, String> getRandomYearLength() {
        return Map.of("value", planetService.getRandomYearLength());
    }

    @PostMapping(value = "/planets/random-number-satellites", produces = "application/json")
    public Map<String, String> getRandomNumSatellites(@RequestBody Map<String, String> request) {
        String planetSize = request.get("planetSize");
        String numSatellites = planetService.getRandomNumSatellites(planetSize);
        return Map.of("result", numSatellites);
    }

    @GetMapping(value = "planets/random-gravity", produces = "application/json")
    public Map<String, String> getRandomGravity() {
        return Map.of("value", planetService.getRandomGravity());
    }

    @GetMapping(value = "planets/random-atmosphere", produces = "application/json")
    public Map<String, String> getRandomAtmosphere() {
        return Map.of("value", planetService.getRandomAtmosphere());
    }

    @GetMapping(value = "planets/random-hydrosphere", produces = "application/json")
    public Map<String, String> getRandomHydrosphere() {
        return Map.of("value", planetService.getRandomHydrosphere());
    }

    @GetMapping(value = "planets/random-temperature", produces = "application/json")
    public Map<String, String> getRandomTemperature() {
        return Map.of("value", planetService.getRandomTemperature());
    }

    @PostMapping(value = "/planets/random-terrains", produces = "application/json")
    public Map<String, String> getRandomTerrains(@RequestBody Map<String, String> request) {
        String pClass = request.get("pClass");
        String terrains = planetService.getRandomTerrains(pClass);
        return Map.of("result", terrains);
    }

    @PostMapping(value = "/planets/random-population", produces = "application/json")
    public Map<String, String> getRandomPopulation(@RequestBody Map<String, String> request) {
        String pClass = request.get("pClass");
        String planetSize = request.get("planetSize");
        String population = planetService.getRandomPopulation(pClass, planetSize);
        return Map.of("result", population);
    }

    @GetMapping(value = "planets/random-society", produces = "application/json")
    public Map<String, String> getRandomSociety() {
        return Map.of("value", planetService.getRandomSociety());
    }

    @PostMapping(value = "/planets/random-defences", produces = "application/json")
    public Map<String, String> getRandomDefences(@RequestBody Map<String, String> request) {
        String pClass = request.get("pClass");
        String techLevel = request.get("techLevel");
        String defences = planetService.getRandomDefences(pClass, techLevel);
        System.out.println(defences);
        return Map.of("result", defences);
    }
}
