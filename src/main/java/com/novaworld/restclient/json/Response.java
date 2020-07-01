package com.novaworld.restclient.json;

import java.util.List;

/**
 * @author ango1019
 * Date: 01.07.2020
 * Time: 19:51
 */
public class Response {
    private List<Result> results;
    private String status;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Location getLocation() {
        return results.get(0).getGeometry().getLocation();
    }

    public String getFormattedAddress() {
        return results.get(0).getFormattedAddress();
    }
}