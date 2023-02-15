
import ArrayListPackage.Arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import NodePack.Node;
import Linked.SinglyLinkedList;
import StudentPack.Student;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList<Student> Xlist = new SinglyLinkedList<Student>();


        Xlist.addFirst(new Student("He",'M',6));
        Xlist.addFirst(new Student("She",'F',6.9));
        Xlist.addFirst(new Student("What",'M',3));


        Xlist.showObjectSingly();



//        SinglyLinkedList<String> Xlist = new SinglyLinkedList<String>();
//
//
//
//
//        Xlist.addFirst("GGbruh");
//        Xlist.addFirst("Damn");
//        Xlist.addFirst("Dude?");
//
//        Xlist.addLast("Damn");
//        Xlist.addLast("GGbruh");
//        Xlist.addLast("Dude?");
//
//
//        Xlist.showSingly();


//        Xlist.addLast("WOW");
//        Xlist.addLast("SUch talent");
//        Xlist.addLast("WOW222");

//
//        Xlist.showSingly();

//        System.out.println("Hello world!");
//
//        Arraylist.ArrayListApp<String> xlist = new Arraylist.ArrayListApp<String>();
//        xlist.add("GG2");
//        xlist.add("GG2");
//        xlist.add("GG2");
//        xlist.add("GG32");
//        xlist.ShowList();
//        System.out.println("\n\n  Element[8] = ");
//        System.out.println(xlist.get(4));
//
////        String oldx = xlist.set(0,"Sea Tui");
////        xlist.ShowList();
////
////        xlist.remove(1);
////        xlist.ShowList();
//
//        //method numberOf()
//        xlist.add("GG 2");
//        xlist.add("GG 2");
//        xlist.add("GG 2");
//        xlist.add("GG 2");
//        xlist.ShowList();
//        System.out.println("\n\n NumberOf = ");
//        System.out.println(xlist.numberOf("GG 2"));
//
//
//
////        int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
//        String[] arr = { "GG", "HH", "GG" };
////        System.out.print(xlist.getMaxFreqElement(arr, n));
//        int n = arr.length;


    }

}