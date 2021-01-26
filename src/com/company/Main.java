package com.company;

public class Main {

    public static void main(String[] args) {
	String city= "Columbus";
	int zipCode= 43215;

	int dailyHighs[] ={25,27,32,40,45};
	float averageTemp = (dailyHighs[0]+dailyHighs[1]+dailyHighs[2]+dailyHighs[3]+dailyHighs[4])/5;
	System.out.println("City: "+city.toUpperCase()+" Zip Code: "+zipCode+" Average High Temperature "+averageTemp);
    }
}
