public class ArrayMap implements Map {
    int size = 0;
    Entry[] entry; //key, value 를 가지는 entry 배열
    private static final int DEFAULT_CAPACITY = 1000;

    public ArrayMap() {
        entry = new Entry[DEFAULT_CAPACITY];
    }

    @Override
    public int getValue(String key) {
        //entry에 해당하는 키 값이 있는지 확인하고 있다면 해당하는 키 값의 value를 리턴하고 없다면 -1을 리턴
        for(int i=0;i<size;i++){
            if(entry[i].getKey().equals(key))
                return entry[i].getValue();
        }
        return -1;
    }

    @Override
    public void put(String key) {
        //entry에 해당하는 key가 있다면 addValue, 없다면 entry 새로 만들어 값을 넣어준다.
        for(int i=0;i<size;i++){
            if(entry[i].getKey().equals(key))
                entry[i].addValue();
        }
        entry[size++] = new Entry(key);
    }

    @Override
    public void print() {
        //entry에 있는 모든 key와 value를 출력
        for(int i=0;i<size;i++){
            System.out.println(entry[i].getKey() + " " + entry[i].getValue());
        }
    }

    private void resize() {
        //entry[]의 크기를 증가시켜주는 메소드, size 변수 사용하면 편함

    }

    private int find(String key) {
        //entry에 key가 있는지 확인해주는 메소드, 해당 index를 리턴해줌
        return 0;
    }
}
