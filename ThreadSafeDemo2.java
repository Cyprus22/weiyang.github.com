package com.demo;


import java.util.List;
import java.util.Vector;

public class ThreadSafeDemo2 implements Runnable {
	private Vector<String>vector;
	public ThreadSafeDemo2(Vector<String>vector){
		this.vector=vector;
	}
	public void run(){
		synchronized(vector){
			vector.add("∞Ê»®");
			System.out.println("ÃÌº”≥ﬂ¥Á£∫"+vector.size());
			}
	}
}
