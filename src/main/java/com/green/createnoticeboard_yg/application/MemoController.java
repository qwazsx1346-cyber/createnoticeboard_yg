package com.green.createnoticeboard_yg.application;

import com.green.createnoticeboard_yg.application.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/createnotice")
public class MemoController {
    private final MemoService memoService;

    @PostMapping
    public int postMomo(@RequestParam MemoPostReq req) {
        System.out.println("req: " + req);
        int result = memoService.postMemo(req);
        return result;
    }
}
