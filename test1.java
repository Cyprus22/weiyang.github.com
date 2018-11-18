package wy;

import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class test1 {
	public static void main(String[] args) throws Exception
	{
		
		WatchService watchService=FileSystems.getDefault().newWatchService();
		Paths.get("D://show").register(watchService, 
				StandardWatchEventKinds.ENTRY_CREATE,
				StandardWatchEventKinds.ENTRY_DELETE,
				StandardWatchEventKinds.ENTRY_MODIFY);
		while(true)
		{
			WatchKey key=watchService.take();//尝试获取下一个变化信息的监控池，如果没有变化则一直等待
			for(WatchEvent<?> event:key.pollEvents())
			{ 
				System.out.println(event.context()+"发生了"+event.kind()+"事件");//context返回具体的文件类型或者路径
			}                                                                //kind返回事件类型
			if(!key.reset())//重启该线程
			{
				break;
			}
		}
	}
}

