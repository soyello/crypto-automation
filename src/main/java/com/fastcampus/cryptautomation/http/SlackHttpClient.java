package com.fastcampus.cryptautomation.http;

import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SlackHttpClient {
    public void send(String message) {
        try {
            Slack instance = Slack.getInstance();
            Payload payload = Payload.builder()
                    .text(message)
                    .build();

            instance.send("https://hooks.slack.com/services/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", payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
