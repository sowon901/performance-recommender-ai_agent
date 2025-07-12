package com.agent.service.Performance;

import com.agent.entity.Performance;
import com.agent.repository.PerformanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PerformanceService {
    private final PerformanceRepository performanceRepository;

    public List<Performance> fetchAll() {
        return performanceRepository.findAll();
    }

    public void saveAll(List<Performance> performances) {
        performanceRepository.saveAll(performances);
    }
}