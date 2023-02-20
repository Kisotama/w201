package BookList;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    // Khai báo biến
    private  int ID;
    private int ISBN;
    private String tensach;
    private String DStacgia;
    private String NXB;
    private String date;
    private double Price;
    private char type;
    private int lantaiban;

    public Book(){
        ID = 0;
        ISBN = 0;
        tensach = null;
        DStacgia = null;
        NXB = null;
        date = null;
        Price = 0;
        type = 0;
        lantaiban = 0;
    }

    public Book(int id, String TENSACH, String tacgia, int LANTAIBAN) {
        ID = id;
        tensach = TENSACH;
        DStacgia = tacgia;
        lantaiban = LANTAIBAN;
    }

    public void setDate(){
        Date date = new Date();
        SimpleDateFormat a = new SimpleDateFormat("hh:mm:ss a");
    }

    public Book(int id, int isbn, String TENSACH, String dstacgia, String nxb, String DATE,double price, char TYPE, int LANTAIBAN){
        ID = id;
        ISBN = isbn;
        tensach = TENSACH;
        DStacgia = dstacgia;
        NXB = nxb;
        date = DATE;
        Price = price;
        type = TYPE;
        lantaiban = LANTAIBAN;
    }

    public String getBookName() {
        return tensach;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double newprice) {
        Price = newprice;
    }

    public  boolean hasAuthor(String tg){
        return DStacgia.contains(tg);
    }

    public boolean hasBookName(String td){
        return tensach.contains(td);
    }



    @Override
    public String toString() {
        return
                "\nID= " + ID +
                "\ntensach= '" + tensach + '\'' +
                "\nDStacgia= '" + DStacgia + '\'' +
                "\ndate= " + date
                ;
//        return ID +" "+ ISBN+ " " + tensach + " " + DStacgia + " " + NXB + " " + date + " " + Price + " " + type + " " + lantaiban;
    }
}
