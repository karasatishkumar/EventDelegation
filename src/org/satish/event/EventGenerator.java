package org.satish.event;

public class EventGenerator implements Runnable{
	
	Thread t;
	EventManager c;
	public EventGenerator(EventManager c) {
		// TODO Auto-generated constructor stub
		this.c = c;
		t =  new Thread(this, "Event Generator");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Event generator in the run method.");
		while(true){
			System.out.println("Generate a event.");
			c.fireMyEvent(new MyEvent(this));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
