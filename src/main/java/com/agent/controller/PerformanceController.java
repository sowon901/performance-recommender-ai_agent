package com.agent.controller;

import com.agent.entity.Performance;
import com.agent.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/performance")
@RequiredArgsConstructor
public class PerformanceController {
    private final RecommendationService recommendationService;

    @GetMapping("/recommend")
    public List<Performance> recommend(@RequestParam String userId) {
        return recommendationService.recommend(userId);
    }
}