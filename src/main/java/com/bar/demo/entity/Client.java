package com.bar.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id;
    private String name;
    private String last_name;
    @Column(unique = true,nullable = false)
    private String email;
}

