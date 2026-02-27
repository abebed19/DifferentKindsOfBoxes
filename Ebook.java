
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
public class Ebook implements Readable {
    private String name;
    private ArrayList<String> pages;
    private int pageNumber;
    
    public Ebook(String name, ArrayList<String> pages){
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }
    private String getName(){
        return this.name;
        
    }
    private int pages(){
        return this.pages.size();
    }
 
    @Override
    public String read() {
      String page = this.pages.get(pageNumber);
      nextPage();
      return page;
    }
    public void nextPage(){
        this.pageNumber = this.pageNumber +1;
        if( this.pageNumber % this.pages.size() ==0){
            this.pageNumber =0;
        }
    }
    
}
