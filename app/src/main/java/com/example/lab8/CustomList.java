package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cityCustomList;
    private Context context;

    public CustomList(Context context, ArrayList<City> cityCustomList) {
        super(context, 0, cityCustomList);
        this.cityCustomList = cityCustomList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.content, parent, false);
        }

        City city = cityCustomList.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    /**
     * This returns a sorted list of cities.
     *
     * @return List cities
     * Return the sorted list
     */
    public List getCities() {
        List list = cityCustomList;
        Collections.sort(list);
        return list;
    }

    /**
     * This adds a city to the list if the city does not exist,
     * otherwise it throws an IllegalArgumentException.
     *
     * @param city This is a candidate city to add.
     */
    public void addCity(City city) {
        if (cityCustomList.contains(city)) {
            throw new IllegalArgumentException();
        }
        cityCustomList.add(city);
    }

    /**
     * This checks if 'cities' list contains a specific city.
     *
     * @param city This is the city to check.
     */
    public boolean hasCity(City city) {
//        return cityCustomList.contains(city);
    }

    /**
     * This deletes a city from the list,
     * and if the city does not exist then it throws an IllegalArgumentException.
     *
     * @param city This is the city to delete.
     */
    public void deleteCity(City city) {
//        if (cityCustomList.contains(city)) {
//            cityCustomList.remove(city);
//        } else {
//            throw new IllegalArgumentException();
//        }
    }

    /**
     * This count of city list.
     *
     * @return cityCustomList.size()
     */
    public int getCityCount() {
//        return cityCustomList.size();
    }

}
