package kr.ezen.sample.Mapper;

import kr.ezen.sample.domain.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    // 회원가입
    void userInsert(UserVo userVo);

    // 로그인
    UserVo userLogin(UserVo userVo);

    List<UserVo> getList();

    int userDel(String username);

    List<UserVo> getListOne(String username);

}
