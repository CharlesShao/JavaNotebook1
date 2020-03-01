package com.komorebishao4;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Math02 math02 = new Math02ImplAdd();
        System.out.println(math02.op1(10, 20));
    }

}
interface Math02{
    int op1(int a, int b);
}
class Math02ImplAdd implements Math02{
    @Override
    public int op1(int a, int b) {
        return a + b;
    }
}