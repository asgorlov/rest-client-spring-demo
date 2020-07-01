package com.novaworld.restclient.services;

import com.novaworld.restclient.entity.Site;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ango1019
 * Date: 01.07.2020
 * Time: 21:32
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class GeocoderServiceTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(GeocoderServiceTest.class);

    @Autowired
    private GeocoderService service;

    @Test
    void getLatLngForGoogleHeadquarters() {
        Site google = service.getLatLng("1600 Amphitheatre Parkway", "Mountain View", "CA");
        LOGGER.info(google.toString());
        assertEquals(37.42, google.getLatitude(), 0.01);
        assertEquals(-122.08, google.getLongitude(), 0.01);
    }
}