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
	                System.out.println("删除一个最后尺寸："+vector.size());
	            }
	        }
	    }
}
