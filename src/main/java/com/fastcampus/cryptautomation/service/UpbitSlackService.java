package com.fastcampus.cryptautomation.service;

import com.fastcampus.cryptautomation.http.SlackHttpClient;
import com.fastcampus.cryptautomation.http.UpbitHttpClient;
import com.fastcampus.cryptautomation.http.UpbitTickerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpbitSlackService {
    private final SlackHttpClient slackHttpClient;
    private final UpbitHttpClient upbitHttpClient;

    public void execute(String market){
        //upbit 호출
        UpbitTickerDto tickerByMarket = upbitHttpClient.getTickerByMarket(market);

        //slack 전송
        StringBuilder sb = new StringBuilder();
        sb.append("[실시간 데이터] ");
        sb.append(market);
        sb.append(" price = ");
        sb.append(tickerByMarket.getTrade_price());
        slackHttpClient.send(sb.toString());
    }
}
