/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

/**
 *
 * @author samet
 */
public class ListbasedStack<T> {    
    
    Node<T> head;
    private int size = 0;
    
    public void push(T data){    
        Node <T>  newNode = new Node<>(data);
        
        if (head == null){
            head = newNode;
            size++;                    
        }
        else{
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    
    public T pop(){
        if (size > 0){
            Node <T> temp = head;
            head = head.next;        
            size--;        
            
            return temp.data;  
        }
            
        return null;
    }
    
    public T peek(){
        return head.data;
    }
    
    public T top(){ 
        return head.data;
    }
    
    public int getSize(){    
        return size;
    }
    
    public boolean  isEmpty(){
        if (size == 0){
            return true;
        }
        
        return false;
    } 
               
}
