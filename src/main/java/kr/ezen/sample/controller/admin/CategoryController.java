package kr.ezen.sample.controller.admin;

import kr.ezen.sample.domain.CategoryVo;
import kr.ezen.sample.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    // 카테고리 리스트
    @GetMapping("/admin/category")
    public String getList(Model m){
        List<CategoryVo> list = categoryService.getList();
        m.addAttribute("list", list);

        return "admin/category/CategoryList";
    }

    // 카테고리 등록
    @GetMapping("/admin/cRegister")
    public String categoryRegister(Model m){

        return "admin/category/CategoryRegister";
    }

    @PostMapping("/admin/cRegister")
    public String register(CategoryVo categoryVo){
        try {
            categoryService.cateRegister(categoryVo);
        }catch (Exception e){
            e.printStackTrace();
            return "redirect:/register?error_code=-99";
        }
        return "redirect:/admin/category";
    }

    // 카테고리 수정폼 이동
    @GetMapping("/admin/cModify")
    public String cModify(Model model, int cnum){
        List<CategoryVo> list = categoryService.getListOne(cnum);
        model.addAttribute("list", list);

        return "/admin/category/CategoryModify";
    }

    // 카테고리 수정
    @PostMapping("/admin/cModify_post")
    public String modify(CategoryVo categoryVo) {
        categoryService.cModify(categoryVo);

        return "redirect:/admin/category";
    }

    // 카테고리 삭제
    @GetMapping("/category/categoryDel")
    public String categoryDel(@RequestParam("cnum") String cnum) {
        int n = categoryService.categoryDel(cnum);

        return "redirect:/admin/category";
    }


}
