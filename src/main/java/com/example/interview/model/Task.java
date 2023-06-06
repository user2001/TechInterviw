package com.example.interview.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User owner;
    private String description;
    @Enumerated(value = EnumType.STRING)
    private StatusTask status;

}
