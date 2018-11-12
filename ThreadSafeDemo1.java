
package com.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class ThreadSafeDemo1 implements Runnable{
	private Vector<String>vector;
	public ThreadSafeDemo1(Vector<String>vector){
		this.vector=vector;
	}
	public void run(){
		java.util.Random random=new Random();
		System.out.println("线程:"+random.nextInt());
		synchronized(vector){
			Iterator<String>iterator=vector.iterator();
			int cnt=0;
			while(iterator.hasNext()){
				iterator.next();
				iterator.remove();
				cnt++;
				try{
					java.util.concurrent.TimeUnit.MILLISECONDS.sleep(10);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			System.out.println("移除的元素："+cnt);
		}
		
	}
}