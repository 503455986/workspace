package com.itgaoshu.springboot.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

import javax.swing.text.html.FormSubmitEvent;

public class SendSms {

    public static boolean fasongSenSms(String yzm,String phoneNum,int flag) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4Fehxpetr5VcS1ustBfB", "MhdF3mMUHqkmDU1oSqAIfocDUSua6i");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers",phoneNum);
        request.putQueryParameter("SignName", "黑白熊");
        request.putQueryParameter("TemplateParam", "{\"code\":\"+yzm+\"}");

        if(flag==1){
            request.putQueryParameter("TemplateCode", "SMS_187541036");
        }else{
            request.putQueryParameter("TemplateCode", "SMS_187591079");
        }

        boolean result=false;
        try {
            CommonResponse response = client.getCommonResponse(request);
            if(response.getData().contains("OK")){
                result=true;
            }
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return result;
    }

}
