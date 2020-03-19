import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class Demo5 {
    public static void main(String[] args) {
        HashSet books = new HashSet();
        books.add("百科全书");
        books.add("故事集锦");
        books.add("一天一页");
        books.add("全书");
        books.add("百科");
        // 使用 Lambda 表达式（目标类型是 Predicate）过滤集合
        books.removeIf(ele -> ((String) ele).length() < 4);
        System.out.println(books);
        // 统计书名包含“孕”子串的图书数量
        System.out.println(calAll(books, ele -> ((String) ele).contains("一")));
    }
    // 定义一个 calAll() 方法来根据指定条件来处理指定的集合元素    
    // 然后实现了一个统计的功能，统计次数在 total 中    
    // 主要使用了 predicate 的 test() 方法
    public static int calAll(Collection books, Predicate p) {
        int total = 0;
        for (Object obj : books) {
            // 使用 Predicate 的 test() 方法，判断该对象是否满足 Predicate 指定的条件
            if (p.test(obj)) {
                total++;
            }
        }
        return total;
    }
}


