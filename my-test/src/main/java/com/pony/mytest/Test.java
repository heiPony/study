package com.pony.mytest;

import org.apache.commons.codec.binary.Base64;
public class Test {

    public static void main(String[] args) {
       String name =" NVkyRDVMaWQ1cDJvNXArejVMeTA1cGlsNmFPTw==";

        try {
            for (int i = 0; i < 2; i++) {
                name = new String(Base64.decodeBase64(name.getBytes("utf-8")));
            }
        } catch (Exception e) {
        }
        System.out.println(name);
    }
}
