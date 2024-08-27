package com.programs.NoArgs.constructor;

class Country {
    String countryName;
    int population;
    String capitalCity;
    String continent;

    Country() {
        countryName = "India";
        population = 1393409038;
        capitalCity = "New Delhi";
        continent = "Asia";
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

    State() {
        stateName = "Karnataka";
        population = 61095297;
        capitalCity = "Bengaluru";
        chiefMinister = "Basavaraj Bommai";
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

    District() {
        districtName = "Bengaluru Urban";
        population = 9650000;
        districtHeadquarters = "Bengaluru";
        state = "Karnataka";
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

    Village() {
        villageName = "Madhugiri";
        population = 27350;
        panchayat = "Madhugiri Panchayat";
        district = "Tumkur";
        System.out.println("Village Name: " + villageName);
        System.out.println("Population: " + population);
        System.out.println("Panchayat: " + panchayat);
        System.out.println("District: " + district);
        System.out.println();
    }
}

public class Address {
    public static void main(String[] args) {
        Country country = new Country();
        State state = new State();
        District district = new District();
        Village village = new Village();
    }
}

