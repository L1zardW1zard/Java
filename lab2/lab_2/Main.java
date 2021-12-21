package lab_2;

import java.io.Serializable;

public class Main {
    public static void main(String[] args)  {
       LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(5);

        printArray(list.toArray());
        System.out.println("");
        System.out.println(list.contains(1));
        System.out.println(list.contains(-3));
        list.remove(8);
        printArray(list.toArray());

        ArrayList<Double> arrayList = new ArrayList<Double>();
        arrayList.add(4.0);
        arrayList.add(7.0);
        arrayList.add(2.0);
        arrayList.add(10.0);
        arrayList.add(43.0);
        arrayList.add(21.0);
        arrayList.add(6.0);
        arrayList.add(1.0);
        arrayList.add(5.0);
        arrayList.add(76.0);
        arrayList.add(8.0);
        arrayList.add(6.0);
        arrayList.add(3.0);
        System.out.println("");
        printArray(arrayList.toArray());
        System.out.println("");
        System.out.println(arrayList.contains(10.0));

        TestClass tc = new TestClass();
        byte[] bytes = SerializationUtil.serialize(tc);
        TestClass deserelizedTestClass = (TestClass) SerializationUtil.deserialize(bytes);
        System.out.print(deserelizedTestClass.name + " " + deserelizedTestClass.age);
    }

    private static <T> void printArray(T[] arr) {
        for (T elem : arr) {
            System.out.print(elem + " ");
        }
    }
}

class TestClass implements Serializable {
    public final String name = "Valentyn";
    public final byte age = 20;
}
