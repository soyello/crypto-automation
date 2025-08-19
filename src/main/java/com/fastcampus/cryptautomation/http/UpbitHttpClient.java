package com.fastcampus.cryptautomation.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UpbitHttpClient {
    private final HttpClient httpClient;

    public UpbitTickerDto getTickerByMarket(String market) throws JsonProcessingException {
        HttpHeaders headers = new HttpHeaders();
        headers.add("accept", "application/json");

        String execute = httpClient.execute(
                "https://api.upbit.com/v1/ticker?markets=" + market,
                HttpMethod.GET,
                headers
        );
        ObjectMapper om = new ObjectMapper();

        return om.readValue(execute, new TypeReference<List<UpbitTickerDto>>() {
        }).stream().findFirst().get();

    }
}
