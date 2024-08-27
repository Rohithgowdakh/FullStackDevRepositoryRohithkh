package com.gentech.programs;

class Country 
{
    String countryName;
    String countryCode;
}

class State 
{
    String stateName;
    String stateCode;
}

class District 
{
    String districtName;
    int districtCode;
}

class Village 
{
    String villageName;
    int villageCode;
}

public class Address {
    public static void main(String[] args) {
        Country india = new Country();
        india.countryName = "India";
        india.countryCode = "IN";
        System.out.println("Country name: " + india.countryName);
        System.out.println("Country code: " + india.countryCode);
        System.out.println("++++++++++++++");

        State karnataka = new State();
        karnataka.stateName = "Karnataka";
        karnataka.stateCode = "KA";
        System.out.println("State name: " + karnataka.stateName);
        System.out.println("State code: " + karnataka.stateCode);
        System.out.println("++++++++++++++");

        District bangalore = new District();
        bangalore.districtName = "Bangalore";
        bangalore.districtCode = 560;
        System.out.println("District name: " + bangalore.districtName);
        System.out.println("District code: " + bangalore.districtCode);
        System.out.println("++++++++++++++");

        Village koramangala = new Village();
        koramangala.villageName = "Koramangala";
        koramangala.villageCode = 1;
        System.out.println("Village name: " + koramangala.villageName);
        System.out.println("Village code: " + koramangala.villageCode);
        System.out.println("++++++++++++++");
    }
}
