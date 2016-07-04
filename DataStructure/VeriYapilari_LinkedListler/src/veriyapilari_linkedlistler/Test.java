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
public class Test {
    
    public static void main(String[] args) {
        /*SingleLinkedList <Integer> list = new SingleLinkedList<>();
        list.addFirst(15);
        list.addFirst(2);
        list.addFirst(455);
        list.printList();
        list.addLast(50);
        list.printList();
        list.addExactPosition(1, 28000);
        list.printList();
        list.removeExactPosition(5);
        list.printList();*/
        
        DoublySingleLinkedList <Integer> list = new DoublySingleLinkedList<>();
        list.addFirst(18999);
        list.addFirst(18998);
        list.printList();
        list.addLast(19000);
        list.addLast(19001);
        list.printList();
        list.addExactPosition(5, 456);
        list.addExactPosition(2, -56456);
        list.printList();
    }
    
}
