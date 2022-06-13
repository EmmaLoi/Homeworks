package HW7;

public class Main {
    public static void main(String[] args) {
        ArrayString example = new ArrayString();

        example.add("1");
        example.add("2");
        example.add("3");
        example.add("4");
        example.add("5");
        example.add("6");
        example.add(15, "6");
        example.add(10, "6");
        System.out.println(example);
        System.out.println(example.get(5));
        example.delete(5);
        System.out.println(example);
        System.out.println(example.delete("2"));
        System.out.println(example);
    }
}
