package com.green.createnoticeboard_yg.application;

import com.green.createnoticeboard_yg.application.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor //final이 붙은 애들만 파라미터로 만든 생성자를 만든다.
public class MemoService {
    private final MemoMapper memoMapper;

    public int postMemo(MemoPostReq req) {
        return memoMapper.save(req);
    }
}
