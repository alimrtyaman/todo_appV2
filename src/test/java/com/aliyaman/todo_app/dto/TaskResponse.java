package com.aliyaman.todo_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponse {

    private String title;

    private String description;

    private boolean completed;

    private LocalDateTime createdAt;
}
