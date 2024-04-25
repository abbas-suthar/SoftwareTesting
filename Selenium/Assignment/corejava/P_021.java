package Assignment;

import java.util.ArrayList;

public class P_021 {
//	21.	WAP to remove the third element from a array list. 
	public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        
        System.out.println("Original ArrayList: " + arrayList);
        
        if (arrayList.size() >= 3) {
            arrayList.remove(2);
            System.out.println("ArrayList after removing the third element: " + arrayList);
        } 
    }
}
