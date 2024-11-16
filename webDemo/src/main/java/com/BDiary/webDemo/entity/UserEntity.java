package com.BDiary.webDemo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue
    private long id;
    private String googlename;
    private String email;
    private String role;
    private String nickname;
    private String my_team;
}