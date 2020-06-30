package com.novaworld.restclient.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author ango1019
 * Date: 30.06.2020
 * Time: 17:34
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class JokeServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(JokeServiceTest.class);

    @Autowired
    private JokeService service;

    @Test
    void getJoke() {
        String joke = service.getJoke("Craig", "Walls");
        LOGGER.info(joke);
        assertTrue(joke.contains("Craig") || joke.contains("Walls"));
    }
}