package com.novaworld.restclient.services;

import com.novaworld.restclient.json.JokeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ango1019
 * Date: 30.06.2020
 * Time: 16:59
 */
@Service
public class JokeService {

    private static final String BASE = "http://api.icndb.com/jokes/random?limitTo=[nerdy]";

    private final RestTemplate restTemplate;

    @Autowired
    public JokeService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public String getJoke(String firstName, String secondName) {
        String url = String.format("%s&firstName=%s&lastName=%s", BASE, firstName, secondName);
        JokeResponse response = restTemplate.getForObject(url, JokeResponse.class);
        String output = "";
        if (response != null) {
             output = response.getValue().getJoke();
        }
        return output;
    }
}