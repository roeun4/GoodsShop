package kr.ezen.sample.Mapper;

import kr.ezen.sample.domain.CartVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {

    List<CartVo> getList();

    int cartAdd(CartVo cartVo);

    List<CartVo> getCartList(String username);
}
