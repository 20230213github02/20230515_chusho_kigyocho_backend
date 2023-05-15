package com.example.chusho_kigyocho_20230515.util;

/**
 * 公共的返回码
 *    返回码code：
 *      成功：10000
 *      失败：10001
 *      未登录：10002
 *      未授权：10003
 *      抛出异常：99999
 */
public enum ResultCode {

    SUCCESS(true,10000,"操作が成功しました。"),
    NEWUSER(true,10001,"操作が成功しました。"),
    //---系统错误返回码-----
    FAIL(false,20001,"操作が失敗しました。"),    
    UNAUTHENTICATED(false,20002,"アカウントにログインしてください。"),
    UNAUTHORISE(false,20003,"権限が不足しています。"),
    NODEL(false,20004,"削除できません。"),
    NOFIRSTUSER(false,20005,"初期設定されているユーザーです。"),
    NOLENGTH(false,20006,"文字数がオーバーしました。"),
    SERVER_ERROR(false,99999,"サーバにてエラーが発生しました、後でまたお試しください。"),
    PWD_ERROR(false,20007,"旧パスワードが間違っています。正しいパスワードを入力してください");
    //---用户操作返回码  2xxxx----
    //---企业操作返回码  3xxxx----
    //---权限操作返回码----
    //---其他操作返回码----

    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    ResultCode(boolean success,int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean success() {
        return success;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

}
