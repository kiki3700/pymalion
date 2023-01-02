package com.blog.pymalion.article.domain;

import com.blog.pymalion.member.domain.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.*;

@Entity
@Getter
@Setter
public class Article {
    @Id @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @OneToMany
    private Set<Category> tag = new HashSet<>();

    private Timestamp createTime;

    private Timestamp lastModifiedTime;

    private String title;

    private String mainText;

    @OneToMany
    private List<Comment> comment = new ArrayList<>();


}
