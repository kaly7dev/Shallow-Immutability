import java.util.ArrayList;
import java.util.List;

public class DeepImmuMain {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");

        DeepImmutableExample example = new DeepImmutableExample("Example", items);

        System.out.println("Before modification: " + example.getItems());

        items.add("Item3");

        System.out.println("After external modification attempt: " + example.getItems());

    }
}