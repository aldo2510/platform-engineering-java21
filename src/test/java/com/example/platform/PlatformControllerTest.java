package com.example.platform;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PlatformControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void platformEndpointReturnsGoldenPathMessage() {
        String response = restTemplate.getForObject(
                "http://localhost:" + port + "/api/platform", String.class);

        assertThat(response).contains("Platform Engineering Golden Path");
        assertThat(response).contains("\"java\":\"21\"");
    }
}
