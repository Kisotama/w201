package StudentPack;

public class Student {
    private String Name;
    private char Sex;
    private double average;



    public  Student(){
        Name = null;
        Sex = 0;
        average = -1;
    }
    public  Student(String name){
        Name = name;
        Sex = 0;
        average = -1;

    }
    public  Student (String name, char sex, double Average){
        Name = name;
        Sex = sex;
        average = Average;
    }

    public double getAverage(){
        return average;
    }



    @Override
    public String toString() {
//        return "Student{" +
//                "Name='" + Name + '\'' +
//                ", Sex=" + Sex +
//                ", average=" + average +
//                '}';
        return Name + " " + Sex + " " + average;
    }
}
