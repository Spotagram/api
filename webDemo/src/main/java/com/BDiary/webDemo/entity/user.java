package com.BDiary.webDemo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class user {
    @Id
    private String userId;
    private String email;
    private String googlename;
    private String myteam;
    private String nickname;
    private String role;
}