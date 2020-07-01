package com.novaworld.restclient.json;

/**
 * @author ango1019
 * Date: 01.07.2020
 * Time: 19:49
 */
public class Result {
    private Geometry geometry;
    private String formattedAddress;

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }
}