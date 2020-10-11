package com.company;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        super.getKey().setBodyType("Planet");
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getClass() == Moon.class) {
            return this.satellites.add(moon);
        }
        return false;
    }
}
