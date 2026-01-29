package com.green.createnoticeboard_yg.application;

import com.green.createnoticeboard_yg.application.model.MemoPostReq;
import org.apache.ibatis.annotations.Mapper;


// BoardMapper 인터페이스와 BoardMapper.xml 파일을 연결한다. 연결은 xml파일에서 namespace에 인터페이스의 풀네임을 작성으로 한다.
@Mapper
public interface MemoMapper {
    int save(MemoPostReq req);
}
