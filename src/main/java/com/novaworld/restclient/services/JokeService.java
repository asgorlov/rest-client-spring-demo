package com.novaworld.restclient.services;

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

    private RestTemplate restTemplate;

    @Autowired
    public JokeService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }
}