package kr.ezen.sample.service;

import kr.ezen.sample.Mapper.NoticeMapper;
import kr.ezen.sample.domain.CategoryVo;
import kr.ezen.sample.domain.NoticeVo;
import kr.ezen.sample.domain.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    public List<NoticeVo> getList(PageVo pageVo) {
        int totalCnt = noticeMapper.noticeCount();

        pageVo.setValue(totalCnt);

        List<NoticeVo> list = noticeMapper.getList(pageVo);

        return list;
    }

    public int noticeIn(NoticeVo noticeVo) {
        int n = noticeMapper.noticeIn(noticeVo);

        return n;
    }

    public List<NoticeVo> getListOne(int no) {
        List<NoticeVo> list = noticeMapper.getListOne(no);

        return list;
    }

    public int noticeDel(int no) {
        int n = noticeMapper.noticeDel(no);

        return n;
    }

    public void noticeModify(NoticeVo noticeVo) {
        noticeMapper.noticeUpdate(noticeVo);
    }
}
