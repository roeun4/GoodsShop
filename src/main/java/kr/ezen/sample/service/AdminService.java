package kr.ezen.sample.service;

import kr.ezen.sample.Mapper.AdminMapper;
import kr.ezen.sample.domain.AdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public boolean adminLogin(AdminVo adminVo, HttpServletRequest req) {
        HttpSession session = req.getSession();

        // 입력 아이디와 일치하는 회원정보를 담아서 가져옴
        AdminVo AloginDTO = adminMapper.adminLogin(adminVo);

        if(AloginDTO != null) { // 일치하는 아이디가 있는 경우
            String inputPw = adminVo.getApassword(); // 입력비번
            String dbPw = AloginDTO.getApassword(); // DB비번

            if(inputPw.equals(dbPw)) { // 비번 일치
                session.setAttribute("AloginDTO", AloginDTO);
                return true;
            }else { // 비번 불일치
                return false;
            }
        }// if
        return false;
    }

}
