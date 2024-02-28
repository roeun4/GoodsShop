package kr.ezen.sample.Mapper;

import kr.ezen.sample.domain.AdminVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    AdminVo adminLogin(AdminVo adminVo);

}
