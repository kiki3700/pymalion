package com.blog.pymalion.member.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private UUID id;
    private String name;
    private String password;

    static Member of(String name, String password) {
        return new Member(null, name, password);
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }
}
