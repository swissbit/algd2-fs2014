// Created by Luzius on Feb 15, 2014

package ch.fhnw.algd2.lesson1.exercise;

import java.util.EmptyStackException;

/**
 * Exercise 1: Write a stack that implements this interface and test it with TestStack.
 */
public interface IStack {

	/**
	 * Pushes an object o onto the stack.
	 */
	public void push(Object o);
	
	/**
	 * Removes the top element from the stack.
	 * Throws an EmptyStackException if there is no element left.
	 */
	public Object pop() throws EmptyStackException;
	
}
