/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinked;

/**
 *
 * @author samet
 */
class Node<T extends Object> {

    public T data;
    public Node<T> next;

    public Node() {
        this.next = null;
    }

}

public class QueueLinked<T extends Object> {

    private Node<T> first;
    private Node<T> last;
    private int count;
    
    public QueueLinked() {
        this.first=null;
        this.last=null;
        this.count=0;
    }
    
    public void enqueue(T dt){
        Node<T> newnode= new Node<>();
        newnode.data=dt;
        
        this.count++;
        
        if(this.first==null){
            this.last=newnode;
            this.first=this.last;
        }
        else{
            this.last.next=newnode;
            this.last=this.last.next;
        }
    } 
    
    public T dequeue(){
        if(this.first==null){
            return null;
        }
    
        Node <T> temp =this.first;
        this.first=this.first.next;
        this.count--;
       
        return temp.data;
    }        
    
    public boolean isEmpty(){
        return this.first == null;
    }
    
    public int size(){
        return this.count;
    }
    
    public void printAll(){
        Node<T> current= this.first;
        
        while(current!=null){
            System.out.print("<<"+current.data+">>");
            current = current.next;
        }    
        
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) {

        QueueLinked<Integer> liste = new QueueLinked<>();
        liste.enqueue(1);
        liste.enqueue(3);
        liste.enqueue(5);
        liste.enqueue(7);

        liste.printAll();
        System.out.println(liste.dequeue());
        liste.printAll();
        
        liste.dequeue();
        liste.dequeue();
        liste.dequeue();
        System.out.println(liste.isEmpty());
        
        liste.printAll();
        liste.enqueue(7);
        liste.printAll();
        
        System.out.println(liste.isEmpty());
    }

}
