package com.sk.cuello.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cuello_user")
public class CuelloUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "cuello_user_gen")
    @SequenceGenerator(name = "cuello_user_gen", sequenceName = "cuello_user_seq", allocationSize = 2)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

}
