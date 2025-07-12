package com.agent.service.UserHistory;

import com.agent.entity.UserHistory;
import com.agent.repository.UserHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface UserHistoryService {

    public void record(String userId, String performanceId, String action);

    public List<UserHistory> getUserHistory(String userId);
}