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
public class Node {
    
    int data;
    Node leftChild;
    Node rightChild;
    int countOfChild;

    public Node(int data) {
        leftChild = null;
        rightChild = null;
        countOfChild = 0;
        this.data = data;
    }
    
    
    
}
