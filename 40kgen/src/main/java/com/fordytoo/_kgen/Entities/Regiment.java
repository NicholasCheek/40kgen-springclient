package com.fordytoo._kgen.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "regiments")
public class Regiment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String classification;
    private String recruitmentCriteria;
    private String natureOfRecruitment;
    private String homeworld;
    private String coreUnits;
    private String specialization;
    private String loyaltyRating;
    private String specialEquipment;
    private String creed;
    private String friends;
    private String enemies;

    public Regiment() {}

    public Regiment(String name, String classification, String recruitmentCriteria, String natureOfRecruitment, String homeworld, String coreUnits, String specialization, String loyaltyRating, String specialEquipment, String creed, String friends, String enemies) {
        this.name = name;
        this.classification = classification;
        this.recruitmentCriteria = recruitmentCriteria;
        this.natureOfRecruitment = natureOfRecruitment;
        this.homeworld = homeworld;
        this.coreUnits = coreUnits;
        this.specialization = specialization;
        this.loyaltyRating = loyaltyRating;
        this.specialEquipment = specialEquipment;
        this.creed = creed;
        this.friends = friends;
        this.enemies = enemies;
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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getRecruitmentCriteria() {
        return recruitmentCriteria;
    }

    public void setRecruitmentCriteria(String recruitmentCriteria) {
        this.recruitmentCriteria = recruitmentCriteria;
    }

    public String getNatureOfRecruitment() {
        return natureOfRecruitment;
    }

    public void setNatureOfRecruitment(String natureOfRecruitment) {
        this.natureOfRecruitment = natureOfRecruitment;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getCoreUnits() {
        return coreUnits;
    }

    public void setCoreUnits(String coreUnits) {
        this.coreUnits = coreUnits;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getLoyaltyRating() {
        return loyaltyRating;
    }

    public void setLoyaltyRating(String loyaltyRating) {
        this.loyaltyRating = loyaltyRating;
    }

    public String getSpecialEquipment() {
        return specialEquipment;
    }

    public void setSpecialEquipment(String specialEquipment) {
        this.specialEquipment = specialEquipment;
    }

    public String getCreed() {
        return creed;
    }

    public void setCreed(String creed) {
        this.creed = creed;
    }

    public String getFriends() {
        return friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }

    public String getEnemies() {
        return enemies;
    }

    public void setEnemies(String enemies) {
        this.enemies = enemies;
    }
}
