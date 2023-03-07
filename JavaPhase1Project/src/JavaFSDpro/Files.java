package JavaFSDpro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Files {
	ArrayList<String> arr = new ArrayList<String>();
	
	public void sort() {
		if(arr.size()>0) {
			Collections.sort(arr);
		}else {
			System.out.println("No File Exists, Please add a file to sort");
		}	
	}
	public void addInput(String s){
		int flag = 0;
		for(int i=0;i<arr.size();i++) {
			if(s.equals(arr.get(i))) {
				flag = 1;
				System.out.println("File already exists");
			}
		}
		if(flag == 0) {
			arr.add(s);
		}
	}
	public void removeInput(String s){
		int flag = 0;
		for(int i=0;i<arr.size();i++) {
			if(s.equals(arr.get(i))) {
				flag = 1;
				arr.remove(s);
				System.out.println("File Deleted");
			}
		}
		if(flag == 0) {
	        System.out.println("Entered file doesnt exist to be deleted");
		}
	}
	public void searchInput(String s){
		int flag = 0;
		for(int i=0;i<arr.size();i++) {
			if(s.equals(arr.get(i))) {
				flag = 1;
				System.out.println("File " +arr.get(i)+ " Found");
			}
		}
		if(flag == 0) {
			System.out.println("File does not exist");
		}
	}
	public void print(){
		System.out.println(arr);
	}
}
