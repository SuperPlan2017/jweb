package com.mmj.common;
import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
/*******************************************************************************
 * Copyright (c) 2017 daixinlian.com
 *
 * All rights reserved. 
 *
 * Contributors:
 *   Miller Ming - Initial implementation
 *   2017/10/9
 *******************************************************************************/
public class DESUtils {
    private static Key key;
    private static String KEY_STR = "1233333";
    static {
        try {
            KeyGenerator generator = KeyGenerator.getInstance("DESede");
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(KEY_STR.getBytes());
            generator.init(secureRandom); //不加此句LINUX系统下解密会报错

            key = generator.generateKey();
            generator = null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 对str进行DES加密
     * @param str 需要加密的字符串
     * @return 返回加密字符串
     */
    public static String getEncryptString(String str) {
        if(str == null) {
            return null;
        }
        BASE64Encoder base64en = new BASE64Encoder();
        try {
            byte[] strBytes = str.getBytes("UTF8");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptStrBytes = cipher.doFinal(strBytes);
            return base64en.encode(encryptStrBytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 对str进行DES解密
     *
     * @param str 加过密的字符串
     * @return   返回解密的字符串
     */
    public static String getDecryptString(String str) {
        if(str == null) {
            return null;
        }
        BASE64Decoder base64De = new BASE64Decoder();
        try {
            byte[] strBytes = base64De.decodeBuffer(str);
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decryptStrBytes = cipher.doFinal(strBytes);
            return new String(decryptStrBytes, "UTF8");
        } catch (Exception e) {
            e.printStackTrace();
            return str;
            //throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) {
        String encrypStr = DESUtils.getEncryptString("需要加密的字符");//返回加密字符串
        String decryptStr = DESUtils.getDecryptString("需要解密的字符"); //返回明文数据

    }

}
