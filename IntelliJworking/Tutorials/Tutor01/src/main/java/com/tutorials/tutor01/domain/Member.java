package com.tutorials.tutor01.domain;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Member {
    private String userId;
    private String passWord;
    private String userName;
}
