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
public class MyStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListbasedStack <Integer> s = new ListbasedStack<>();
        
        s.push(345);
        s.push(445);
        s.push(545);
        s.push(645);
        System.out.println(s.pop());
        s.push(98);
        s.push(856);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.getSize());
        System.out.println("**************");
        System.out.println(s.peek());
        System.out.println(s.top());
        System.out.println("**************");
        System.out.println(s.getSize());
        s.push(576584);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(548484);
        
        if (s.isEmpty()){
            System.out.println("stack boş");
        }
        else{
            System.out.println("stack te eleman var..");
        }
        
        String str  = "omer";
        
        ListbasedStack<Character> s1 = new ListbasedStack<>();
        
        for (int i = 0; i < str.length(); i++) {
            s1.push(str.charAt(i));
        }
        
        String yeni = "";
        int a = s1.getSize();
        
        for (int i = 0; i < a; i++) {
             yeni += s1.pop();
                     
        }
        
        System.out.println(yeni);
    }
    
}
