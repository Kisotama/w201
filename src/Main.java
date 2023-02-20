import BookList.Book;
import BookList.BookLinkedList;
import Linked.SinglyLinkedList;
import StudentLinkedList.Student;
import StudentLinkedList.StudentList;

class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        System.out.println("Demo - Linear Data ADT");
//
        StudentList xlist = new StudentList();
//
//        xlist.addFirst(new Student("A Tu", 'M', 6.9));
//        xlist.addFirst(new Student("A Ka", 'M', 3));
//        xlist.addFirst(new Student("A Ma", 'F', 5));
//        xlist.addFirst(new Student("A Pa", 'M', 6));
//        xlist.addFirst(new Student("A Ty", 'F', 9));
//
//        xlist.showObjectInSinglyList();
//
        System.out.println("... in ds sv > 5");
        xlist.showStudentListHighGPA(5);
//
//        System.out.println("... in DFFFFF sv > 4");
//        xlist.showFStudentListHighGPA(4,'F');
        System.out.println("Library");

        BookLinkedList blist = new BookLinkedList();



        blist.addFirst(new Book(1 ,2,"ABC","IDK","KimDong","20/10/1998", 64.6, 'D',5));
        blist.addFirst(new Book(4 ,5,"ABC","IDK","KimDong","20/10/1998", 6.6, 'S',52));
        blist.addFirst(new Book(2 ,8,"ABCz","IDK","KimDong","20/10/1998", 3.6, 'E',53));
        blist.addFirst(new Book(3 ,4,"ABC","IDKk","KimDong","20/10/1998", 1.6, 'R',55));
        blist.addFirst(new Book(5 ,1,"ABC","IDKz","KimDong","20/10/1998", 10.6, 'Z',54));
        blist.addLast(new Book(6,"who ask","who care", 2000));
//        blist.addFirst(new Book());

        blist.showObjectInSinglyList();

        System.out.println("\nThe name you want to found :" );

        blist.listBookName("ABCz");







    }



}