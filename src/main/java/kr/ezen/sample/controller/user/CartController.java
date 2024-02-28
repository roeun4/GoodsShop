package kr.ezen.sample.controller.user;

import kr.ezen.sample.domain.CartVo;
import kr.ezen.sample.domain.CategoryVo;
import kr.ezen.sample.service.CartService;
import kr.ezen.sample.service.CategoryService;
import kr.ezen.sample.service.ProductService;
import kr.ezen.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CartController {
    @Autowired
    private CartService cartService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

//        for(CartVo vo : cartList) {
//            // 수량만큼 totPrice 계산
//            vo.setTotal();
//        }

    // 카트 목록
    @GetMapping("/user/cart")
    public String getCartList(HttpSession session, Model model) throws Exception {

        //session에 저장해두었던 userId
        String username = (String)session.getAttribute("username");

        // DB에 저장되어있던 cartList
        List<CartVo> cartList = cartService.getCartList(username);

        model.addAttribute("cartList", cartList);

        List<CategoryVo> clist = categoryService.getList();
       model.addAttribute("clist", clist);

        return "user/cartList";
    }

    @GetMapping("/user/cartAdd")
    public String cartAdd(CartVo cartVo){

        cartService.cartAdd(cartVo);

        return "redirect:/user/cart";
    }


}
