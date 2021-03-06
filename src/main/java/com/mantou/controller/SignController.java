package com.mantou.controller;

import com.mantou.anno.SignProcess;
import com.mantou.entity.DemoReq;
import com.mantou.entity.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
@Slf4j
public class SignController {

    @SignProcess
    @PostMapping("/verify")

    public Response<DemoReq> verify(@RequestBody DemoReq demoReq){
        demoReq.setName("馒头");
        return Response.success(demoReq);
    }
}
