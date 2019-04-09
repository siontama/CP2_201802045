public class Entry {
    private String key;
    private int value;

    public Entry(String key) {
        this.key = key;
        this.value = 1;
    }

    public Entry(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public void addValue() {
        value++;
    }

    public String getKey() {
        return this.key;
    }

    public int getValue() {
        return this.value;
    }
}
