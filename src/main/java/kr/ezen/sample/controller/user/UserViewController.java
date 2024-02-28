package kr.ezen.sample.controller.user;

import kr.ezen.sample.domain.*;
import kr.ezen.sample.service.CategoryService;
import kr.ezen.sample.service.NoticeService;
import kr.ezen.sample.service.ProductService;
import kr.ezen.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserViewController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private ProductService productService;
    
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private NoticeService noticeService;

    // 카테고리별 상품 리스트(유저화면)
    @GetMapping("/user/categoryList")
    public String categoryList(@RequestParam("cname") String cname, Model model, PageVo pageVo) {
        productService.categoryList(cname);
        model.addAttribute("cname", cname);

        List<CategoryVo> clist = categoryService.getList();
        model.addAttribute("clist", clist);

        List<ProductVo> list = productService.getList(pageVo);
        model.addAttribute("list", list);

        return "user/categoryList";
    }

    @GetMapping("/user/prodAll")
    public String prodAll(PageVo pageVo, Model model){
        List<CategoryVo> clist = categoryService.getList();
        model.addAttribute("clist", clist);

        model.addAttribute("page", pageVo);

        List<ProductVo> list = productService.getList2(pageVo);
        model.addAttribute("list", list);

        return "user/prodAllList";
    }
    
    // 공지사항 보기(유저화면)
    @GetMapping("/user/noticeView")
    public String noticeView(Model model, int no){
        List<NoticeVo> list = noticeService.getListOne(no);
        model.addAttribute("list", list);

        List<CategoryVo> clist = categoryService.getList();
        model.addAttribute("clist", clist);

        return "user/NoticeView";
    }

    /* 공지사항 목록(유저화면) */
    @GetMapping("/user/noticeList")
    public String Notice(Model model, PageVo pageVo){

        List<CategoryVo> clist = categoryService.getList();
        model.addAttribute("clist", clist);

        List<NoticeVo> list = noticeService.getList(pageVo);
        model.addAttribute("list", list);

        model.addAttribute("page", pageVo);

        return "user/NoticeViewList";
    }

    // 마이페이지
    @GetMapping("/user/myProfile")
    public String myProfile(Model model){
        List<CategoryVo> clist = categoryService.getList();
        model.addAttribute("clist", clist);


        List<UserVo> list = userService.getList();
        model.addAttribute("list", list);

        return "user/myProfile";
    }


}
