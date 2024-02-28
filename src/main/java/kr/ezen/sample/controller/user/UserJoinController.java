package kr.ezen.sample.controller.user;

//import kr.ezen.sample.domain.UserDTO;
import kr.ezen.sample.domain.CategoryVo;
import kr.ezen.sample.domain.UserVo;
//import kr.ezen.sample.service.MemberService;
import kr.ezen.sample.service.CategoryService;
import kr.ezen.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserJoinController {
    @Autowired
    private UserService userService;

    @Autowired
    private CategoryService categoryService;


    // 로그인 폼이동
    @GetMapping("/login")
    public String loginHome(Model m){
        List<CategoryVo> clist = categoryService.getList();
        m.addAttribute("clist", clist);

        return "user/UserLogin";
    }

    @PostMapping("/post_login")
    public String memberLogin(UserVo userVo, HttpServletRequest req) {
        boolean result = userService.userLogin(userVo, req);

        if(!result) { // 로그인 실패
            return "redirect:/login";
        }

        return "redirect:/";
    }

    // 로그아웃
    @GetMapping("/logout")
    public String logout(HttpSession session) {

        session.invalidate();

        return "redirect:/";
    }

     //회원가입 폼이동
    @GetMapping("/join")
    public String join(Model model){
        List<CategoryVo> clist = categoryService.getList();
        model.addAttribute("clist", clist);

        return "user/Register";
    }

    @PostMapping("/post_join")
    public String register(UserVo userVo){
        
        userService.joinUser(userVo);

        return "redirect:/login";
    }

    // 유저삭제
    @GetMapping("/user/userDelete")
    public String userDel(@RequestParam("username") String username, HttpSession session) {
        int n = userService.userDel(username);
        session.invalidate();

        return "redirect:/";
    }

}
