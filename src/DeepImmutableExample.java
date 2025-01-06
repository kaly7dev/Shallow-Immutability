import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DeepImmutableExample {
    private final String name;
    private final List<String> items;

    public DeepImmutableExample(String name, List<String> items) {
        this.name = name;
        this.items = new ArrayList<>(items);
    }

    public String getName() {
        return name;
    }

    public List<String> getItems() {
        return Collections.unmodifiableList(items);
    }
}