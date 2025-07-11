package com.agent.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Performance {
    @Id
    private String id;
    private String title;
    private String genre;
    private String startDate;
    private String endDate;
    private String posterUrl;
}