package com.example.ApiStreaking.utils;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.example.ApiStreaking.constants.AccessConstant;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonUtil {

    public static long timestamp(){
        return System.currentTimeMillis();
    }

    public static String nonce(){
        String uuid = StrUtil.uuid();
        return uuid;
    }

    public static String sign(String param){
        String sign = "";

        String stringA = "AccessKey="+ AccessConstant.ACCESS_KEY +"&"+param+"&timestamp="+timestamp()+"&nonce="+nonce();
        String stringSignTemp = stringA+"&SecretKey="+AccessConstant.SECRET_KEY;
        sign = SecureUtil.md5(stringSignTemp).toUpperCase();

        return sign;
    }

    public static void main(String[] args) {
        log.info("nonce: "+nonce());
        log.info("timestamp: "+timestamp());
    }

}
