import java.util.List;

public final class ShallowImmutableExample {
    private final String name;
    private final List<String> items;

    public ShallowImmutableExample(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public List<String> getItems() {
        return items;
    }
}