package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadMain {

	public static void main(String[] args) {
		Vector<String>vector=new Vector<>(1000);
        for(int cnt=0;cnt<1000;cnt++){
        	vector.add("abc");
        }
        ThreadSafeDemo1 demo1 = new ThreadSafeDemo1(vector);
        ThreadSafeDemo1 demo2 = new ThreadSafeDemo1(vector);
        Thread thread1 = new Thread(demo1,"a");
        Thread thread2 = new Thread(demo2,"b");
        thread1.start();
        thread2.start();
	}
	}
      
        //�ڶ�������ʾʾ��
//        List<String> list = new ArrayList<>();
//		Vector<String>vector=new Vector<>();
//        ThreadSafeDemo2 demo1 = new ThreadSafeDemo2(vector);
//        ThreadSafeDemo2 demo2 = new ThreadSafeDemo2(vector);
//        ThreadSafeDemo2 demo3 = new ThreadSafeDemo2(vector);
//        ThreadSafeDemo2 demo4 = new ThreadSafeDemo2(vector);
//        ThreadSafeDemo2 demo5 = new ThreadSafeDemo2(vector);
//        ThreadSafeDemo2 demo6 = new ThreadSafeDemo2(vector);
//        ThreadSafeDemo2 demo7 = new ThreadSafeDemo2(vector);
//        ThreadSafeDemo2 demo8 = new ThreadSafeDemo2(vector);
//        ThreadSafeDemo2 demo9 = new ThreadSafeDemo2(vector);
//        ThreadSafeDemo3 demo10 = new ThreadSafeDemo3(vector);
//        new Thread(demo1).start();
//        new Thread(demo2).start();
//        new Thread(demo3).start();
//        new Thread(demo4).start();
//        new Thread(demo5).start();
//        new Thread(demo6).start();
//        new Thread(demo7).start();
//        new Thread(demo8).start();
//        new Thread(demo9).start();
//        new Thread(demo10).start();
//        }
//	}

	//}