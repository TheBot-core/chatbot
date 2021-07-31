package com.glowman554.chatbot;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.configuration.BotConfiguration;

import java.util.HashMap;

public class ChatBot {
    public HashMap<String, Chat> chats = new HashMap<>();
    public Bot bot = new Bot(BotConfiguration.builder().name("alice").path("resources").build());

    public String get_response(String chat, String question) {
        if(chats.containsKey(chat)) {
            return chats.get(chat).multisentenceRespond(question);
        } else {
            chats.put(chat, new Chat(bot));
            return chats.get(chat).multisentenceRespond(question);
        }
    }
}
