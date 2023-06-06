package com.example.interview.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int boss_id;
    @Enumerated(value = EnumType.STRING)
    private EmployeeStatus employeeStatus;
}
