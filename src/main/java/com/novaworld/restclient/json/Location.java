package com.novaworld.restclient.json;

/**
 * @author ango1019
 * Date: 01.07.2020
 * Time: 19:46
 */
public class Location {
    private double lat;
    private double lng;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", lat, lng);
    }
}