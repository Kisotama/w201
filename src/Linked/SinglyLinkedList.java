package Linked;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SinglyLinkedList<E>  {





    private static class iNode<E>{
        // khai báo biến
        private  E element;
        private iNode<E> next;

        public iNode(E element){
            this.element = element;
        }
    }
    private  iNode<E> head;

    private iNode<E> tail;
    private int size;

    public SinglyLinkedList(){
        head = null;
        size = 0;
    }
    public void addFirst(E element){
        iNode<E> NewNode = new iNode<E>(element);
            // giả sử 1 list có 2 char là A B
            NewNode.next = this.head; //thg mới (C) thêm vào thg head C -> A(Head) -> B
            this.head = NewNode; // thg đầu trở thành mới B -> A -> C
            this.size++; // tăng size của 1 list lên thành 3 char A C B
    }

    public E getFirst(){
        if(this.head == null)
            return null;
        else 
            return this.head.element;
        
    }
    public void addLast(E element){
        iNode<E> NewNode2 = new iNode<E>(element);
        iNode<E> lastNode;

        if ( this.head == null){
            NewNode2 = this.head;
        } else {
            lastNode = NewNode2;
            while (lastNode.next != null){
                lastNode = lastNode.next;
                lastNode.next = NewNode2;
            }
        }
        this.size++;
    }
    public void showSingly(){
        iNode<E> currentNode;

        System.out.println("\n\n Show SinglyLinkedList: ");
        currentNode = this.head;
        while( currentNode != null){
            System.out.println(currentNode.element);
            currentNode = currentNode.next;
        }
    }
    public void set(){
        Set<String> set = new HashSet<String>();
    }
}
