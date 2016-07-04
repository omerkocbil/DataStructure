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
public class BinaryTree {
    
    Node root;

    public BinaryTree() {
        root = null;
    }
    
    void addItem(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
        }
        else{
            Node current = root;
            while(current != null){
                if(current.data == data){
                    System.out.println("Bu veri eklenemez");
                    break;
                }
                if(current.data < data){
                    if(current.rightChild == null){
                       current.rightChild = newNode;
                       current.countOfChild++;
                       break;
                    }
                    else{
                        current = current.rightChild;
                    }
                }
                else{
                    if(current.leftChild == null){
                       current.leftChild = newNode; 
                       current.countOfChild++;
                       break;
                    }
                    else{
                        current = current.leftChild;
                    }
                }
            }
        }
    }
    
    void remove(int data){
        Node current = root;
        Node temp = null;
        
        if(current != null){
            if(current.data == data){
                temp = current;
            }
            preOrder(current.leftChild);
            preOrder(current.rightChild);
        }
        
        if(temp != null){
            if(temp.countOfChild == 0){
                
            }
            else if(temp.countOfChild == 1){
                
            }
            else{
                
            }
        }
        else{
            System.out.println("Böyle bir veri yok");
        }
    }
    
    private void preOrder(Node current){
        if(current != null){
            System.out.print("<< "+ current.data +" >>");
            preOrder(current.leftChild);
            preOrder(current.rightChild);
        }
    }
    
    void printTree(){
        if(this.root==null)
        {
            System.out.println("Tree boş");
        }
        else
        {
            System.out.print(" ");
            preOrder(this.root);
        }
        System.out.println("");
    }
    
    
    
}






