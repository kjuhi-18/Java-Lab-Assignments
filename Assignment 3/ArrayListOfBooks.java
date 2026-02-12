import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListOfBooks {
           
    public static void main(String[] args) {
        Book b1 = new Book("Icon", 499, "A892A82","Fiction","Avc");

        Book b2 = new Book();

        Book b3 = new Book();
        b3.title = "Harry Potter";
        b3.author="JK Rowling";
        Book b4= new Book(b3);
        b4.title="HP";
        b4.author="JK R";
        b3.title="Katabasis";
        b3.price=499;
        b3.ISBN="ADse837e";
        b3.genre="Fiction";
        b4.price=2453;
        b4.genre=b3.genre;

        ArrayList<Book> alb = new ArrayList<Book>();


        alb.add(b1);
        alb.add(b2);
        alb.add(b3);
        alb.add(b4);


        for(Book b : alb){
                System.out.println("TITLE: "+b.title);
                System.out.println("PRICE: "+b.price);
                System.out.println("ISBN: "+b.ISBN);
                System.out.println("GENRE: "+b.genre);
                System.out.println("AUTHOR: "+b.author);
                System.out.println("_____________________________________");
                

        }
 double sum = 0;
double avg;

for(Book b : alb){
    sum = sum + b.price; 
}

avg = sum / alb.size();   
System.out.println("The avg price is: " + avg);

        
    }}
