package com.komorebishao5;

public class EnumDemo2 {
    enum Signal{
        red, yellow, green
    }
    //声明成静态的之后不用实例化就可以使用
    public static String getTrafficSignal(Signal signal) {
        String stringDefault = "信号的故障";
        switch (signal) {
            case red:
                stringDefault = "红灯停";
                break;
            case green:
                stringDefault = "绿灯行";
                break;
            case yellow:
                stringDefault = "黄灯等一等";
                break;
            default:
                break;
        }
        return stringDefault;
    }
    public static void main(String[] args) {
        Signal redSignal = Signal.red;
        System.out.println(getTrafficSignal(redSignal));;
    }
}
