package com.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// ChatController.java
@Controller
public class ChatController {
    @GetMapping("/")
    public String getChatPage() {
        return "chat";
    }
}

