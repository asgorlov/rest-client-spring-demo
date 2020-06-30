package com.novaworld.restclient.json;

import java.util.List;

/**
 * @author ango1019
 * Date: 30.06.2020
 * Time: 17:19
 */
public class Value {
    private int id;
    private String joke;
    private List<String> categories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
}