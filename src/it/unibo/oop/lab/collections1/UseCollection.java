package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
    	final List<Integer> set = new ArrayList<Integer>();
    	for(int i=1000; i<2000; i++) {
    		set.add(i);
    	}
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
    	final List<Integer> list = new LinkedList<Integer>(set);
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
    	final int tmp = set.get(set.size()-1);
    	set.add(set.size()-1, set.get(999));
    	set.add(1000, tmp);
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
    	for(int elem: set) {
    		System.out.println(elem);
    	}
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
    	long time = System.nanoTime();
    	for (int i = 1; i <= 100_000; i++) {
            set.add(i);
        }
    	time = System.nanoTime() - time;
    	System.out.println("Time for inserting new elements in array > "+time);
    	
        time = System.nanoTime();
    	for (int i = 1; i <= 100_000; i++) {
            list.add(i);
        }
    	time = System.nanoTime() - time;
    	System.out.println("Time for inserting new elements in a linkedList > "+time);
    	
    	/*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
    	long time2 = System.nanoTime();
    	int var1;
    	for(int i=0; i<10_000; i++) {
    		var1 = set.get(set.size()/2);
    	}
    	time2 = System.nanoTime() - time2;
    	System.out.println("Time to reading in array > "+time2);
        
    	time2 = System.nanoTime();
    	for(int i=0; i<10_000; i++) {
    		var1 = list.get(list.size()/2);
    	}
    	time2 = System.nanoTime() - time2;
    	System.out.println("Time to reading in a linkedList > "+time2);
    	/*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
    	Map<String, Long> map = new HashMap<>();
    	map.put("Africa", (long) 1_110_635_000);
    	map.put("Americas", (long) 972_005_000);
    	map.put("Antarctica", (long) 0);
    	map.put("Asia", (long) 4_298_723_000l);
    	map.put("Europe", (long) 742_452_000);
    	map.put("Oceania", (long) 38_304_000);
    	/*
         * 8) Compute the population of the world
         */
    	long count=0;
    	for(long elem: map.values()) {
    		count+=elem;
    	}
    	System.out.println("Population > " + count);
    }
}
