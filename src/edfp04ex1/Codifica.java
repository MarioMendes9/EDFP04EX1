/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp04ex1;



/**
 *
 * @author User
 */
public class Codifica {
    
    private LinkedQueue<String> mensageCod;
    private LinkedQueue<Integer> key;
    private LinkedQueue<String> mensageDesc;
    public Codifica(LinkedQueue<String> mensageCod,LinkedQueue<Integer> key) {
        this.mensageCod = mensageCod;
        this.key = key;
        this.mensageDesc=new LinkedQueue<>();
    }
    
    public void traduzMessage(){
        
        while(!mensageDesc.isEmpty()){
            
            
            char c=mensageDesc.dequeue().charAt(0);
            int k=key.dequeue();
        
            int ch=(int)c;
             ch=ch-k;
                
 
            c=(char)ch;
            String add=""+c;
            mensageCod.enqueue(add);
        }
        }
       
    
      
   public void codifica(){
        
        while(!mensageCod.isEmpty()){
            
            
            char c=mensageCod.dequeue().charAt(0);
            int k=key.dequeue();
        
            int ch=(int)c;
             ch=ch+k;
               
            
            c=(char)ch;
            String add=""+c;
            mensageDesc.enqueue(add);
        }
        }

    public LinkedQueue<String> getMensageCod() {
        return mensageCod;
    }

    public LinkedQueue<Integer> getKey() {
        return key;
    }

    public LinkedQueue<String> getMensageDesc() {
        return mensageDesc;
    }
       
    
    
    
    
}
