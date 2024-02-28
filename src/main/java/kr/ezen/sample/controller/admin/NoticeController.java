package kr.ezen.sample.controller.admin;

import kr.ezen.sample.domain.AdminVo;
import kr.ezen.sample.domain.CategoryVo;
import kr.ezen.sample.domain.NoticeVo;
import kr.ezen.sample.domain.PageVo;
import kr.ezen.sample.service.AdminService;
import kr.ezen.sample.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Pageable;
import java.util.List;

@Controller
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @Autowired
    private AdminService adminService;

    /* 공지사항 목록 */
    @GetMapping("/admin/notice")
    public String Notice(Model model, PageVo pageVo){
        List<NoticeVo> list = noticeService.getList(pageVo);
        model.addAttribute("list", list);

        model.addAttribute("page", pageVo);

        return "admin/notice/NoticeList";
    }

    /* 공지사항 등록 폼 이동 */
    @GetMapping("/admin/noticeIn")
    public String NoticeIn(){

        return "admin/notice/NoticeIn";
    }

    /* 공지사항 등록 */
    @PostMapping("/admin/noticeInPost")
    public String NoticeInPost(NoticeVo noticeVo){
        int n = noticeService.noticeIn(noticeVo);

        return "redirect:/admin/notice";
    }

    /* 공지사항 수정 폼 이동 */
    @GetMapping("/admin/noticeModify")
    public String NoticeModify(int no, Model model){
        List<NoticeVo> list = noticeService.getListOne(no);
        model.addAttribute("list", list);

        return "admin/notice/NoticeModify";
    }

    /* 공지사항 수정 */
    @PostMapping("/admin/noticeModifyPost")
    public String modify(NoticeVo noticeVo) {
        noticeService.noticeModify(noticeVo);

        return "redirect:/admin/notice";
    }

    /* 공지사항 삭제 */
    @GetMapping("/admin/noticeDel")
    public String noticeDel(@RequestParam("no") int no) {
        int n = noticeService.noticeDel(no);

        return "redirect:/admin/notice";
    }
}
