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
			vector.add("��Ȩ");
			System.out.println("��ӳߴ磺"+vector.size());
			}
	}
}
