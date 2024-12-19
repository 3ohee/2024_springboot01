package com.ict.edu2.domain.guestbook.service;

import java.util.List;

import com.ict.edu2.domain.guestbook.vo.GuestBookVO;

public interface GuestBookService {
    // 전체 읽기
    public List<GuestBookVO> getGuestBookList();

    // 상세 보기
    public GuestBookVO getGuestBookDetail(String gb_idx);


}
