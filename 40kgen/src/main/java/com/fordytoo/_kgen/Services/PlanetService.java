package com.fordytoo._kgen.Services;

import com.fordytoo._kgen.Repositories.PlanetRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class PlanetService {
    private PlanetRepository planetRepository;
    private final Random rand = new Random();

    private final List<String> segmentumOptions = Arrays.asList(
            "Segmentum Solar", "Segmentum Ultima", "Segmentum Tempestus", "Segmentum Obscurus", "Segmentum Pacificus"
    );

    private final List<String> pClassOptions = Arrays.asList(
            "Hive World", "Penal World", "Agri-World", "Forge World", "Mining World", "Developing/Civilised World",
            "Fortress World", "Feudal World", "Feral World", "Shrine World", "Cemetery World", "Pleasure/Paradise/Garden World",
            "Death World", "Frontier World", "Quarantined World", "War World", "Dead World", "Forbidden World", "Xenos World",
            "Gas Giant"
    );

    private final List<String> techLevelOptions = Arrays.asList(
            "Stone Age", "Bronze/Iron Age", "Steel Age", "Pre-Industrial", "Industrial", "Early Space", "Advanced Space", "Warp Space",
            "Low Imperial", "Mid Imperial", "High Imperial", "Advanced"
    );

    private final List<String> starSizeOptions = Arrays.asList(
            "Tiny", "Small", "Medium", "Large", "Huge", "Giant"
    );

    private final List<String> planetSizeOptions = Arrays.asList(
            "Miniscule", "Tiny", "Small", "Average", "Large", "Huge", "Enormous", "Massive"
    );

    private final List<String> axialTiltOptions = Arrays.asList(
            "None", "Slight (1-5°)", "Notable (6-15°)", "Moderate (16-25°)", "Large (26-35°)", "Severe (36-45°)", "Extreme (46°+)"
    );

    private final List<String> gravityOptions = Arrays.asList(
            "Very Light (0.1 to 0.5 G)", "Light (0.5 to 0.7 G)", "Standard (0.8 to 1.2 G)",
            "Heavy (1.3 to 1.5 G)", "Very Heavy (1.5 to 2 G)"
    );

    private final List<String> atmosphereOptions = Arrays.asList(
            "Normal", "Bearable", "Tainted", "Poisonous", "Deadly"
    );

    private final List<String> hydrosphereOptions = Arrays.asList(
            "Waterless", "Parched", "Arid", "Average", "Damp", "Moist", "Watery", "Aquatic"
    );

    private final List<String> temperatureOptions = Arrays.asList(
            "Bitter (-201°C/-330°F or lower)", "Cold (-200°C to -101°C/-328°F to -150°F)",
            "Chilly (-100°C to -41°C/-148°F to -42°F)", "Frosty (-40°C to -11°C/-40°F to 12°F)",
            "Average (-10°C to +30°C/14°F to 86°F)", "Warm (+31°C to +50°C/88°F to 122°F)",
            "Tepid (+51°C to +100°C/124°F to 202°F)", "Hot (+101°C to +150°C/204°F to 302°F)",
            "Roasting (+151°C to +300°C/304°F to 572°F)", "Searing (+300°C/+572°F or more)"
    );

    private final List<String> terrainOptions = Arrays.asList(
            "Grassland", "Savannah", "Continual Forest", "Broken Forest", "Hills", "Mountains",
            "Plateaus", "Dormant Volcanoes", "Active Volcanoes", "Broken Rock", "Flat Rock",
            "Columns", "Moor", "Barren", "Swamp", "Caves", "Ravines", "Sandy", "Islands", "Cliffs"
    );

    private final List<String> societyOptions = Arrays.asList(
            "Democratic Republic", "Elected Dictator", "Hereditary Dictator", "Tyrannical Dictator",
            "Elected Monarchy", "Hereditary Monarchy", "Military Junta/Dictatorship", "Religious (Local)",
            "Religious (Ministorum)", "Religious (Machine God)", "Oligarchy",
            "Direct Control by the Administratum or Offworld Appointed Goverment"
    );

    private final List<String> forceSizeOptions = Arrays.asList(
            "Tiny", "Small", "Medium", "Large", "Huge", "Massive"
    );

    private final List<String> forceQualityOptions = Arrays.asList(
            "Poor", "Poor/Medium", "Medium", "Medium/High", "High"
    );

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public String getRandomSegmentum() {
        return segmentumOptions.get(rand.nextInt(segmentumOptions.size()));
    }

    public String getRandomPClass() {
        int roll = rand.nextInt(100);
        if (roll < 15) {
            return pClassOptions.get(0);
        }
        if (roll < 19) {
            return pClassOptions.get(1);
        }
        else if (roll < 27) {
            return pClassOptions.get(2);
        }
        else if (roll < 32) {
            return pClassOptions.get(3);
        }
        else if (roll < 38) {
            return pClassOptions.get(4);
        }
        else if (roll < 44) {
            return pClassOptions.get(5);
        }
        else if (roll < 49) {
            return pClassOptions.get(6);
        }
        else if (roll < 53) {
            return pClassOptions.get(7);
        }
        else if (roll < 58) {
            return pClassOptions.get(8);
        }
        else if (roll < 64) {
            return pClassOptions.get(9);
        }
        else if (roll < 68) {
            return pClassOptions.get(10);
        }
        else if (roll < 73) {
            return pClassOptions.get(11);
        }
        else if (roll < 76) {
            return pClassOptions.get(12);
        }
        else if (roll < 80) {
            return pClassOptions.get(13);
        }
        else if (roll < 83) {
            return pClassOptions.get(14);
        }
        else if (roll < 89) {
            return pClassOptions.get(15);
        }
        else if (roll < 92) {
            return pClassOptions.get(16);
        }
        else if (roll < 94) {
            return pClassOptions.get(17);
        }
        else if (roll < 98) {
            return pClassOptions.get(18);
        }
        else {
            return pClassOptions.get(19);
        }
    }

    public String getRandomStarSize() {
        int roll = rand.nextInt(100);
        if (roll < 5) {
            return starSizeOptions.get(0);
        }
        else if (roll < 15) {
            return starSizeOptions.get(1);
        }
        else if (roll < 75) {
            return starSizeOptions.get(2);
        }
        else if (roll < 85) {
            return starSizeOptions.get(3);
        }
        else if (roll < 95) {
            return starSizeOptions.get(4);
        }
        else {
            return starSizeOptions.get(5);
        }
    }

    public String getRandomPlanetSize() {
        int roll = rand.nextInt(100);
        if (roll < 10) {
            return planetSizeOptions.get(0);
        }
        else if (roll < 20) {
            return planetSizeOptions.get(1);
        }
        else if (roll < 35) {
            return planetSizeOptions.get(2);
        }
        else if (roll < 75) {
            return planetSizeOptions.get(3);
        }
        else if (roll < 85) {
            return planetSizeOptions.get(4);
        }
        else if (roll < 90) {
            return planetSizeOptions.get(5);
        }
        else if (roll < 95) {
            return planetSizeOptions.get(6);
        }
        else {
            return planetSizeOptions.get(7);
        }
    }

    public String getRandomAxialTilt() {
        int roll = rand.nextInt(100);
        if (roll < 5) {
            return axialTiltOptions.get(0);
        }
        else if (roll < 15) {
            return axialTiltOptions.get(1);
        }
        else if (roll < 30) {
            return axialTiltOptions.get(2);
        }
        else if (roll < 70) {
            return axialTiltOptions.get(3);
        }
        else if (roll < 85) {
            return axialTiltOptions.get(4);
        }
        else if (roll < 95) {
            return axialTiltOptions.get(5);
        }
        else {
            return axialTiltOptions.get(6);
        }
    }

    public String getRandomTechLevel(String pClass) {
        int techNumber = 0;
        int initNum = 0;
        int rollNum = 0;
        int diceSize = 0;
        int addNum = 0;
        String result = "";


        if (pClass.equals(pClassOptions.get(0))) {
            //hive world
            initNum = 36;
            rollNum = 2;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(1))) {
            //penal world
            initNum = 15;
            rollNum = 3;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(2))) {
            //agri world
            initNum = 15;
            rollNum = 3;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(3))) {
            //forge world
            initNum = 50;
            rollNum = 1;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(4))) {
            //mining world
            initNum = 15;
            rollNum = 4;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(5))) {
            //developing world
            initNum = 20;
            rollNum = 2;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(6))) {
            //fortress world
            initNum = 40;
            rollNum = 2;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(7))) {
            //fuedal world
            initNum = 6;
            rollNum = 1;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(8))) {
            //feral world
            initNum = 0;
            rollNum = 1;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(9))) {
            //shrine world
            initNum = 20;
            rollNum = 4;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(10))) {
            //cemetery world
            initNum = 20;
            rollNum = 3;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(11))) {
            //pleasure world
            initNum = 35;
            rollNum = 2;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(12))) {
            //death world
            initNum = 0;
            rollNum = 4;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(13))) {
            //frontier world
            initNum = 15;
            rollNum = 2;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(14))) {
            //quarantine world
            //update
            //Use prev. class (0 if Barren World)
        }
        else if (pClass.equals(pClassOptions.get(15))) {
            //war world
            //update
            //Prev. class or 20+2d10
            initNum = 20;
            rollNum = 2;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(16))) {
            //dead world
            //update
            //Use prev. class (0 if Barren World)
        }
        else if (pClass.equals(pClassOptions.get(17))) {
            //forbidden world
            //update
            //6d10 ±1d5 (for edge cases such as a roll of 6 to make a Stone Age forbidden world)
            initNum = 0;
            rollNum = 6;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(18))) {
            //xenos world
            //update
            //6d10 ±1d5 (for edge cases such as a roll of 6 to make a Stone Age xenos species, high rolls can fluff it as a regional power or an Eldar Exodite world)
            initNum = 0;
            rollNum = 6;
            diceSize = 10;
        }
        else if (pClass.equals(pClassOptions.get(19))) {
            //gas giant
            initNum = 30;
            rollNum = 4;
            diceSize = 10;
        }
        while (rollNum > 0) {
            addNum += rand.nextInt(diceSize) + 1;
            rollNum--;
        }

        techNumber = initNum + addNum;

        if (techNumber == 0) {
            result = "error";
        }
        else if (techNumber <= 5) {
            result = techLevelOptions.get(0);
        }
        else if (techNumber <= 10) {
            result = techLevelOptions.get(1);
        }
        else if (techNumber <= 15) {
            result = techLevelOptions.get(2);
        }
        else if (techNumber <= 20) {
            result = techLevelOptions.get(3);
        }
        else if (techNumber <= 25) {
            result = techLevelOptions.get(4);
        }
        else if (techNumber <= 30) {
            result = techLevelOptions.get(5);
        }
        else if (techNumber <= 35) {
            result = techLevelOptions.get(6);
        }
        else if (techNumber <= 40) {
            result = techLevelOptions.get(7);
        }
        else if (techNumber <= 45) {
            result = techLevelOptions.get(8);
        }
        else if (techNumber <= 50) {
            result = techLevelOptions.get(9);
        }
        else if (techNumber <= 55) {
            result = techLevelOptions.get(10);
        }
        else if (techNumber <= 60) {
            result = techLevelOptions.get(11);
        }
        else {
            result = "error";
        }

        return result;
    }

    public String getRandomDayLength(String planetSize) {
        int sizeMod = 0;
        int dayLength = 0;
        int lengthRoll = rand.nextInt(100);
        int rollNum = 0;
        int diceSize = 0;
        int multiplier = 0;
        String dayLengthString = "";

        if(planetSize.equals(planetSizeOptions.get(0))) {
            sizeMod = -30;
        }
        else if (planetSize.equals(planetSizeOptions.get(1))) {
            sizeMod = -20;
        }
        else if (planetSize.equals(planetSizeOptions.get(2))) {
            sizeMod = -10;
        }
        else if (planetSize.equals(planetSizeOptions.get(3))) {
            sizeMod = 0;
        }
        else if (planetSize.equals(planetSizeOptions.get(4))) {
            sizeMod = 10;
        }
        else if (planetSize.equals(planetSizeOptions.get(5))) {
            sizeMod = 20;
        }
        else if (planetSize.equals(planetSizeOptions.get(6))) {
            sizeMod = 30;
        }
        else {
            sizeMod = 50;
        }

        lengthRoll += sizeMod;

        if (lengthRoll < 0) {
            lengthRoll = 0;
        }

        if (lengthRoll < 5) {
            rollNum = 1;
            diceSize = 5;
            multiplier = 1;
        }
        else if (lengthRoll < 15) {
            rollNum = 1;
            diceSize = 10;
            multiplier = 1;
        }
        else if (lengthRoll < 25) {
            rollNum = 2;
            diceSize = 10;
            multiplier = 1;
        }
        else if (lengthRoll < 35) {
            rollNum = 3;
            diceSize = 10;
            multiplier = 1;
        }
        else if (lengthRoll < 45) {
            rollNum = 4;
            diceSize = 10;
            multiplier = 1;
        }
        else if (lengthRoll < 65) {
            rollNum = 5;
            diceSize = 10;
            multiplier = 1;
        }
        else if (lengthRoll < 75) {
            rollNum = 6;
            diceSize = 10;
            multiplier = 1;
        }
        else if (lengthRoll < 85) {
            rollNum = 7;
            diceSize = 10;
            multiplier = 1;
        }
        else if (lengthRoll < 90) {
            rollNum = 8;
            diceSize = 10;
            multiplier = 1;
        }
        else if (lengthRoll < 95) {
            rollNum = 9;
            diceSize = 10;
            multiplier = 1;
        }
        else if (lengthRoll < 100) {
            rollNum = 10;
            diceSize = 10;
            multiplier = 1;
        }
        else if (lengthRoll < 120) {
            rollNum = 10;
            diceSize = 10;
            multiplier = 2;
        }
        else {
            rollNum = 10;
            diceSize = 10;
            multiplier = 3;
        }

        while (rollNum > 0) {
            dayLength += rand.nextInt(diceSize) + 1;
            rollNum--;
        }

        dayLength *= multiplier;

        dayLengthString = dayLength + " hours";

        return dayLengthString;

    }

    public String getRandomYearLength() {
        int multiplier = rand.nextInt(10) + 1;
        int yearLength = 0;

        for (int i = 0; i < 10; i++) {
            yearLength += (rand.nextInt(10) + 1);
        }

        yearLength *= multiplier;
        String terranYears = String.format("%.2f", yearLength / 365.00);

        return yearLength + " Terran days (" + terranYears + " Terran years)";
    }

    public String getRandomNumSatellites(String planetSize) {
        int sizeMod = 0;
        int roll = rand.nextInt(100) + 1;
        int numSatellites = 0;
        int rollNum = 0;
        int diceSize = 0;

        if (planetSize.equals(planetSizeOptions.get(0))) {
            sizeMod = -30;
        }
        else if (planetSize.equals(planetSizeOptions.get(1))) {
            sizeMod = -20;
        }
        else if (planetSize.equals(planetSizeOptions.get(2))) {
            sizeMod = -10;
        }
        else if (planetSize.equals(planetSizeOptions.get(3))) {
            sizeMod = 0;
        }
        else if (planetSize.equals(planetSizeOptions.get(4))) {
            sizeMod = 10;
        }
        else if (planetSize.equals(planetSizeOptions.get(5))) {
            sizeMod = 20;
        }
        else if (planetSize.equals(planetSizeOptions.get(6))) {
            sizeMod = 30;
        }
        else {
            sizeMod = 40;
        }

        roll += sizeMod;
        if (roll < 0) {
            roll = 0;
        }

        if (roll < 20) {
            numSatellites = 0;
        }
        else if (roll < 40) {
            numSatellites = 1;
        }
        else if (roll < 70) {
            rollNum = 1;
            diceSize = 5;
        }
        else if (roll < 80) {
            rollNum = 1;
            diceSize = 10;
        }
        else if (roll < 90) {
            rollNum = 2;
            diceSize = 10;
        }
        else if (roll < 100) {
            rollNum = 3;
            diceSize = 10;
        }
        else if (roll < 110) {
            rollNum = 4;
            diceSize = 10;
        }
        else if (roll < 130) {
            rollNum = 5;
            diceSize = 10;
        }
        else {
            rollNum = 6;
            diceSize = 10;
        }

        while (rollNum > 0) {
            numSatellites += rand.nextInt(diceSize) + 1;
            rollNum--;
        }

        return numSatellites + " Satellites (Moons)";

    }

    public String getRandomGravity() {
        int roll = rand.nextInt(100);

        if (roll < 5) {
            return gravityOptions.get(0);
        }
        else if (roll < 15) {
            return gravityOptions.get(1);
        }
        else if (roll < 90) {
            return gravityOptions.get(2);
        }
        else if (roll < 95) {
            return gravityOptions.get(3);
        }
        else {
            return gravityOptions.get(4);
        }
    }

    public String getRandomAtmosphere() {
        int roll = rand.nextInt(100);
        if (roll < 70) {
            return atmosphereOptions.get(0);
        }
        else if (roll < 85) {
            return atmosphereOptions.get(1);
        }
        else if (roll < 92) {
            return atmosphereOptions.get(2);
        }
        else if (roll < 97) {
            return atmosphereOptions.get(3);
        }
        else {
            return atmosphereOptions.get(4);
        }
    }

    public String getRandomHydrosphere() {
        int roll = rand.nextInt(100);
        if (roll < 10) {
            return hydrosphereOptions.get(0);
        }
        else if (roll < 20) {
            return hydrosphereOptions.get(1);
        }
        else if (roll < 35) {
            return hydrosphereOptions.get(2);
        }
        else if (roll < 55) {
            return hydrosphereOptions.get(3);
        }
        else if (roll < 70) {
            return hydrosphereOptions.get(4);
        }
        else if (roll < 80) {
            return hydrosphereOptions.get(5);
        }
        else if (roll < 90) {
            return hydrosphereOptions.get(6);
        }
        else {
            return hydrosphereOptions.get(7);
        }
    }

    public String getRandomTemperature() {
        int roll = rand.nextInt(100);
        if (roll < 5) {
            return temperatureOptions.get(0);
        }
        else if (roll < 10) {
            return temperatureOptions.get(1);
        }
        else if (roll < 20) {
            return temperatureOptions.get(2);
        }
        else if (roll < 35) {
            return temperatureOptions.get(3);
        }
        else if (roll < 60) {
            return temperatureOptions.get(4);
        }
        else if (roll < 75) {
            return temperatureOptions.get(5);
        }
        else if (roll < 85) {
            return temperatureOptions.get(6);
        }
        else if (roll < 90) {
            return temperatureOptions.get(7);
        }
        else if (roll < 95) {
            return temperatureOptions.get(8);
        }
        else {
            return temperatureOptions.get(9);
        }
    }

    public String getRandomTerrains(String pClass) {
        int roll = rand.nextInt(5) +1;
        String terrains = "";

        if (pClass.equals(pClassOptions.get(19))) {
            return "Gas Clouds";
        }
        else {
            for (int i = 0; i < roll; i++) {
                terrains = terrains + terrainOptions.get(rand.nextInt(terrainOptions.size())) +"\n";
            }
            return terrains;
        }
    }

    public String getRandomPopulation(String pClass, String planetSize) {
        int modifier = 0;
        int population = 0;
        int roll = rand.nextInt(100);
        int rollNum = 0;
        int diceSize = 0;
        int multiplier = 1;
        String extraText = "";
        System.out.println(roll);

        if (pClass.equals(pClassOptions.get(0))) {
            modifier += 40;
        }
        else if (pClass.equals(pClassOptions.get(1))) {
            modifier += -10;
        }
        else if (pClass.equals(pClassOptions.get(2))) {
            modifier += 0;
        }
        else if (pClass.equals(pClassOptions.get(3))) {
            modifier += 20;
        }
        else if (pClass.equals(pClassOptions.get(4))) {
            modifier += 10;
        }
        else if (pClass.equals(pClassOptions.get(5))) {
            modifier += -20;
        }
        else if (pClass.equals(pClassOptions.get(6))) {
            modifier += 20;
        }
        else if (pClass.equals(pClassOptions.get(7))) {
            modifier += -20;
        }
        else if (pClass.equals(pClassOptions.get(8))) {
            modifier += 0;
        }
        else if (pClass.equals(pClassOptions.get(9))) {
            modifier += -10;
        }
        else if (pClass.equals(pClassOptions.get(10))) {
            modifier += -20;
        }
        else if (pClass.equals(pClassOptions.get(11))) {
            modifier += 0;
        }
        else if (pClass.equals(pClassOptions.get(12))) {
            modifier += -30;
        }
        else if (pClass.equals(pClassOptions.get(13))) {
            modifier += -20;
        }
        else if (pClass.equals(pClassOptions.get(14))) {
            modifier += 0;
        }
        else if (pClass.equals(pClassOptions.get(15))) {
            modifier += 0;
        }
        else if (pClass.equals(pClassOptions.get(16))) {
            modifier += -40;
        }
        else if (pClass.equals(pClassOptions.get(17))) {
            modifier += 0;
        }
        else if (pClass.equals(pClassOptions.get(18))) {
            modifier += 0;
        }
        else {
            modifier += -50;
        }

        if (planetSize.equals(planetSizeOptions.get(0))) {
            modifier += -30;
        }
        else if (planetSize.equals(planetSizeOptions.get(1))) {
            modifier += -20;
        }
        else if (planetSize.equals(planetSizeOptions.get(2))) {
            modifier += -10;
        }
        else if (planetSize.equals(planetSizeOptions.get(3))) {
            modifier += 0;
        }
        else if (planetSize.equals(planetSizeOptions.get(4))) {
           modifier += 10;
        }
        else if (planetSize.equals(planetSizeOptions.get(5))) {
            modifier += 20;
        }
        else if (planetSize.equals(planetSizeOptions.get(6))) {
            modifier += 30;
        }
        else {
            modifier += 40;
        }

        roll += modifier;
        System.out.println(roll);

        if (roll < 0) {
            roll = 0;
        }

        if (roll < 5) {
            rollNum = 10;
            diceSize = 10;
        }
        else if (roll < 10) {
            rollNum = 10;
            diceSize = 10;
            multiplier = 10;
        }
        else if (roll < 15) {
            rollNum = 10;
            diceSize = 10;
            multiplier = 100;
        }
        else if (roll < 20) {
            rollNum = 10;
            diceSize = 10;
            multiplier = 1000;
        }
        else if (roll < 25) {
            rollNum = 10;
            diceSize = 10;
            multiplier = 10000;
        }
        else if (roll < 30) {
            rollNum = 1;
            diceSize = 5;
            extraText = " million";
        }
        else if (roll < 35) {
            rollNum = 1;
            diceSize = 10;
            extraText = " million";
        }
        else if (roll < 40) {
            rollNum = 5;
            diceSize = 10;
            extraText = " million";
        }
        else if (roll < 50) {
            rollNum = 10;
            diceSize = 10;
            extraText = " million";
        }
        else if (roll < 70) {
            rollNum = 1;
            diceSize = 10;
            extraText = " hundred million";
        }
        else if (roll < 90) {
            rollNum = 1;
            diceSize = 5;
            extraText = " billion";
        }
        else if (roll < 100) {
            rollNum = 1;
            diceSize = 10;
            extraText = " billion";
        }
        else if (roll < 110) {
            rollNum = 2;
            diceSize = 10;
            extraText = " billion";
        }
        else {
            rollNum = 3;
            diceSize = 10;
            extraText = " billion";
        }

        while (rollNum > 0) {
            population += rand.nextInt(diceSize) + 1;
            rollNum--;
        }

        population *= multiplier;

        return population + extraText;
    }

    public String getRandomSociety() {
        int roll = rand.nextInt(100);
        if (roll < 8) {
            return societyOptions.get(0);
        }
        else if (roll < 17) {
            return societyOptions.get(1);
        }
        else if (roll < 26) {
            return societyOptions.get(2);
        }
        else if (roll < 35) {
            return societyOptions.get(3);
        }
        else if (roll < 44) {
            return societyOptions.get(4);
        }
        else if (roll < 54) {
            return societyOptions.get(5);
        }
        else if (roll < 63) {
            return societyOptions.get(6);
        }
        else if (roll < 72) {
            return societyOptions.get(7);
        }
        else if (roll < 81) {
            return societyOptions.get(8);
        }
        else if (roll < 90) {
            return societyOptions.get(9);
        }
        else if (roll < 99) {
            return societyOptions.get(10);
        }
        else {
            return societyOptions.get(11);
        }
    }

    public String rollDefence(String defenceName, int modifier, int chance, int sizeNum, int qualityNum) {
        int roll = rand.nextInt(100) + modifier;
        int sizeRoll = 0;
        int qualityRoll = 0;
        String result = "";
        String forceSize = "";
        String forceQuality = "";

        if (roll < chance) {
            result = defenceName + ": ";
            for (int i = 0; i < sizeNum; i++) {
                sizeRoll += rand.nextInt(10) + 1;
            }
            for (int i = 0; i < qualityNum; i++) {
                qualityRoll += rand.nextInt(10) + 1;
            }
            if (sizeRoll < 3) {
                forceSize = forceSizeOptions.get(0);
            }
            else if (sizeRoll < 6) {
                forceSize = forceSizeOptions.get(1);
            }
            else if (sizeRoll < 10) {
                forceSize = forceSizeOptions.get(2);
            }
            else if (sizeRoll < 15) {
                forceSize = forceSizeOptions.get(3);
            }
            else if (sizeRoll < 20) {
                forceSize = forceSizeOptions.get(4);
            }
            else {
                forceSize = forceSizeOptions.get(5);
            }

            if (qualityRoll < 4) {
                forceQuality = forceQualityOptions.get(0);
            }
            else if (qualityRoll < 9) {
                forceQuality = forceQualityOptions.get(1);
            }
            else if (qualityRoll < 15) {
                forceQuality = forceQualityOptions.get(2);
            }
            else if (qualityRoll < 20) {
                forceQuality = forceQualityOptions.get(3);
            }
            else {
                forceQuality = forceQualityOptions.get(4);
            }


            result = result + "force size - " + forceSize + ", quality - " + forceQuality + "\n";

        }

        return result;
    }

    public String getRandomDefences(String pClass, String techLevel) {
        int modifier = 0;
        String defences = "test";

        if (techLevel.equals(techLevelOptions.get(0))) {
            modifier += 18;
        }
        else if (techLevel.equals(techLevelOptions.get(1))) {
            modifier += 15;
        }
        else if (techLevel.equals(techLevelOptions.get(2))) {
            modifier += 12;
        }
        else if (techLevel.equals(techLevelOptions.get(3))) {
            modifier += 9;
        }
        else if (techLevel.equals(techLevelOptions.get(4))) {
            modifier += 6;
        }
        else if (techLevel.equals(techLevelOptions.get(5))) {
            modifier += 3;
        }
        else if (techLevel.equals(techLevelOptions.get(6))) {
            modifier += 0;
        }
        else if (techLevel.equals(techLevelOptions.get(7))) {
            modifier += -3;
        }
        else if (techLevel.equals(techLevelOptions.get(8))) {
            modifier += -6;
        }
        else if (techLevel.equals(techLevelOptions.get(9))) {
            modifier += -9;
        }
        else if (techLevel.equals(techLevelOptions.get(10))) {
            modifier += -12;
        }
        else {
            modifier += -15;
        }

        if (pClass.equals(pClassOptions.get(0))) {
            defences =
                    rollDefence("Enforcers", modifier, 99, 3, 2) +
                            rollDefence("Militia", modifier, 99, 3, 2) +
                            rollDefence("Standing Army", modifier, 99, 3, 3) +
                            rollDefence("Armoured Force", modifier, 99, 3, 3) +
                            rollDefence("Titan Force", modifier, 30, 2, 2) +
                            rollDefence("Private Army/Armies", modifier, 30, 2, 2) +
                            rollDefence("Naval Force", modifier, 99, 3, 3) +
                            rollDefence("Orbital Station(s)", modifier, 50, 2, 2) +
                            rollDefence("Missile Silos (planet)", modifier, 85, 3, 2) +
                            rollDefence("Missile Silos (orbital)", modifier, 70, 2, 2) +
                            rollDefence("Defence Lasers", modifier, 30, 3, 2) +
                            rollDefence("Mercenary Force", modifier, 10, 3, 2);

        }
        else if (pClass.equals(pClassOptions.get(1))) {
            defences =
                    rollDefence("Enforcers", modifier, 99, 3, 2) +
                            rollDefence("Militia", modifier, 10, 1, 1) +
                            rollDefence("Standing Army", modifier, 30, 1, 2) +
                            rollDefence("Armoured Force", modifier, 3, 1, 1) +
                            rollDefence("Titan Force", modifier, 1, 1, 2) +
                            rollDefence("Private Army/Armies", modifier, 40, 1, 1) +
                            rollDefence("Naval Force", modifier, 30, 1, 2) +
                            rollDefence("Orbital Station(s)", modifier, 30, 1, 1) +
                            rollDefence("Missile Silos (planet)", modifier, 1, 1, 1) +
                            rollDefence("Missile Silos (orbital)", modifier, 1, 1, 1) +
                            rollDefence("Defence Lasers", modifier, 1, 1, 1) +
                            rollDefence("Mercenary Force", modifier, 30, 2, 2);
        }
        else if (pClass.equals(pClassOptions.get(2))) {
            defences =
                    rollDefence("Enforcers", modifier, 90, 1, 1) +
                            rollDefence("Militia", modifier, 75, 1, 1) +
                            rollDefence("Standing Army", modifier, 50, 1, 2) +
                            rollDefence("Armoured Force", modifier, 5, 1, 1) +
                            rollDefence("Titan Force", modifier, 5, 1, 2) +
                            rollDefence("Private Army/Armies", modifier, 30, 1, 2) +
                            rollDefence("Naval Force", modifier, 25, 1, 2) +
                            rollDefence("Orbital Station(s)", modifier, 5, 1, 1) +
                            rollDefence("Missile Silos (planet)", modifier, 5, 1, 1) +
                            rollDefence("Missile Silos (orbital)", modifier, 5, 1, 1) +
                            rollDefence("Defence Lasers", modifier, 15, 1, 1) +
                            rollDefence("Mercenary Force", modifier, 30, 2, 2);
        }
        else if (pClass.equals(pClassOptions.get(3))) {
            defences =
                    rollDefence("Enforcers", modifier, 50, 2, 2) +
                            rollDefence("Militia", modifier, 20, 1, 2) +
                            rollDefence("Standing Army", modifier, 60, 2, 2) +
                            rollDefence("Armoured Force", modifier, 90, 3, 3) +
                            rollDefence("Titan Force", modifier, 70, 3, 3) +
                            rollDefence("Private Army/Armies", modifier, 5, 1, 2) +
                            rollDefence("Naval Force", modifier, 90, 3, 3) +
                            rollDefence("Orbital Station(s)", modifier, 80, 2, 3) +
                            rollDefence("Missile Silos (planet)", modifier, 90, 2, 3) +
                            rollDefence("Missile Silos (orbital)", modifier, 90, 3, 3) +
                            rollDefence("Defence Lasers", modifier, 90, 3, 3) +
                            rollDefence("Mercenary Force", modifier, 1, 1, 2);
        }
        else if (pClass.equals(pClassOptions.get(4))) {
            defences =
                    rollDefence("Enforcers", modifier, 95, 2, 2) +
                            rollDefence("Militia", modifier, 60, 3, 1) +
                            rollDefence("Standing Army", modifier, 5, 2, 2) +
                            rollDefence("Armoured Force", modifier, 1, 1, 1) +
                            rollDefence("Titan Force", modifier, 1, 1, 1) +
                            rollDefence("Private Army/Armies", modifier, 20, 2, 2) +
                            rollDefence("Naval Force", modifier, 5, 1, 2) +
                            rollDefence("Orbital Station(s)", modifier, 15, 1, 2) +
                            rollDefence("Missile Silos (planet)", modifier, 1, 1, 1) +
                            rollDefence("Missile Silos (orbital)", modifier, 1, 1, 1) +
                            rollDefence("Defence Lasers", modifier, 30, 1, 1) +
                            rollDefence("Mercenary Force", modifier, 10, 1, 1);
        }
        else if (pClass.equals(pClassOptions.get(5))) {
            defences =
                    rollDefence("Enforcers", modifier, 90, 3, 2) +
                            rollDefence("Militia", modifier, 90, 2, 2) +
                            rollDefence("Standing Army", modifier, 90, 3, 2) +
                            rollDefence("Armoured Force", modifier, 50, 2, 3) +
                            rollDefence("Titan Force", modifier, 1, 1, 1) +
                            rollDefence("Private Army/Armies", modifier, 15, 2, 2) +
                            rollDefence("Naval Force", modifier, 15, 1, 2) +
                            rollDefence("Orbital Station(s)", modifier, 10, 1, 1) +
                            rollDefence("Missile Silos (planet)", modifier, 75, 3, 2) +
                            rollDefence("Missile Silos (orbital)", modifier, 65, 2, 1) +
                            rollDefence("Defence Lasers", modifier, 40, 1, 1) +
                            rollDefence("Mercenary Force", modifier, 40, 3, 2);
        }
        else if (pClass.equals(pClassOptions.get(6))) {
            defences =
                    rollDefence("Enforcers", modifier, 50, 2, 4) +
                            rollDefence("Militia", modifier, 10, 2, 5) +
                            rollDefence("Standing Army", modifier, 60, 3, 3) +
                            rollDefence("Armoured Force", modifier, 80, 4, 3) +
                            rollDefence("Titan Force", modifier, 65, 2, 3) +
                            rollDefence("Private Army/Armies", modifier, 15, 2, 3) +
                            rollDefence("Naval Force", modifier, 75, 3, 3) +
                            rollDefence("Orbital Station(s)", modifier, 90, 5, 4) +
                            rollDefence("Missile Silos (planet)", modifier, 95, 4, 4) +
                            rollDefence("Missile Silos (orbital)", modifier, 80, 3, 5) +
                            rollDefence("Defence Lasers", modifier, 95, 3, 5) +
                            rollDefence("Mercenary Force", modifier, 15, 3, 5);
        }
        else if (pClass.equals(pClassOptions.get(7))) {
            defences =
                    rollDefence("Enforcers", modifier, 75, 2, 2) +
                            rollDefence("Militia", modifier, 99, 2, 2) +
                            rollDefence("Standing Army", modifier, 99, 3, 2) +
                            rollDefence("Armoured Force", modifier, 0, 0, 0) +
                            rollDefence("Titan Force", modifier, 15, 1, 1) +
                            rollDefence("Private Army/Armies", modifier, 90, 2, 2) +
                            rollDefence("Naval Force", modifier, 0, 0, 0) +
                            rollDefence("Orbital Station(s)", modifier, 0, 0, 0) +
                            rollDefence("Missile Silos (planet)", modifier, 0, 0, 0) +
                            rollDefence("Missile Silos (orbital)", modifier, 0, 0, 0) +
                            rollDefence("Defence Lasers", modifier, 0, 0, 0) +
                            rollDefence("Mercenary Force", modifier, 85, 2, 2);
        }
        else if (pClass.equals(pClassOptions.get(8))) {
            defences =
                    rollDefence("Enforcers", modifier, 20, 1, 2) +
                            rollDefence("Militia", modifier, 99, 3, 2) +
                            rollDefence("Standing Army", modifier, 90, 3, 2) +
                            rollDefence("Armoured Force", modifier, 0, 0, 0) +
                            rollDefence("Titan Force", modifier, 5, 1, 1) +
                            rollDefence("Private Army/Armies", modifier, 99, 2, 2) +
                            rollDefence("Naval Force", modifier, 0, 0, 0) +
                            rollDefence("Orbital Station(s)", modifier, 0, 0, 0) +
                            rollDefence("Missile Silos (planet)", modifier, 0, 0, 0) +
                            rollDefence("Missile Silos (orbital)", modifier, 0, 0, 0) +
                            rollDefence("Defence Lasers", modifier, 0, 0, 0) +
                            rollDefence("Mercenary Force", modifier, 0, 0, 0);
        }
        else if (pClass.equals(pClassOptions.get(9))) {
            defences =
                    rollDefence("Enforcers", modifier, 60, 2, 3) +
                            rollDefence("Militia", modifier, 20, 2, 2) +
                            rollDefence("Standing Army", modifier, 40, 1, 2) +
                            rollDefence("Armoured Force", modifier, 1, 1, 2) +
                            rollDefence("Titan Force", modifier, 1, 1, 2) +
                            rollDefence("Private Army/Armies", modifier, 1, 1, 2) +
                            rollDefence("Naval Force", modifier, 10, 1, 2) +
                            rollDefence("Orbital Station(s)", modifier, 1, 1, 2) +
                            rollDefence("Missile Silos (planet)", modifier, 1, 1, 1) +
                            rollDefence("Missile Silos (orbital)", modifier, 1, 1, 1) +
                            rollDefence("Defence Lasers", modifier, 1, 1, 1) +
                            rollDefence("Mercenary Force", modifier, 0, 0, 0);
        }
        else if (pClass.equals(pClassOptions.get(10))) {
            defences =
                    rollDefence("Enforcers", modifier, 10, 2, 2) +
                            rollDefence("Militia", modifier, 0, 0, 0) +
                            rollDefence("Standing Army", modifier, 10, 1, 2) +
                            rollDefence("Armoured Force", modifier, 0, 0, 0) +
                            rollDefence("Titan Force", modifier, 0, 0, 0) +
                            rollDefence("Private Army/Armies", modifier, 10, 1, 2) +
                            rollDefence("Naval Force", modifier, 0, 0, 0) +
                            rollDefence("Orbital Station(s)", modifier, 0, 0, 0) +
                            rollDefence("Missile Silos (planet)", modifier, 0, 0, 0) +
                            rollDefence("Missile Silos (orbital)", modifier, 0, 0, 0) +
                            rollDefence("Defence Lasers", modifier, 0, 0, 0) +
                            rollDefence("Mercenary Force", modifier, 0, 0, 0);
        }
        else if (pClass.equals(pClassOptions.get(11))) {
            defences =
                    rollDefence("Enforcers", modifier, 90, 3, 2) +
                            rollDefence("Militia", modifier, 10, 2, 2) +
                            rollDefence("Standing Army", modifier, 40, 2, 2) +
                            rollDefence("Armoured Force", modifier, 5, 1, 2) +
                            rollDefence("Titan Force", modifier, 0, 0, 0) +
                            rollDefence("Private Army/Armies", modifier, 30, 3, 2) +
                            rollDefence("Naval Force", modifier, 5, 2, 2) +
                            rollDefence("Orbital Station(s)", modifier, 1, 1, 2) +
                            rollDefence("Missile Silos (planet)", modifier, 1, 1, 2) +
                            rollDefence("Missile Silos (orbital)", modifier, 1, 1, 2) +
                            rollDefence("Defence Lasers", modifier, 15, 2, 2) +
                            rollDefence("Mercenary Force", modifier, 30, 2, 2);
        }
        else if (pClass.equals(pClassOptions.get(12))) {
            defences = "Your discretion";
        }
        else if (pClass.equals(pClassOptions.get(13))) {
            defences =
                    rollDefence("Enforcers", modifier, 50, 2, 2) +
                            rollDefence("Militia", modifier, 30, 2, 2) +
                            rollDefence("Standing Army", modifier, 5, 1, 2) +
                            rollDefence("Armoured Force", modifier, 1, 1, 1) +
                            rollDefence("Titan Force", modifier, 1, 1, 1) +
                            rollDefence("Private Army/Armies", modifier, 20, 1, 1) +
                            rollDefence("Naval Force", modifier, 1, 1, 1) +
                            rollDefence("Orbital Station(s)", modifier, 0, 0, 0) +
                            rollDefence("Missile Silos (planet)", modifier, 0, 0, 0) +
                            rollDefence("Missile Silos (orbital)", modifier, 0, 0, 0) +
                            rollDefence("Defence Lasers", modifier, 0, 0, 0) +
                            rollDefence("Mercenary Force", modifier, 20, 1, 2);
        }
        else if (pClass.equals(pClassOptions.get(14))) {
            defences = "Your discretion";
        }
        else if (pClass.equals(pClassOptions.get(15))) {
            defences = "Your discretion";
        }
        else if (pClass.equals(pClassOptions.get(16))) {
            defences = "Your discretion";
        }
        else if (pClass.equals(pClassOptions.get(17))) {
            defences = "Your discretion";
        }
        else if (pClass.equals(pClassOptions.get(18))) {
            defences = "Your discretion";
        }
        else if (pClass.equals(pClassOptions.get(19))) {
            defences =
                    rollDefence("Enforcers", modifier, 30, 4, 2) +
                            rollDefence("Militia", modifier, 75, 3, 3) +
                            rollDefence("Standing Army", modifier, 15, 2, 2) +
                            rollDefence("Armoured Force", modifier, 0, 0, 0) +
                            rollDefence("Titan Force", modifier, 1, 1, 5) +
                            rollDefence("Private Army/Armies", modifier, 60, 2, 2) +
                            rollDefence("Naval Force", modifier, 55, 5, 3) +
                            rollDefence("Orbital Station(s)", modifier, 95, 3, 2) +
                            rollDefence("Missile Silos (planet)", modifier, 0, 0, 0) +
                            rollDefence("Missile Silos (orbital)", modifier, 30, 1, 1) +
                            rollDefence("Defence Lasers", modifier, 0, 0, 0) +
                            rollDefence("Mercenary Force", modifier, 80, 1, 1);
        }
        return defences;
    }
}