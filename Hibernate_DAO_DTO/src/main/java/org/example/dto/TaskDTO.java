package org.example.dto;

public class TaskDTO {

    private String title;
    private String status;

    public TaskDTO(String title, String status) {
        this.title = title;
        this.status = status;
    }

    public String getTitle() { return title; }
    public String getStatus() { return status; }
}