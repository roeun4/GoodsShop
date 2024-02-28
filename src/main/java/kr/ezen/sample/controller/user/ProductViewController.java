package kr.ezen.sample.controller.user;

import kr.ezen.sample.domain.CategoryVo;
import kr.ezen.sample.service.CategoryService;
import kr.ezen.sample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class ProductViewController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;


    // 상품 수정
    @GetMapping("/user/prodView")
    public String pModify(@RequestParam("pno") String pno, Model m) {
        List<CategoryVo> clist = categoryService.getList();
        m.addAttribute("clist", clist);

        Map<String, Object> map = productService.getListOne(pno);
        m.addAttribute("map", map);

        return "user/prodView";
    }

}
