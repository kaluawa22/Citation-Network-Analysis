/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citation.network.analysis;
import java.util.*;
import java.io.*;
/**
 *
 * @author kaluawa
 */
public class CitationNetworkAnalysis {
    
    public class LinkedList {
        Node head;
        
        class Node {
            
            int tier;
            String id;
            String title;
            String year;
            String citations;
            String publisher;
            
            Node next;
            
            Node(int tier, String id, String title, String year, String citations, String publisher){
                
                this.tier = tier;
                this.id = id;
                this.id = title;
                this.id = year;
                this.id = citations;
                this.id = publisher;
                
                next = null;
            }
                   
        }
        public LinkedList insert(LinkedList list, int tier, String id, String title, 
                String year, String citations, String publisher ){
            Node new_node = new Node(tier, id, title, year, citations, publisher);
            new_node.next = null;
            
            
            if (list.head == null) {
                list.head = new_node;
             
            }
            else {
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = new_node;
            }
            return list;
        }
        
        public void printList(LinkedList list) {
            Node currNode = list.head;
            System.out.print("LinkedList: ");
            
            while (currNode != null) {
                System.out.print(currNode.tier + " "); //Might be Tier or Might be data
                currNode = currNode.next;
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
