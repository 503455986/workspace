package com.itgaoshu.springboot.Controller;

import com.itgaoshu.springboot.util.SendSms;
import com.itgaoshu.springboot.util.shengChengyzm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendSmsController {

    @RequestMapping("/faSongYZM")
    public String faSongYZM(String phoneNumber,int flag){
        String yzm=shengChengyzm.ShengChengYZM();
        boolean result=SendSms.fasongSenSms(yzm,phoneNumber,flag);

        if(result==true){
            return yzm;
        }else{
            return "";
        }

    }
}
