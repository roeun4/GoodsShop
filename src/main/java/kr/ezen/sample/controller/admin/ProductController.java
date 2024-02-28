package kr.ezen.sample.controller.admin;

import kr.ezen.sample.domain.CategoryVo;
import kr.ezen.sample.domain.PageVo;
import kr.ezen.sample.domain.ProductVo;
import kr.ezen.sample.service.ProductService;
import kr.ezen.sample.util.ProdSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/src/main/resources/static/uploads";

    // 상품 리스트
    @GetMapping("/admin/product")
    public String getList(Model model, PageVo pageVo){
        List<ProductVo> list = productService.getList(pageVo);
        model.addAttribute("list", list);

        model.addAttribute("page", pageVo);

        return "admin/product/ProductList";
    }

    // 상품 등록
    @GetMapping("/admin/pRegister")
    public String productRegister(Model m, HttpServletRequest request){
        List<CategoryVo> list = productService.getCategoryList();
        m.addAttribute("list", list);

        // 상품스펙 가져오기
        ProdSpec[] pdSpecs= ProdSpec.values();
        request.setAttribute("pdSpecs", pdSpecs);

        return "admin/product/ProductRegister";
    }

    // 등록
    @PostMapping("/admin/pRegister")
    public String prodInsert(HttpServletRequest request, MultipartHttpServletRequest mhr, Model model)
            throws IOException{

        Map map = prodSave(request, mhr);

        productService.pRegister(map);

        return "redirect:/admin/product";
    }

    public Map prodSave(HttpServletRequest request, MultipartHttpServletRequest mhr) throws IOException {
        String savePath = UPLOAD_DIRECTORY;
        System.out.println(savePath);

        Map map = new HashMap();

        // mhr는 일반 텍스트, 바이너리 파일 정보를 모두 얻어올 수 있는 객체
        // input의 name속성의 값 = 파라미터값을 가져옴 (id, name)
        Enumeration<String> enu = mhr.getParameterNames();

        // 일반 텍스트의 파라미터명과 입력값 모두 출력
        while(enu.hasMoreElements()) {
            String paramName = enu.nextElement();
            // 해당 파라미터명의 값 => input의 value값(사용자가 입력한 값)
            String paramValue = mhr.getParameter(paramName);

            // name : user, id : test
            System.out.println(paramName + " : " + paramValue);
            map.put(paramName, paramValue);
        }

        // 첨부 파일 정보 얻어오기
        // input type = file의 name값
        Iterator<String> iter = mhr.getFileNames();
        List<String> fileList = new ArrayList<String>();

        while(iter.hasNext()) {
            String fileParamName = iter.next();
            System.out.println("fileParamName = " + fileParamName);

            // MultipartFile : 파일정보를 갖고 있는 객체
            MultipartFile mFile = mhr.getFile(fileParamName);

            // 첨부된 이미지 파일명
            String originName = mFile.getOriginalFilename();
            System.out.println("originName = " + originName);

            // ~ /day05_fileUpDown\\resources/fileRepo\\file1
            File file = new File(savePath+"\\"+fileParamName);

            if(mFile.getSize() != 0) { // 업로드된 경우
                System.out.println("11 : " + file.exists());

                if(!file.exists()) { // 파일이 존재하지 않으면
                    if(file.getParentFile().mkdir()) {
                        file.createNewFile(); // 임시파일 생성
                    } // if
                } // if

                File uploadFile = new File(savePath + "\\" + originName);

                // 중복시 파일명 대체
                if(uploadFile.exists()) {
                    originName = System.currentTimeMillis()+"_"+ originName;
                    uploadFile = new File(savePath + "\\" + originName);
                } // if

                // 실제 파일 업로드
                mFile.transferTo(uploadFile);
                fileList.add(originName);
                map.put("pimage", originName);

            }// if

        } // while
        return map;
    }

    // 상품 수정
    @GetMapping("/admin/pModify")
    public String pModify(@RequestParam("pno") String pno, Model m) {
        List<CategoryVo> list = productService.getCategoryList();
        m.addAttribute("list", list);

        Map<String, Object> map = productService.getListOne(pno);
        m.addAttribute("map", map);

        return "admin/product/ProductModify";
    }

    @PostMapping("/admin/pModify")
    public String prodModifyPost(HttpServletRequest request, MultipartHttpServletRequest mhr) throws IOException{

        Map map = prodSave(request, mhr);
        productService.prodModify(map);
        return "redirect:/admin/product";
    }

    // 상품 삭제
    @GetMapping("/product/productDel")
    public String productDel(@RequestParam("pno") String pno) {
        int n = productService.productDel(pno);

        return "redirect:/admin/product";
    }

}
