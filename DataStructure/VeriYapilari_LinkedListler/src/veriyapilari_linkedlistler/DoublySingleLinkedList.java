/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriyapilari_linkedlistler;

/**
 *
 * @author jan
 */
public class DoublySingleLinkedList <T> {
    
    Node <T> head;
    
    void addFirst(T data){
        Node <T> newNode=new Node();
        
        if(head == null){
            newNode.data = data;
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
        }
        
        else{
            newNode.data = data;
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    
    void addLast(T data){
        Node <T> newNode=new Node();
        Node <T> current = head;
        
        if(head == null){
            newNode.data = data;
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
        }
        
        else{
            while(current.next != null){
                current = current.next;
            }
            newNode.data = data;
            newNode.next = null;
            newNode.prev = current;
            current.next = newNode;
        }
    }
    
    void addExactPosition(int position, T data){
        Node <T> newNode=new Node();
        Node <T> current = head;
        int pos = 1;
        
        if(head == null){
            newNode.data = data;
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
        }
        
        else{
            while(current.next != null){
                if(position == 1){
                    addFirst(data);
                    break;
                }
                else if(pos +1 == position){
                    newNode.data = data;
                    newNode.next = current.next;
                    newNode.prev = current;
                    current.next = newNode;
                    current.next.prev = newNode;
                    break;
                }
                current = current.next;
                pos++;
            }
        } 
    }
    
    void printList(){
        Node <T> current = head;
        
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null\n");
    }
}
