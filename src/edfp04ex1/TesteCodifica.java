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
public class TesteCodifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedQueue<String> cod=new LinkedQueue<>();
       LinkedQueue<Integer> key=new LinkedQueue<>();   
       
       cod.enqueue("k");
       cod.enqueue("n");
       cod.enqueue("o");
       cod.enqueue("w");
       cod.enqueue("l");
       cod.enqueue("e");
       cod.enqueue("d");
       cod.enqueue("g");
       cod.enqueue("e");
       cod.enqueue(" ");
       cod.enqueue("i");
       cod.enqueue("s");
       cod.enqueue(" ");
       cod.enqueue("p");
       cod.enqueue("o");
       cod.enqueue("w");
       cod.enqueue("e");
       cod.enqueue("r");
       
       key.enqueue(3);
       key.enqueue(1);
       key.enqueue(7);
       key.enqueue(4);
       key.enqueue(2);
       key.enqueue(5);
       key.enqueue(3);
       key.enqueue(1);
       key.enqueue(7);
       key.enqueue(0);//key.enqueue(null);
       key.enqueue(4);
       key.enqueue(2);
       key.enqueue(0);//key.enqueue(null);
       key.enqueue(5);
       key.enqueue(3);
       key.enqueue(1);
       key.enqueue(7);
       key.enqueue(4);
       
       Codifica codifica=new Codifica(cod, key);
        
        codifica.codifica();
       System.out.println(codifica.getMensageDesc().toString());
       key.enqueue(3);
       key.enqueue(1);
       key.enqueue(7);
       key.enqueue(4);
       key.enqueue(2);
       key.enqueue(5);
       key.enqueue(3);
       key.enqueue(1);
       key.enqueue(7);
       key.enqueue(0);//key.enqueue(null);
       key.enqueue(4);
       key.enqueue(2);
       key.enqueue(0);//key.enqueue(null);
       key.enqueue(5);
       key.enqueue(3);
       key.enqueue(1);
       key.enqueue(7);
       key.enqueue(4);
       codifica.traduzMessage();
       System.out.println(codifica.getMensageCod().toString());
       
       
       
       
       
    }
    
}
