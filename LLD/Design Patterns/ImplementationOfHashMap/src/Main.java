public class Main {
    public static void main(String[] args) {

        MyHashMap<Integer, String> map = new MyHashMap<>(3);
        map.put(1, "Hi");
        map.put(2, ", ");
        map.put(3, "Naman ");
        map.put(4, "this ");
        map.put(5, "side ");
        map.put(6, ":)");
        for(int i=1;i<=6;i++) {
            System.out.print(map.get(i));
        }
    }
}