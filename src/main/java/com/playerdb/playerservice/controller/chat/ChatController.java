package com.playerdb.playerservice.controller.chat;

import com.playerdb.playerservice.model.TeamRequest;
import com.playerdb.playerservice.service.chat.ChatClientService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping(value = "v1/model", produces = { MediaType.APPLICATION_JSON_VALUE })
public class ChatController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChatController.class);
    private final ChatClientService chatClientService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateTeam(@RequestBody TeamRequest teamRequest) {
        String response = chatClientService.generateTeam(teamRequest.getSeedId(), teamRequest.getTeamSize());
        return ResponseEntity.ok(response);
    }

}
