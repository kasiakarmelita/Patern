package Patern.Builder;

import java.util.List;

public class Solider {
    private String name;
    private String type;
    private List<String> items;

    protected Solider(String name, String type, List<String> items) {
        this.name = name;
        this.type = type;
        this.items = items;
    }

    protected Solider(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Solider{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", items=" + items +
                '}';
    }
}
