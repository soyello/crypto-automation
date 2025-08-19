package com.fastcampus.cryptautomation.http;

import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SlackHttpClient {
    @Value("${slack.webhook.url}")
    private String webhookUrl;
    public void send(String message) {
        try {
            Slack instance = Slack.getInstance();
            Payload payload = Payload.builder()
                    .text(message)
                    .build();

            instance.send(webhookUrl, payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
