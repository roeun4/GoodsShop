package kr.ezen.sample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticeVo {
    private int no;
    private String writer;
    private String title;
    private String content;
    private Timestamp InDate;
}