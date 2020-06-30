package com.novaworld.restclient.json;

/**
 * @author ango1019
 * Date: 30.06.2020
 * Time: 17:21
 */
public class JokeResponse {
    private String status;
    private Value value;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}