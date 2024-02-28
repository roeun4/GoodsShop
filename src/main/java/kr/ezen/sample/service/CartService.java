package kr.ezen.sample.service;

import kr.ezen.sample.domain.CartVo;
import kr.ezen.sample.Mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartMapper cartMapper;

    public List<CartVo> getList() {
        List<CartVo> list = cartMapper.getList();

        return list;
    }

    public int cartAdd(CartVo cartVo) {
        int n = cartMapper.cartAdd(cartVo);

        System.out.println("n.Service = " + n);

        return n;
    }

    public List<CartVo> getCartList(String username) {
        return cartMapper.getCartList(username);
    }
}
