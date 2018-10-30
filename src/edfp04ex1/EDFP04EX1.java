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
public class EDFP04EX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      QueueADT<String> que=new LinkedQueue<>();
      que.enqueue("A");
     // System.out.println(que.first());
      que.enqueue("B");
     // System.out.println(que.first());
    //  System.out.println(que.size());
    //  System.out.println(que.toString());
      que.enqueue("C");
      que.enqueue("D");
      System.out.println(que.toString());
      
       System.out.println(que.dequeue());
       System.out.println(que.dequeue());
       que.enqueue("K");
      System.out.println(que.first());
      System.out.println(que.toString());
         
      
        
        
        
    }
    
}
