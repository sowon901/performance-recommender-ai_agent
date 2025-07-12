package com.agent.crawler;

import com.agent.entity.Performance;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class SacCrawler {

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper mapper = new ObjectMapper();

    public List<Performance> crawlFromApi(int year, int month) {
        List<Performance> result = new ArrayList<>();
        try {
            String url = String.format(
                    "https://www.sac.or.kr/api/site/main/program/schedule/list?viewType=calendar&year=%d&month=%02d",
                    year, month
            );

            String json = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(json).path("data");

            for (JsonNode node : root) {
                String id = "SAC_" + node.path("programMgmtSeq").asText();
                String title = node.path("programTitle").asText();
                String genre = node.path("genreName").asText();
                String startDate = node.path("startDate").asText();
                String endDate = node.path("endDate").asText();
                String posterUrl = node.path("posterUrl").asText();

                Performance performance = new Performance(
                        id, title, genre, startDate, endDate, posterUrl
                );

                result.add(performance);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
