import java.util.HashSet;
import java.util.Iterator;

public class Demo4 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("张三1");
        hashSet.add("张三2");
        hashSet.add("张三3");
        hashSet.add("张三4");
        hashSet.add("张三5");
        hashSet.forEach(o1 -> System.out.println("hashSet forech" + o1));
        Iterator<String> iterator = hashSet.iterator();
        iterator.forEachRemaining(o1 -> System.out.println("hashSet 迭代器" + o1));
    }
}
