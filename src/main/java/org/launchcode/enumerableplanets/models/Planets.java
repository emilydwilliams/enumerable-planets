package org.launchcode.enumerableplanets.models;

public enum Planets {

    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200),
    PLUTO("Pluto", 90560);

    private final String displayName;
    private final int daysInYear;

    Planets(String displayName, int daysInYear) {
        this.displayName = displayName;
        this.daysInYear = daysInYear;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getDaysInYear() {
        return daysInYear;
    }
}
