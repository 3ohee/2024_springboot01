package com.ict.edu2.domain.guestbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// getter setter 만들어줌
@Data
// 생성자를 만들 때 다 만드는 거
@AllArgsConstructor
// 생성자를 만들 때 기본 생성자
@NoArgsConstructor
public class GuestBookVO {
    private String gb_idx, gb_name, gb_subject, gb_content, gb_email, gb_pw, gb_regdate;

}
