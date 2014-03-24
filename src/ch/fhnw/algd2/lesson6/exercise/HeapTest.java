// Created by Luzius on 24.03.2014

package ch.fhnw.algd2.lesson6.exercise;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class HeapTest {

	private ArrayList<IHeap> lists;

	@Before
	public void setUp() throws Exception {
		lists = new ArrayList<>();

		// add your own implementation here
		// lists.add(new ch.fhnw.algd2.luzius.Heap("first"));
	}

	@Test
	public void test1(){
		for (IHeap heap: lists){
			HeapFeeder feeder1 = new HeapFeeder(heap);
			HeapFeeder feeder2 = new HeapFeeder(heap);
			HeapFeeder feeder3 = new HeapFeeder(heap);
			feeder1.start();
			feeder2.start();
			feeder3.start();
			for (int i=0; i<HeapFeeder.ITERATIONS; i++){
				heap.poll();
			}
		}
	}
	
	@Test
	public void test2(){
		for (IHeap heap: lists){
			HeapFeeder feeder = new HeapFeeder(heap);
			feeder.run();
			String latest = heap.poll();
			while (heap.peek() != null){
				String next = heap.poll();
				assert latest.compareTo(next) <= 0;
				latest = next;
			}
		}
	}
	
}