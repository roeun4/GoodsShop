package kr.ezen.sample.controller;

import kr.ezen.sample.domain.*;
import kr.ezen.sample.service.CategoryService;
import kr.ezen.sample.service.NoticeService;
import kr.ezen.sample.service.ProductService;
import kr.ezen.sample.util.ProdSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @Autowired
    private NoticeService noticeService;

    @GetMapping("/")
    public String home(HttpSession session, Model model, UserVo userVo, PageVo pageVo, HttpServletRequest request){

        List<CategoryVo> clist = categoryService.getList();
        model.addAttribute("clist", clist);

        List<ProductVo> list = productService.getList(pageVo);
        model.addAttribute("list", list);

        model.addAttribute("page", pageVo);

        List<NoticeVo> noticeList = noticeService.getList(pageVo);
        model.addAttribute("noticeList", noticeList);


        return "home/Home";
    }
}
