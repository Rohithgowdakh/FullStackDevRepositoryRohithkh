package com.programs.constructor.parameterized;

class Country {
    String countryName;
    int population;
    String capitalCity;
    String continent;

    Country(String cName, int cPopulation, String cCapital, String cContinent) {
        countryName = cName;
        population = cPopulation;
        capitalCity = cCapital;
        continent = cContinent;
        System.out.println("Country Name: " + countryName);
        System.out.println("Population: " + population);
        System.out.println("Capital City: " + capitalCity);
        System.out.println("Continent: " + continent);
        System.out.println();
    }
}

class State {
    String stateName;
    int population;
    String capitalCity;
    String chiefMinister;

    State(String sName, int sPopulation, String sCapital, String sMinister) {
        stateName = sName;
        population = sPopulation;
        capitalCity = sCapital;
        chiefMinister = sMinister;
        System.out.println("State Name: " + stateName);
        System.out.println("Population: " + population);
        System.out.println("Capital City: " + capitalCity);
        System.out.println("Chief Minister: " + chiefMinister);
        System.out.println();
    }
}

class District {
    String districtName;
    int population;
    String districtHeadquarters;
    String state;

    District(String dName, int dPopulation, String dHeadquarters, String dState) {
        districtName = dName;
        population = dPopulation;
        districtHeadquarters = dHeadquarters;
        state = dState;
        System.out.println("District Name: " + districtName);
        System.out.println("Population: " + population);
        System.out.println("District Headquarters: " + districtHeadquarters);
        System.out.println("State: " + state);
        System.out.println();
    }
}

class Village {
    String villageName;
    int population;
    String panchayat;
    String district;

    Village(String vName, int vPopulation, String vPanchayat, String vDistrict) {
        villageName = vName;
        population = vPopulation;
        panchayat = vPanchayat;
        district = vDistrict;
        System.out.println("Village Name: " + villageName);
        System.out.println("Population: " + population);
        System.out.println("Panchayat: " + panchayat);
        System.out.println("District: " + district);
        System.out.println();
    }
}

public class LocatinDetails {
    public static void main(String[] args) {
        Country country1 = new Country("India", 1393409038, "New Delhi", "Asia");
        State state1 = new State("Karnataka", 61095297, "Bengaluru", "Basavaraj Bommai");
        District district1 = new District("Bengaluru Urban", 9650000, "Bengaluru", "Karnataka");
        Village village1 = new Village("Madhugiri", 27350, "Madhugiri Panchayat", "Tumkur");
    }
}

