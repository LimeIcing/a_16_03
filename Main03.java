public class Main03 {

    public static void main(String[] args) {
        LinkedIntList03 a = new LinkedIntList03();
        a.add(1);
        a.add(2);
        a.add(3);
        LinkedIntList03 b = new LinkedIntList03();
        b.add(3);
        b.add(2);
        b.add(1);
        LinkedIntList03 c = new LinkedIntList03();
        c.add(1);
        c.add(1);
        c.add(1);
        LinkedIntList03 d = new LinkedIntList03();
        System.out.println(a.isSorted());
        System.out.println(b.isSorted());
        System.out.println(c.isSorted());
        System.out.println(d.isSorted());
    }
}
