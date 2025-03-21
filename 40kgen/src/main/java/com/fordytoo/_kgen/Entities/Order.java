package com.fordytoo._kgen.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String originator;
    private String founding;
    private String flaw;
    private String demeanour;
    private String primarySaint;
    private String saintDeeds;
    private String homeworld;
    private String strategy;
    private String methodsOfWorship;
    private String size;
    private String allies;
    private String enemies;

    public Order() {}

    public Order(String name, String originator, String founding, String flaw, String demeanour, String primarySaint, String saintDeeds, String homeworld, String strategy, String methodsOfWorship, String size, String allies, String enemies) {
        this.name = name;
        this.originator = originator;
        this.founding = founding;
        this.flaw = flaw;
        this.demeanour = demeanour;
        this.primarySaint = primarySaint;
        this.saintDeeds = saintDeeds;
        this.homeworld = homeworld;
        this.strategy = strategy;
        this.methodsOfWorship = methodsOfWorship;
        this.size = size;
        this.allies = allies;
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

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public String getFounding() {
        return founding;
    }

    public void setFounding(String founding) {
        this.founding = founding;
    }

    public String getFlaw() {
        return flaw;
    }

    public void setFlaw(String flaw) {
        this.flaw = flaw;
    }

    public String getDemeanour() {
        return demeanour;
    }

    public void setDemeanour(String demeanour) {
        this.demeanour = demeanour;
    }

    public String getPrimarySaint() {
        return primarySaint;
    }

    public void setPrimarySaint(String primarySaint) {
        this.primarySaint = primarySaint;
    }

    public String getSaintDeeds() {
        return saintDeeds;
    }

    public void setSaintDeeds(String saintDeeds) {
        this.saintDeeds = saintDeeds;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getMethodsOfWorship() {
        return methodsOfWorship;
    }

    public void setMethodsOfWorship(String methodsOfWorship) {
        this.methodsOfWorship = methodsOfWorship;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAllies() {
        return allies;
    }

    public void setAllies(String allies) {
        this.allies = allies;
    }

    public String getEnemies() {
        return enemies;
    }

    public void setEnemies(String enemies) {
        this.enemies = enemies;
    }
}
