import java.util.EnumMap;

public class Demo3 {
    enum Day{
        ONE, TWO
    }
    public static void main(String[] args) {
        EnumMap emEnumMap = new EnumMap(Day.class);
        emEnumMap.put(Day.ONE, "111");
        System.out.println(emEnumMap);
    }
}
