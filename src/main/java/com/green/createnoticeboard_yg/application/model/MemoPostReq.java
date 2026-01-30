package com.green.createnoticeboard_yg.application.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//createnotice 테이블에 post통신으로 들어오는 요청
@Setter
@Getter
@ToString
public class MemoPostReq {
    private String title;
    private String contents;
}
