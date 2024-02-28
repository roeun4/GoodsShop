package kr.ezen.sample.controller.admin;

import kr.ezen.sample.domain.UserVo;
import kr.ezen.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminUserController {
    @Autowired
    private UserService userService;

    // 유저리스트
    @GetMapping("/admin/userList")
    public String getList(Model m){
        List<UserVo> list = userService.getList();

        m.addAttribute("list", list);

        return "admin/UserList";
    }

    // 유저삭제
    @GetMapping("/user/userDel")
    public String userDel(@RequestParam("username") String username) {
        int n = userService.userDel(username);

        return "redirect:/admin/userList";
    }


}
