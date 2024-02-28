package kr.ezen.sample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductVo {
    private Long pno;
    private String pname;
    private String pcate_fk;
    private String pimage; // 작성자가 업로드한 파일
    private String pcompany;
    private int delivery;
    private int price;
    private String pspec;
    private String pcontent;
    private Timestamp pinDate;
}