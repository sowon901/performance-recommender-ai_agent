package com.agent.service.GPTClient;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GPTClient {
    public List<String> askRecommendation(String prompt) {
        // 실제 GPT 호출 로직 대신 mock return
        return Arrays.asList("P123", "P456", "P789");
    }
}
