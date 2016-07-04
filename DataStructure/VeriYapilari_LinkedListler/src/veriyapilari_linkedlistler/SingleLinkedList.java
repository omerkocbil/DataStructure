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
public class SingleLinkedList <T> {
    
    Node <T> head;
    
    void addFirst(T data){
        Node <T> newNode = new Node<T>();
          
        if(head == null){
            newNode.next = null;
            newNode.data = data;
            head = newNode;         
        }
        
        else{
            newNode.next = head;
            newNode.data = data;
            head = newNode;
        }
        
    }
    
    void addLast(T data){
        Node <T> newNode = new Node<T>();
        Node<T> current = head;
          
        if(head == null){
            newNode.next = null;
            newNode.data = data;
            head = newNode;         
        }
        
        else{
            while(current.next != null){
                current = current.next;
            }
            newNode.next = null;
            newNode.data = data;
            current.next=newNode;
        }
        
    }
    
    void addExactPosition(int position, T data){
        Node <T> newNode = new Node<T>();
        Node <T> current = head;
        int pos = 1;
          
        if(head == null){
            newNode.next = null;
            newNode.data = data;
            head = newNode;         
        }
        
        else{
            while(current != null){
                if(position == 1){
                    addFirst(data);
                    break;
                }
                else if(pos +1  == position){
                    newNode.next = current.next;
                    newNode.data = data;
                    current.next = newNode;
                    break;
                }
                current = current.next;
                pos++;
            }
        }
    }
    
    void removeFirst(){
        head = head.next;
        
    }
    
    void removeLast(){
        Node<T> current = head;
        
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }
    
    void removeExactPosition(int position){
        Node <T> current = head;
        int pos = 1;
    
        while(current != null){
                if(position == 1){
                    removeFirst();
                    break;
                }
                else if(pos +1 == position){
                    current.next=current.next.next;
                    break;
                }
                current = current.next;
                pos++;
        }
    }
    
    void printList(){
        Node<T> current = head;
        
        while(current != null){
            System.out.print(current.data + " --> ");
            current=current.next;
        }
        System.out.print("null\n");
    }
    
}
