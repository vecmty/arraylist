package main;

public class Main {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");



        list.remove("3");
        list.remove("4");


        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        System.out.println(list.get(6));


    }
}
