package com.agent.service;

import com.agent.entity.Performance;
import com.agent.entity.UserHistory;
import com.agent.service.GPTClient.GPTClient;
import com.agent.service.Performance.PerformanceService;
import com.agent.service.UserHistory.UserHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RecommendationService {
    private final PerformanceService performanceService;
    private final UserHistoryService userHistoryService;
    private final GPTClient gptClient;

    public List<Performance> recommend(String userId) {
        List<Performance> all = performanceService.fetchAll();
        List<UserHistory> history = userHistoryService.getUserHistory(userId);
        String prompt = buildPrompt(history, all);
        List<String> recommendedIds = gptClient.askRecommendation(prompt);
        return all.stream()
                .filter(p -> recommendedIds.contains(p.getId()))
                .collect(Collectors.toList());
    }

    private String buildPrompt(List<UserHistory> history, List<Performance> upcoming) {
        // 간단한 프롬프트 생성
        StringBuilder sb = new StringBuilder("User has watched the following performances:\n");
        for (UserHistory h : history) sb.append("- ").append(h.getPerformanceId()).append("\n");
        sb.append("\nUpcoming performances:\n");
        for (Performance p : upcoming)
            sb.append(p.getId()).append(", ").append(p.getTitle()).append(", ").append(p.getGenre()).append("\n");
        sb.append("\nRecommend top 3 by ID only:");
        return sb.toString();
    }
}
