package StudentLinkedList;

import Linked.SinglyLinkedList;
import StudentLinkedList.Student;



public class StudentList extends SinglyLinkedList<Student> {
    public void showStudentListHighGPA(double minGPA) {
        iNode<Student> currentnode;
        currentnode = head;
        while (currentnode != null) {
            if (currentnode.getElement().getDTB() > minGPA) {
                System.out.println(currentnode.getElement().toString());
            }
            currentnode = currentnode.getNext();
        }
    }

    public void showFStudentListHighGPA() {
        iNode<Student> currentnode;
        currentnode = head;
        while (currentnode == null) {
            if (currentnode.getElement().getDTB() > 8
                    && currentnode.getElement().getGioiTinh() == 'F') {
                System.out.println(currentnode.getElement().toString());
            }
        }
        currentnode = currentnode.getNext();
    }


    public void addStudentOrderedByName(Student std) {
        iNode<Student> newnode = new iNode<Student>(std);

        if (this.size <= 0) {
            this.head = newnode;
        } else {
            String tensv = newnode.getElement().getHoTen();
            if (tensv.compareTo(this.head.getElement().getHoTen()) < 0) {
                newnode.setNext(this.head);
                this.head = newnode;
            } else {
                iNode<Student> currentNode;
                currentNode = this.head;
                while (currentNode.getNext() != null
                        &&
                        tensv.compareTo(currentNode.getNext().getElement().getHoTen()) > 0) {
                    currentNode = currentNode.getNext();
                }

            }

        }this.size++;

    }
}