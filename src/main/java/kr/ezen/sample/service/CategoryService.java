package kr.ezen.sample.service;

import kr.ezen.sample.domain.*;
import kr.ezen.sample.Mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<CategoryVo> getList() {
        List<CategoryVo> list = categoryMapper.getList();

        return list;
    }

    public int cateRegister(CategoryVo categoryVo) {
        int n = categoryMapper.cInsert(categoryVo);

        return n;
    }

    public int categoryDel(String cnum) {
        int n = categoryMapper.categoryDel(cnum);

        return n;
    }

    public List<CategoryVo> getListOne(int cnum) {
        List<CategoryVo> list = categoryMapper.getListOne(cnum);

        return list;
    }

    public void cModify(CategoryVo categoryVo) {
        categoryMapper.cUpdate(categoryVo);
        System.out.println("Service : " + categoryVo);
    }
}
