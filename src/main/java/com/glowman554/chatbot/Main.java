package com.glowman554.chatbot;

public class Main {
    public static ChatBot chatbot;
    public static HttpInterface http_interface;

    public static void main(String[] args) throws Exception {
        chatbot = new ChatBot();
        http_interface = new HttpInterface(5555);
        System.out.println("Loaded chatbot server!!");
    }
}
