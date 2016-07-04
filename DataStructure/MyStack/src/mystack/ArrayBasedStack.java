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
public class ArrayBasedStack<T extends Object> {

    int top;
    int max;
    T liste[];

    public ArrayBasedStack(int size) {
        top = -1;
        liste = (T[]) new Object[size];
        max = size;
    }

    public void push(T dt) {
        if (top < max) {
            top++;
            liste[top] = dt;
        }
    }

    public T pop() {
        if (top > -1) {
            T tmp = liste[top];
            top--;
         
            return tmp;
        } 
        else {
            return null;
        }
    }
    
    public T top(){
        if (top > -1) {
            T tmp = liste[top];
            
            return tmp;
        } 
        else {
            return null;
        }
    }        

    public static void main(String[] args) {
        ArrayBasedStack<Integer> list = new ArrayBasedStack<>(10);
        
        list.push(1);
        list.push(2);
        list.push(3);
        
        System.out.println(list.pop());
        System.out.println(list.top());
        System.out.println(list.top());
    }

}
