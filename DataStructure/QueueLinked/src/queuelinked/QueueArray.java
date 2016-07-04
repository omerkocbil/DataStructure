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


public class QueueArray <T extends Object> {
        
    private T [] queue;
    private int size;
    private int last;
    private int first;
    
    public QueueArray(){   this.size=10;
        this.queue= (T[]) new Object[this.size];
        this.last=0;
        this.first=0;
    }
    
    public void enqueue(T dt){
        if(this.last>= this.size){
            return;
        }
        
        this.queue[this.last]=dt;
        this.last++;
    }
    
    
    public T dequeue(){
        if(this.first > this.last && this.queue[this.first]!=null){
            return null;
        }
        this.first++;
        
        return this.queue[this.first-1];
    }        
    
}
