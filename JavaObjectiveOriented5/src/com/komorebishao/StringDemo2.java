package com.komorebishao;

public class StringDemo2 {
    public static void main(String[] args) {
        String str2 = "ZhangSan01";
        String str3 = " lisi";
        //长度
        System.out.println("返回字符串的长度" + str2.length());
        //字符串拼接
        System.out.println("字符串拼接：" + str2.concat("李四"));
        System.out.println("字符串拼接：" + str2 + "李四" + "dd");
        //字符判断
        System.out.println("比较两个字符串 内容相同为true 否则为false  " + str2.equals("张三"));
        System.out.println("判断是否为空 空的话返回true 否则false：" + str2.isEmpty());
        System.out.println("比较字符串（忽略大小写）：" + str2.equalsIgnoreCase("ZHANGSAN01"));
        System.out.println("按照字典(Unicode值)顺序进行比较,0表示相同，排在之前为负数 否则为正数：" + str2.compareTo(str3));
        System.out.println("按照字典顺序进行比较，忽略大小写:" + str2.compareToIgnoreCase(str3));
        System.out.println("判断是否以该字符串开头：" + str2.startsWith("Zhang"));
        System.out.println("判断是否以该字符串结尾：" + str2.endsWith("01"));
        //字符转换
        System.out.println("把字符串中的字符转换成大写：" + str2.toUpperCase());
        System.out.println("把字符串中的字符转换成小写：" + str2.toLowerCase());
        System.out.println("将字符串转换成字节数组:" + str2.getBytes());
        System.out.println("valueof方法 把基本数据类型都转化成字符串：" + str3.valueOf(12));
        //字符串返回字符内容或索引
        System.out.println("根据索引返回字符串中该索引对应的字符：" + str2.charAt(0));
        System.out.println("根据传入的字符串返回他的索引值：" + str3.indexOf("l"));
        //字符串去点前空白和后空白
        System.out.println(str3);
        System.out.println("去掉字符串前空白和后空白并返回：" + str3.trim());
        //字符串截取 以1索引值开始截取到结尾
        System.out.println("字符串截取：" + str2.substring(1));
        System.out.println("字符串截取：" + str2.substring(1, 4));//从开始索引值1截取到结束4索引值位置，不包含结束4索引值
        //字符串分割
        String str4 = "长亭外，古道边，芳草碧连天";
        String []arrayStr5 = str4.split("，");
        //System.out.println(arrayStr5); 这样是错的，因为数组是引用类型，这样只能输出地址
        for (String string : arrayStr5) {
            System.out.println(string);
        }
        System.out.println(arrayStr5[0]);
        //""引号引起来的内容就是字符串 只要是字符串就能调用字符串中的方法
        System.out.println("zhangsan".equals("ddd"));

    }
}
