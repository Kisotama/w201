package BookList;

import Linked.SinglyLinkedList;
import StudentLinkedList.Student;

public class BookLinkedList extends SinglyLinkedList<Book> {

    public void listBookName(String name) {
        iNode<Book> currentnode;
        currentnode = head;
        while (currentnode != null) {
            if (currentnode.getElement().hasBookName(name)) {
                System.out.println(currentnode.getElement().toString());
            }
            currentnode = currentnode.getNext();

        }

    }

    public void listAuthor(String author) {
        iNode<Book> currentnode;
        currentnode = head;
        while (currentnode != null) {
            if (currentnode.getElement().hasAuthor(author)) {
                System.out.println(currentnode.getElement().toString());
            }
            currentnode = currentnode.getNext();


//    class BubbleSort extends Book {
//        iNode<Book> currentnode;
//        public void bubblesort(int arr[]){
//            int n = arr.length;
//            for (int i=0; i < n-1; i++){
//                for (int j = 0 ; j < n-1 ; j++){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//
//                }
//            }
//        }
//        public void bubbleSort(String args[]){
//            BubbleSort ob = new BubbleSort();
//            Book namebook = new Book();
//            ob.bubbleSort();
//        }
        }
    }
}



