package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
//    private City mockCity() {
//        return new City("Edmonton", "Alberta");
//    }
//    private CustomList mockCityList() {
//        CustomList cityList = new CustomList();
//        cityList.add(mockCity());
//        return cityList;
//    }
private CustomList list;
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }


//    @Test
//    void testAdd() {
//        CustomList cityList = mockCityList();
//        assertEquals(1, cityList.getCities().size());
//        City city = new City("Regina", "Saskatchewan");
//        cityList.add(city);
//        assertEquals(2, cityList.getCities().size());
//        assertTrue(cityList.getCities().contains(city));
//    }
//
//    @Test
//    void testAddException() {
//        CustomList cityList = mockCityList();
//        City city = new City("Yellowknife", "Northwest Territories");
//        cityList.add(city);
//        assertThrows(IllegalArgumentException.class, () -> {
//            cityList.add(city);
//        });
//    }
//
//    @Test
//    void testGetCities() {
//        CustomList cityList = mockCityList();
//        assertEquals(0,
//                mockCity().compareTo(cityList.getCities().get(0)));
//        City city = new City("Charlottetown", "Prince Edward Island");
//        cityList.add(city);
//        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
//        assertEquals(0,
//                mockCity().compareTo(cityList.getCities().get(1)));
//    }
//
//    @Test
//    void test_hasCity() {
//        CustomList cityList = mockCityList();
//        City city = new City("Charlottetown", "Prince Edward Island");
//        cityList.add(city);
////        assertEquals("Charlottetown", cityList.getCities().get(0));
//        assertTrue(cityList.hasCity(city));
//    }
//
//    @Test
//    void test_deleteCity() {
//        CustomList cityList = mockCityList();
//        City city = new City("Charlottetown", "Prince Edward Island");
//        cityList.add(city);
////        assertEquals("Charlottetown", cityList.getCities().get(0));
////        assertTrue(cityList.hasCity(city));
//        cityList.delete(city);
//        assertFalse(cityList.hasCity(city));
//    }
//
//
//    @Test
//    void test_deleteCityException() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            CustomList cityList = mockCityList();
//            City city = new City("Charlottetown", "Prince Edward Island");
//            cityList.add(city);
////            assertEquals("Charlottetown", cityList.getCities().get(0));
////            assertTrue(cityList.hasCity(city));
//            cityList.delete(city);
////            assertFalse(cityList.hasCity(city));
//            cityList.delete(city);
//        });
//    }
//
//    @Test
//    void test_countCities() {
//        CustomList cityList = mockCityList();
////        assertEquals(0, cityList.getCities().size());
//        assertEquals(1, cityList.getCount()); // adds 1 city at construction
//        City city1 = new City("Charlottetown1", "Prince Edward Island1");
//        cityList.add(city1);
//        City city2 = new City("Charlottetown2", "Prince Edward Island2");
//        cityList.add(city2);
////        assertEquals(2, cityList.getCities().size());
//        assertEquals(3, cityList.getCount());
//    }

}
