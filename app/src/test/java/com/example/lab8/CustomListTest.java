package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCities().size();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCities().size(), listSize + 1);
    }

    @Test
    void test_hasCity() {
        CustomList cityList = MockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        assertEquals("Charlottetown", cityList.getCities().get(0));
        assertTrue(cityList.hasCity(city));
    }
    
//    @Test
//    void test_deleteCity() {
//        CustomList cityList = MockCityList();
//        City city = new City("Charlottetown", "Prince Edward Island");
//        cityList.add(city);
//        assertEquals("Charlottetown", cityList.getCities().get(0));
//        assertTrue(cityList.hasCity(city));
//        cityList.deleteCity(city);
//        assertFalse(cityList.hasCity(city));
//    }
//
//    @Test
//    void test_countCities() {
//        CustomList cityList = MockCityList();
//        assertEquals(0, cityList.getCityCount());
//        City city1 = new City("Charlottetown1", "Prince Edward Island1");
//        cityList.add(city1);
//        City city2 = new City("Charlottetown2", "Prince Edward Island2");
//        cityList.add(city2);
//        assertEquals(2, cityList.getCityCount());
//    }

}
