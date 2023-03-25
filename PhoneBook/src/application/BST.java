package application;

import application.BSTNode;
import application.DirectoryModel;
//import application.PhoneDirectory;

class BST {
    BSTNode root;
    public void insert(DirectoryModel directoryModel) {
        if (root == null) 
        	root = new BSTNode(directoryModel);
        else 
        	root.insert(directoryModel);
    }

    public void inorder() {
        if (root == null) 
        	return;
        else 
        	root.inorder();
    }

    public void display() {
        if (root == null) 
        	return;
        else 
        	root.display();
    }

    public void search(String name) {
        if (root == null) 
        	return;
        else 
        	root.search(name);
    }

}
