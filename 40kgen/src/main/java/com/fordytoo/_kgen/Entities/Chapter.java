package com.fordytoo._kgen.Entities;

import jakarta.persistence.*;

import java.util.Random;

@Entity
@Table(name="chapters")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String whyFounded;
    private String whenFounded;
    private String progenitor;
    private String gsPurity;
    private String demeanour;
    private String figureOfLegend;
    private String deedsOfLegend;
    private String beliefs;

    public Chapter() {

    }

    public Chapter(String name, String whyFounded, String whenFounded, String progenitor, String gsPurity, String demeanour, String figureOfLegend, String deedsOfLegend, String beliefs) {
        this.name = name;
        this.whyFounded = whyFounded;
        this.whenFounded = whenFounded;
        this.progenitor = progenitor;
        this.gsPurity = gsPurity;
        this.demeanour = demeanour;
        this.figureOfLegend = figureOfLegend;
        this.deedsOfLegend = deedsOfLegend;
        this.beliefs = beliefs;
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

    public String getWhyFounded() {
        return whyFounded;
    }

    public void setWhyFounded(String whyFounded) {
        this.whyFounded = whyFounded;
    }

    public String getWhenFounded() {
        return whenFounded;
    }

    public void setWhenFounded(String whenFounded) {
        this.whenFounded = whenFounded;
    }

    public String getProgenitor() {
        return progenitor;
    }

    public void setProgenitor(String progenitor) {
        this.progenitor = progenitor;
    }

    public String getGsPurity() {
        return gsPurity;
    }

    public void setGsPurity(String gsPurity) {
        this.gsPurity = gsPurity;
    }

    public String getDemeanour() {
        return demeanour;
    }

    public void setDemeanour(String demeanour) {
        this.demeanour = demeanour;
    }

    public String getFigureOfLegend() {
        return figureOfLegend;
    }

    public void setFigureOfLegend(String figureOfLegend) {
        this.figureOfLegend = figureOfLegend;
    }

    public String getDeedsOfLegend() {
        return deedsOfLegend;
    }

    public void setDeedsOfLegend(String deedsOfLegend) {
        this.deedsOfLegend = deedsOfLegend;
    }

    public String getBeliefs() {
        return beliefs;
    }

    public void setBeliefs(String beliefs) {
        this.beliefs = beliefs;
    }

}