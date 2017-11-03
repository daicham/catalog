package com.daicham.catlog.domain.model.log;

/**
 * @author daicham
 */
public class LogId {
    //TODO: Integer にしたいが、MVC の bind で type convert error になる
    String value;

    //TODO: Mybatis がつかう。コンストラクトを使うようにすればなくせる？
    public LogId() {
    }

    public LogId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
