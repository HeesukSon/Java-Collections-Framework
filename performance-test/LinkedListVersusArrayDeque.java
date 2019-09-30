import java.util.LinkedList;
import java.util.ArrayDeque;

public class LinkedListVersusArrayDeque {
	public static void main(String[] args){
		final int addCnt = 200000;
		long before;
		long linkOfferT;
		long deqOfferT;
		long linkContT;
		long deqContT;
		long linkPeekT;
		long deqPeekT;
		long linkPollT;
		long deqPollT;

		LinkedList <Integer> linkQ = new LinkedList<Integer>();
		ArrayDeque <Integer> arrDeQ = new ArrayDeque<Integer>();

		System.out.println("\n### OFFER-FIRST PERFORMANCE COMPARISON ###");
		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			linkQ.offerFirst(i);
		}
		linkOfferT = System.currentTimeMillis()-before;

		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			arrDeQ.offerFirst(i);
		}
		deqOfferT = System.currentTimeMillis()-before;

		System.out.println("Offering "+addCnt+" items to the first of a LinkedList-based Queue takes "+linkOfferT +" ms.");
		System.out.println("Offering "+addCnt+" items to the first of an ArrayDeque-based Queue takes "+deqOfferT +" ms.");

		System.out.println("\n### OFFER-LAST PERFORMANCE COMPARISON ###");
		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			linkQ.offerLast(i);
		}
		linkOfferT = System.currentTimeMillis()-before;

		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			arrDeQ.offerLast(i);
		}
		deqOfferT = System.currentTimeMillis()-before;

		System.out.println("Offering "+addCnt+" items to the last of a LinkedList-based Queue takes "+linkOfferT +" ms.");
		System.out.println("Offering "+addCnt+" items to the last of an ArrayDeque-based Queue takes "+deqOfferT +" ms.");

		System.out.println("\n### PEEK PERFORMANCE COMPARISON ###");
		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			linkQ.peek();
		}
		linkPeekT = System.currentTimeMillis()-before;

		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			arrDeQ.peek();
		}
		deqPeekT = System.currentTimeMillis()-before;

		System.out.println("Retrieving the peek item of LinkedList-based Queue "+addCnt+" times takes "+linkPeekT +" ms.");
		System.out.println("Retrieving the peek item of ArrayDeque-based Queue "+addCnt+" times takes "+deqPeekT +" ms.");

		System.out.println("\n### CONTAINS PERFORMANCE COMPARISON ###");
		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			linkQ.contains(i);
		}
		linkContT = System.currentTimeMillis()-before;

		before = System.currentTimeMillis();
		for(int i=0; i<addCnt; i++){
			arrDeQ.contains(i);
		}
		deqContT = System.currentTimeMillis()-before;

		System.out.println("Checking containment of the stored items in a LinkedList-based Queue "+addCnt+" times takes "+linkContT +" ms.");
		System.out.println("Checking containment of the stored items in a ArrayDeque-based Queue "+addCnt+" times takes "+deqContT +" ms.");

		System.out.println("\n### POLL PERFORMANCE COMPARISON ###");
		before = System.currentTimeMillis();
		for(int i=0; i<addCnt*2; i++){
			linkQ.poll();
		}
		linkPollT = System.currentTimeMillis()-before;

		before = System.currentTimeMillis();
		for(int i=0; i<addCnt*2; i++){
			arrDeQ.poll();
		}
		deqPollT = System.currentTimeMillis()-before;

		System.out.println("Polling the peek item of LinkedList-based Queue "+addCnt*2+" times takes "+linkPollT +" ms.");
		System.out.println("Polling the peek item of ArrayDeque-based Queue "+addCnt*2+" times takes "+deqPollT +" ms.");
	}
}
