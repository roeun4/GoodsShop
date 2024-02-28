package kr.ezen.sample.service;

import kr.ezen.sample.Mapper.UserMapper;
import kr.ezen.sample.domain.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    public void joinUser(UserVo userVo){
        userMapper.userInsert(userVo);
    }

    public List<UserVo> getList() {
        List<UserVo> list = userMapper.getList();

        return list;
    }

    public int userDel(String username) {
        int n = userMapper.userDel(username);

        return n;
    }

    public boolean userLogin(UserVo userVo, HttpServletRequest req) {
        HttpSession session = req.getSession();

        // 입력 아이디와 일치하는 회원정보를 담아서 가져옴
        UserVo loginDTO = userMapper.userLogin(userVo);

        if(loginDTO != null) { // 일치하는 아이디가 있는 경우
            String inputPw = userVo.getPassword(); // 입력비번
            String dbPw = loginDTO.getPassword(); // DB비번

            if(inputPw.equals(dbPw)) { // 비번 일치
                session.setAttribute("loginDTO", loginDTO);
                return true;
            }else { // 비번 불일치
                return false;
            }
        }// if
        return false;
    }

    public List<UserVo> getListOne(String username) {
        List<UserVo> list = userMapper.getListOne(username);

        return list;
    }

}
