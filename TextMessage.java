/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class TextMessage implements Readable{
    private String sender;
    private String content;
    
    public TextMessage(String sender, String content){
        this.content = content;
        this.sender = sender;
    }
    
    public String getSender(){
        return this.sender;
        
    }
    public String getContent(){
        return this.content;
    }
    

    @Override
    public String read() {
        return this.content;

    }
    
}
