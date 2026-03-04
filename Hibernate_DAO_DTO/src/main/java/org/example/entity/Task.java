package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id   // 🔥 PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String status;

    @ManyToOne(optional = false)  // FK cannot be null
    @JoinColumn(
            name = "student_id",   // FK column
            nullable = false,      // NOT NULL constraint
            foreignKey = @ForeignKey(name = "fk_task_student")
    )
    private Student student;

    public Task() {}

    public Task(String title, String status, Student student) {
        this.title = title;
        this.status = status;
        this.student = student;
    }

    // getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}