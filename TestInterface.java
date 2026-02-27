
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class TestInterface {
    public static void main(String... args){
        
        TextMessage message = new TextMessage("ope", "It's going great!");
        System.out.println(message.read());
        ArrayList<TextMessage> textMessage = new ArrayList<>();
        textMessage.add(new TextMessage("private number", "I hid the body."));
        textMessage.add(new TextMessage("Aaron", "Love you Dady."));
        textMessage.add(new TextMessage("Noah", "Be Strong we are proud of you."));
        textMessage.add(new TextMessage("Ananya", "I know you can smash it my father Abe."));
        textMessage.forEach(ms->{
            System.out.println(ms.read());
        });
        
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming.", pages);

        int page = 0;
        while (page < book.pages()) {
            System.out.println(book.read());
            page = page + 1;
        }
        
  
        
    }
    
}
