package com.my.bbs.common;

public class Constants {
    //上传文件的默认url前缀
    public final static String FILE_UPLOAD_DIC = System.getProperty("user.dir") + "\\images\\";
    //session中user的key
    public final static String USER_SESSION_KEY = "myBBSUser";
    //验证码key
    public final static String VERIFY_CODE_KEY = "userVerifyCode";
}
