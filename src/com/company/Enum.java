package com.company.util;

public class Enum {
    public enum BMW {
        E90(2005, 300000), E91(2006, 500000), E92(2007, 400000), M3(2008, 200000);
        //E60, E61, E62, M5,
        //E30, E31, E32, M2,
        //F30, F31, F32, FM3,
        //F10, F11, F12, FM5;


        private double Year;
        private double NrOfCars;

        BMW(double Year, double NrOfCars) {
            this.Year = Year;
            this.NrOfCars = NrOfCars;
        }
    }
}

