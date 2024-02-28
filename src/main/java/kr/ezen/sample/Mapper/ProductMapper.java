package kr.ezen.sample.Mapper;

import kr.ezen.sample.domain.CategoryVo;
import kr.ezen.sample.domain.PageVo;
import kr.ezen.sample.domain.ProductVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductMapper {

    // 상품리스트 가져오기
    List<ProductVo> getList(PageVo pageVo);

    List<ProductVo> getList2(PageVo pageVo);

    // 카테고리 리스트 가져오기
    List<CategoryVo> getCategoryList();

    Map<String, Object> getListOne(String pno);

    int prodInsert(Map map);

    int productDel(String pno);

    int prodModify(String pno, String pname, String pcateFk, String pimage, String delivery, String pcompany, String price, String pcontent);

    int prodModify(Map map);

    String categoryList(String cname);

    int productCount();

    int productCount2();

    List<ProductVo> search(ProductVo productVo);

    List<ProductVo> getListAll();
}
