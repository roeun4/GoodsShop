package kr.ezen.sample.service;

import kr.ezen.sample.domain.CategoryVo;
import kr.ezen.sample.domain.PageVo;
import kr.ezen.sample.domain.ProductVo;
import kr.ezen.sample.Mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    // 상품 리스트 가져오기
    public List<ProductVo> getList(PageVo pageVo) {
        int totalCnt = productMapper.productCount();

        pageVo.setValue(totalCnt);

        List<ProductVo> list = productMapper.getList(pageVo);

        return list;
    }

    // 카테고리 리스트 가져오기
    public List<CategoryVo> getCategoryList() {
        List<CategoryVo> list = productMapper.getCategoryList();

        return list;
    }


    public int pRegister(Map map) {
        int n = productMapper.prodInsert(map);

        return n;
    }

    public int productDel(String pno) {
        int n = productMapper.productDel(pno);

        return n;
    }

    public Map<String, Object> getListOne(String pno) {
        Map<String, Object> map = productMapper.getListOne(pno);

        return map;
    }

    public int prodModify(Map map) {
        int n = productMapper.prodModify(map);

        return n;
    }

    public void categoryList(String cname) {
        productMapper.categoryList(cname);
    }

    public List<ProductVo> getSearch(ProductVo productVo) {
        List<ProductVo> list = productMapper.search(productVo);

        return list;
    }

    public List<ProductVo> getList2(PageVo pageVo) {
        int totalCnt = productMapper.productCount2();

        pageVo.setValue(totalCnt);

        List<ProductVo> list = productMapper.getList2(pageVo);

        return list;
    }

    public List<ProductVo> getListAll() {
        List<ProductVo> list = productMapper.getListAll();

        return list;
    }
}
