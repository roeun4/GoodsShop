package kr.ezen.sample.controller.admin;

import kr.ezen.sample.domain.AdminVo;
import kr.ezen.sample.domain.PageVo;
import kr.ezen.sample.domain.ProductVo;
import kr.ezen.sample.domain.UserVo;
import kr.ezen.sample.service.AdminService;
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
public class AdminController {
    @Autowired
    private AdminService adminService;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    // 관리자 홈
    @GetMapping("/admin")
    public String adminHome(Model model){
        List<UserVo> list = userService.getList();
        model.addAttribute("list", list);

        List<ProductVo> plist = productService.getListAll();
        model.addAttribute("plist", plist);

        return "admin/AdminHome";
    }

    // 관리자 로그인 폼이동
    @GetMapping("/admin/login")
    public String adminLogin(){
        return "admin/AdminLogin";
    }

    @PostMapping("/admin_login")
    public String memberLogin(AdminVo adminVo, HttpServletRequest req) {
        boolean result = adminService.adminLogin(adminVo, req);

        if(!result) { // 로그인 실패
            return "redirect:/admin/login";
        }

        return "redirect:/admin";
    }


}
