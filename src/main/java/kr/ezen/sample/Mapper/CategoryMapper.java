package kr.ezen.sample.Mapper;

import kr.ezen.sample.domain.CategoryVo;
import kr.ezen.sample.domain.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<CategoryVo> getList();

    int categoryDel(String cnum);

    int cInsert(CategoryVo categoryVo);

    List<CategoryVo> getListOne(int cnum);

    void cUpdate(CategoryVo categoryVo);
}
