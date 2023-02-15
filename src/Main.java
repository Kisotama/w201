import Linked.SinglyLinkedList;
import StudentLinkedList.Student;
import StudentLinkedList.StudentList;

class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Demo - Linear Data ADT");

        StudentList xlist = new StudentList();

        xlist.addFirst(new Student("A Tu", 'M', 6.9));
        xlist.addFirst(new Student("A Ka", 'M', 3));
        xlist.addFirst(new Student("A Ma", 'F', 5));
        xlist.addFirst(new Student("A Pa", 'M', 6));
        xlist.addFirst(new Student("A Ty", 'F', 9));

        xlist.showObjectInSinglyList();

        System.out.println("... in ds sv > 5");
        xlist.showStudentListHighGPA(5);



    }



}