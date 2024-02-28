package kr.ezen.sample.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserVo {
    private Long no;
    private String username;
    private String password;
    private String name;
    private String dob;
    private String tel;
    private String email;

    private Timestamp inDate;
}