package com.demo;


import java.util.List;
import java.util.Vector;
public class ThreadSafeDemo3 implements Runnable {
	 private Vector<String>vector;

	    public ThreadSafeDemo3(Vector<String>vector){
	    	this.vector=vector;
	    }
	    public void run(){
	        while(true){
	            if(vector.size()>0){
	                vector.remove(0);
	                System.out.println("ɾ��һ�����ߴ磺"+vector.size());
	            }
	        }
	    }
}
