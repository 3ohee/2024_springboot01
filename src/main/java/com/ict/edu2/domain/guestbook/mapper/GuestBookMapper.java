package com.ict.edu2.domain.guestbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ict.edu2.domain.guestbook.vo.GuestBookVO;

@Mapper
public interface GuestBookMapper {
    // service 에 있는 코드와 같다.
    // mapper 는 db를 다녀옴

    // 오토와이어드로 연결해준다. (컨트롤러로 이동)
    
    // 간단한 sql 처리 가능
    @Select("select * from guestbook order by gb_idx")
    public List<GuestBookVO> getGuestBookList();

    public GuestBookVO getGuestBookDetail(String gb_idx);

}
