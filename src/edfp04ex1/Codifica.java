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

    public Codifica(LinkedQueue<String> mensageCod, LinkedQueue<Integer> key) {
        this.mensageCod = mensageCod;
        this.key = key;
        mensageDesc=new LinkedQueue<>();
    }
    
    public void traduzMessage(){
         while(!mensageCod.isEmpty()){
            char c=mensageCod.dequeue().charAt(0);
            int k=key.dequeue();
            if(c==' '){
                mensageDesc.enqueue(" ");}
            
            
            else{
             
             int ch=(int)c;
             ch=ch-k;
                if(ch<97){
                    ch+=26;
                }
            
            c=(char)ch;
            String add=""+c;
            mensageDesc.enqueue(add);
         }
        }
    }

    public LinkedQueue<String> getMensageDesc() {
        return mensageDesc;
    }
    
    
    
}
