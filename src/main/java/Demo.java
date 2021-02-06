import java.io.Serializable;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Object> list = List.of(4, "string", 3);
        list.forEach(item -> System.out.println(item.getClass().getName() + " " + item));
    }
}
