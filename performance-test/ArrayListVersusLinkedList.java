import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVersusLinkedList {
	public static void main(String[] args){
		final int addCnt = 100000;
		long before;
		long arrAddTime;
		long linkAddTime;
		long arrGetTime;
		long linkGetTime;
		long arrRemoveTime;
		long linkRemoveTime;

		ArrayList<Integer> arrL1 = new ArrayList<Integer>();
		ArrayList<Integer> arrL2 = new ArrayList<Integer>();
		ArrayList<Integer> arrL3 = new ArrayList<Integer>();
		LinkedList<Integer> linkL1 = new LinkedList<Integer>();
		LinkedList<Integer> linkL2 = new LinkedList<Integer>();
		LinkedList<Integer> linkL3 = new LinkedList<Integer>();

		System.out.println("\n### ADDITION PERFORMANCE COMPARISON (BEST CASE for ArrayList) ###");
		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			arrL1.add(i);
		}
		arrAddTime = System.currentTimeMillis() - before;

		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			linkL1.add(i);
		}
		linkAddTime = System.currentTimeMillis() - before;

		System.out.println("Adding "+addCnt+" items at the end of an ArrayList takes "+arrAddTime+" ms.");
		System.out.println("Adding "+addCnt+" items at the end of a LinkedList takes "+linkAddTime+" ms.");

		System.out.println("\n### ADDITION PERFORMANCE COMPARISON (WORST CASE for ArrayList) ###");
		System.out.println("> This analysis is the 'worst' cast for ArrayList " +
				"because the stored items should be right shifted " +
				"everytime we add an item to the first index of the ArrayList.");
		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			arrL2.add(0, i);
		}
		arrAddTime = System.currentTimeMillis() - before;

		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			linkL2.add(0, i);
		}
		linkAddTime = System.currentTimeMillis() - before;

		System.out.println("Adding "+addCnt+" items at the beginning of an ArrayList takes "+arrAddTime+" ms.");
		System.out.println("Adding "+addCnt+" items at the beginning of a LinkedList takes "+linkAddTime+" ms.");

		System.out.println("\n### GET PERFORMANCE COMPARISON ###");
		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			arrL1.get(i);
		}
		arrGetTime = System.currentTimeMillis() - before;

		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			linkL1.get(i);
		}
		linkGetTime = System.currentTimeMillis() - before;

		System.out.println("Getting "+addCnt+" all stored items iteratively from ArrayList takes "+arrGetTime+" ms.");
		System.out.println("Getting "+addCnt+" all stored items iteratively from LinkedList takes "+linkGetTime+" ms.");

		System.out.println("\n### REMOVE PERFORMANCE COMPARISON (WORST CASE for ArrayList) ###");
		System.out.println("> This analysis is the 'worst' cast for ArrayList " +
				"because the stored items from index 1 should be left shifted " +
				"everytime we remove the first item (index:0) in the ArrayList.");
		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			arrL1.remove(0);
		}
		arrRemoveTime = System.currentTimeMillis() - before;

		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			linkL1.remove(0);
		}
		linkRemoveTime = System.currentTimeMillis() - before;

		System.out.println("Removing "+addCnt+" items from ArrayList takes "+arrRemoveTime+" ms.");
		System.out.println("Removing "+addCnt+" items from LinkedList takes "+linkRemoveTime+" ms.");

		System.out.println("\n### REMOVE PERFORMANCE COMPARISON (BEST CASE) ###");
		before = System.currentTimeMillis();
		for(int i=arrL2.size()-1; i>=0; i--){
			arrL2.remove(i);
		}
		arrRemoveTime = System.currentTimeMillis() - before;

		before = System.currentTimeMillis();
		for(int i=linkL2.size()-1; i>=0; i--){
			linkL2.remove(i);
		}
		linkRemoveTime = System.currentTimeMillis() - before;

		System.out.println("Removing "+addCnt+" items from ArrayList takes "+arrRemoveTime+" ms.");
		System.out.println("Removing "+addCnt+" items from LinkedList takes "+linkRemoveTime+" ms.");
	}
}
