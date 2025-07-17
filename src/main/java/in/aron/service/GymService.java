package in.aron.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

@Service
public class GymService {
	private final AtomicInteger count = new AtomicInteger(0);
	
	public void entry() {
		count.incrementAndGet();
	}
	
	public void exit() {
		int current = count.get();
		if(current > 0) {
			count.decrementAndGet();
		}
	}
	
	public int getCount() {
		return count.get();
	}
}
