package kr.ezen.sample.Mapper;

import kr.ezen.sample.domain.NoticeVo;
import kr.ezen.sample.domain.PageVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {

    /* 공지사항 목록 */
    List<NoticeVo> getList(PageVo pageVo);

    int noticeCount();

    /* 공지사항 등록*/
    int noticeIn(NoticeVo noticeVo);

    /* 공지사항 목록 한개 가져오기 */
    List<NoticeVo> getListOne(int no);

    /* 공지사항 수정 */
    void noticeUpdate(NoticeVo noticeVo);

    /* 공지사항 삭제 */
    int noticeDel(int no);

}
