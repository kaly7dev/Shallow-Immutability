import java.util.ArrayList;
import java.util.List;

public class ShallowImmuMain {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");

        ShallowImmutableExample example = new ShallowImmutableExample("Example", items);

        System.out.println("Before modification: " + example.getItems());

        items.add("Item3");

        System.out.println("After modification: " + example.getItems());
    }
}