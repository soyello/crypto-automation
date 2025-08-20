package com.fastcampus.cryptautomation.service;

import com.fastcampus.cryptautomation.http.SlackHttpClient;
import com.fastcampus.cryptautomation.http.UpbitHttpClient;
import com.fastcampus.cryptautomation.http.UpbitTickerDto;
import com.fastcampus.cryptautomation.repository.ReportHistoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UpbitSlackServiceTest {
//    @Mock
//    private SlackHttpClient slackHttpClient;
//    @Mock
//    private UpbitHttpClient upbitHttpClient;
//    @Mock
//    private ReportHistoryRepository repository;
//
//    @InjectMocks
//    private UpbitSlackService sut;
//
//    @Test
//    void test() {
//        //given
//        String market = "KRW-BTC";
//        when(upbitHttpClient
//                .getTickerByMarket(market))
//                .thenReturn(UpbitTickerDto
//                        .builder()
//                        .trade_price(10.0)
//                        .build());
//
//        //when
//        sut.execute(market);
//
//        //then
//        verify(upbitHttpClient, atMostOnce()).getTickerByMarket(market);
//        verify(slackHttpClient, atMostOnce()).send(any());
//        verify(repository, atMostOnce()).save(any(), any());
//
//    }
}
