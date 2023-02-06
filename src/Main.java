
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
        xlist.add("GG2");
        xlist.add("GG12");
        xlist.add("GG22");
        xlist.add("GG32");
        xlist.ShowList();
    }

}