package com.fordytoo._kgen.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "planets")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String segmentum;
    private String pClass;
    private String techLevel;
    private String starSize;
    private String planetSize;
    private String axialTilt;
    private String dayLength;
    private String yearLength;
    private String numSatellites;
    private String gravity;
    private String atmosphere;
    private String hydrosphere;
    private String temperature;
    private String terrains;
    private String population;
    private String society;
    private String defences;

    public Planet() {

    }

    public Planet(String name, String segmentum, String pClass, String techLevel, String starSize, String planetSize, String axialTilt, String dayLength, String yearLength, String numSatellites, String gravity, String atmosphere, String hydrosphere, String temperature, String terrains, String population, String society, String defences) {
        this.name = name;
        this.segmentum = segmentum;
        this.pClass = pClass;
        this.techLevel = techLevel;
        this.starSize = starSize;
        this.planetSize = planetSize;
        this.axialTilt = axialTilt;
        this.dayLength = dayLength;
        this.yearLength = yearLength;
        this.numSatellites = numSatellites;
        this.gravity = gravity;
        this.atmosphere = atmosphere;
        this.hydrosphere = hydrosphere;
        this.temperature = temperature;
        this.terrains = terrains;
        this.population = population;
        this.society = society;
        this.defences = defences;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSegmentum() {
        return segmentum;
    }

    public void setSegmentum(String segmentum) {
        this.segmentum = segmentum;
    }

    public String getpClass() {
        return pClass;
    }

    public void setpClass(String pClass) {
        this.pClass = pClass;
    }

    public String getTechLevel() {
        return techLevel;
    }

    public void setTechLevel(String techLevel) {
        this.techLevel = techLevel;
    }

    public String getStarSize() {
        return starSize;
    }

    public void setStarSize(String starSize) {
        this.starSize = starSize;
    }

    public String getPlanetSize() {
        return planetSize;
    }

    public void setPlanetSize(String planetSize) {
        this.planetSize = planetSize;
    }

    public String getAxialTilt() {
        return axialTilt;
    }

    public void setAxialTilt(String axialTilt) {
        this.axialTilt = axialTilt;
    }

    public String getDayLength() {
        return dayLength;
    }

    public void setDayLength(String dayLength) {
        this.dayLength = dayLength;
    }

    public String getYearLength() {
        return yearLength;
    }

    public void setYearLength(String yearLength) {
        this.yearLength = yearLength;
    }

    public String getNumSatellites() {
        return numSatellites;
    }

    public void setNumSatellites(String numSatellites) {
        this.numSatellites = numSatellites;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    public String getHydrosphere() {
        return hydrosphere;
    }

    public void setHydrosphere(String hydrosphere) {
        this.hydrosphere = hydrosphere;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTerrains() {
        return terrains;
    }

    public void setTerrains(String terrains) {
        this.terrains = terrains;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getDefences() {
        return defences;
    }

    public void setDefences(String defences) {
        this.defences = defences;
    }

}
