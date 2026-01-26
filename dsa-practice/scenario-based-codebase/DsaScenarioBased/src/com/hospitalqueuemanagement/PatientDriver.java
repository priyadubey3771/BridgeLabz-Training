package com.hospitalqueuemanagement;

public class PatientDriver{
  public static void main(String[] args){
	  
        PatientAVL avl = new PatientAVL();
        Patient root = null;

        root = avl.insert(root, 1010, "Aarav");
        root = avl.insert(root, 1005, "Neha");
        root = avl.insert(root, 1020, "Rohit");
        root = avl.insert(root, 1008, "Priya");
        root = avl.insert(root, 1015, "Karan");

        System.out.println("Patients by Arrival Time:\n");
        avl.inorder(root);

        System.out.println("\nDischarging patient with time 1008\n");
        root = avl.delete(root, 1008);

        System.out.println("After Discharge:\n");
        avl.inorder(root);
    }
}
