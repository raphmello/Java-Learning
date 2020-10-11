package com.company;

import java.util.HashSet;
import java.util.Set;




public abstract class HeavenlyBody {
    private final double orbitalPeriod;
    public final Set<HeavenlyBody> satellites;
    private Key key;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        key = new Key(name, "");
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }



    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
//        System.out.println("hashCode called");
        return this.key.hashCode();
    }

    public static final class Key {
        private String name;
        private String bodyType;

        public Key(String name, String bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }
        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }
        public String getName() {
            return name;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.getBodyType().hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())) {
                return (this.getBodyType() == key.getBodyType());
            }
            return false;
        }
    }
}
