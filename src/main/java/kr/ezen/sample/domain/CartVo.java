package kr.ezen.sample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartVo {
    private int cart_no;
    private String username;
    private int pno;
    private int pqty;
    private Timestamp cartInDate;

    private String pname;
    private String pimage;
    private int price;
    private int delivery;

    private int totalPrice;

    public void setTotal() {
        this.totalPrice = this.pqty*price+delivery;
    }
}