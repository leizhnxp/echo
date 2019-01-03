package me.leizh;

public interface EchoEntity {
    default String echoCall(String content){
        return content;
    }
}
