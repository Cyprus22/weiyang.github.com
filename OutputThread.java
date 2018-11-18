

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * 放水线程
 * Created by captain on 2017/7/27.
 */
public class OutputThread implements Callable<Object>{

    private BlockingQueue<String> queue;

    public OutputThread(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public Object call() throws InterruptedException {
        while(true){
            if(queue.size()==100){
                break;
            }
            for(int cnt=0;cnt<3;cnt++){
                queue.poll(10,TimeUnit.SECONDS);//移除并返问队列头部的元素    如果队列为空，则返回null
            }									//如果在10秒内成功地移除了队列头元素，则立即返回头元素；否则在到达超时时，返回null
            System.out.println("放水3立方米，当前水量："+queue.size());
            TimeUnit.SECONDS.sleep(1);
        }
        return "success";
    }
}
