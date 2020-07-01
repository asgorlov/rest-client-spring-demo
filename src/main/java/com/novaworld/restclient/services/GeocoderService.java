package com.novaworld.restclient.services;

import com.novaworld.restclient.entity.Site;
import com.novaworld.restclient.json.Response;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author ango1019
 * Date: 01.07.2020
 * Time: 20:02
 */
@Service
public class GeocoderService {
    private static final String BASE = "https://maps.googleapis.com/maps/api/geocode/json";
    private static final String KEY = "AIzaSyDw_d6dfxDEI7MAvqfGXEIsEMwjC1PWRno";

    private RestTemplate restTemplate;

    public GeocoderService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public Site getLatLng(String...address) {
        String joinedAddress = String.join(",", address);
        String encodeAddress = "";
        encodeAddress = URLEncoder.encode(joinedAddress, StandardCharsets.UTF_8);

        Response response = restTemplate.getForObject(
                String.format("%s?address=%s&key=%s", BASE, encodeAddress, KEY),
                Response.class);

        return new Site(response.getFormattedAddress(),
                        response.getLocation().getLat(),
                        response.getLocation().getLng());
    }
}