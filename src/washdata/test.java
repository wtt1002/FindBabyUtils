package washdata;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class test {

	public static void main(String[] args) {
		ExecutorService pool1 = Executors.newFixedThreadPool(5);
		Executors.newCachedThreadPool();
		ExecutorService pool2 = Executors.newScheduledThreadPool(5);
		((ScheduledExecutorService) pool2).schedule(new Runnable() {
			   public void run() {
			    System.out.println("delay 3 seconds");
			   }
			  }, 3, TimeUnit.SECONDS);
	}
}
