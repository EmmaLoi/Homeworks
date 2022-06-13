package HW7;

public class Main {
    public static void main(String[] args) {
        ArrayString sut = new ArrayString();

        sut.add("1");
        sut.add("2");
        sut.add("3");
        sut.add("4");
        sut.add("5");
        sut.add("6");
        sut.add(15, "6");
        sut.add(10, "6");
        System.out.println(sut);
        System.out.println(sut.get(5));
        sut.delete(5);
        System.out.println(sut);
        System.out.println(sut.delete("2"));
        System.out.println(sut);
    }
}
