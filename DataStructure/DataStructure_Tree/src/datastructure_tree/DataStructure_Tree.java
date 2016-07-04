/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure_tree;

/**
 *
 * @author jan
 */
public class DataStructure_Tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.printTree();
        tree.addItem(28);
        tree.addItem(42);
        tree.addItem(21);
        tree.addItem(12);
        tree.addItem(12);
        tree.addItem(25);
        tree.addItem(35);
        tree.addItem(48);
        tree.printTree();
    }
    
}
