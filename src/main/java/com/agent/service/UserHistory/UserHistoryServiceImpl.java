package com.agent.service.UserHistory;

import com.agent.entity.UserHistory;
import com.agent.repository.UserHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserHistoryServiceImpl implements UserHistoryService{

    private final UserHistoryRepository userHistoryRepository;

    public void record(String userId, String performanceId, String action) {
        userHistoryRepository.save(new UserHistory(null, userId, performanceId, action, LocalDateTime.now()));
    }

    public List<UserHistory> getUserHistory(String userId) {
        return userHistoryRepository.findByUserId(userId);
    }
}
