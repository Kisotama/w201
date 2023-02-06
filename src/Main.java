
import ArrayListPackage.Arraylist;

import java.util.ArrayList;
import NodePack.Node;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Arraylist.ArrayListApp<String> xlist = new Arraylist.ArrayListApp<String>();
        xlist.add("GG");
        xlist.add("GG1");
        xlist.add("GG2");
        xlist.add("GG3");
        xlist.ShowList();
        System.out.println("\n\n  Element[8] = ");
        System.out.println(xlist.get(8));

        String oldx = xlist.set(0,"Sea Tui");
        xlist.ShowList();
    }

}