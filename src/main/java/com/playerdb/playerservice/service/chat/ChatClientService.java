package com.playerdb.playerservice.service.chat;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class ChatClientService {

    public String generateTeam(String seedId, int teamSize) {
        RestTemplate restTemplate = new RestTemplate();
        // Define the URL
        String url = "http://127.0.0.1:5000/team/generate";

        // Create headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        // Create the request body as a Map
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("seed_id", seedId);
        requestBody.put("team_size", teamSize);

        // Create the HttpEntity object (contains headers and body)
        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(requestBody, headers);

        // Send the POST request
        return restTemplate.exchange(url, HttpMethod.POST, entity, String.class).getBody();
    }
}
