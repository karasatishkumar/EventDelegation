package org.satish.event;

public class EventDemo {
	public static void main(String[] args) {

		EventManager c = new EventManager();

		// Event Generator is instantiated to generate the events.
		EventGenerator eventGenerator = new EventGenerator(c);
		System.out.println("Event generator started.");

		// Register for MyEvents from c
		// Here the object of MyEventListener is been created, implementing the
		// interface method. Developers are free to user the Adapter class
		// object or use their own implementation class object.
		c.addMyEventListener(new MyEventListener() {
			public void myEventOccurred(MyEvent evt) {
				// MyEvent was fired
				System.out.println("1st Event Fired");
			}
		});
		System.out.println("First event is registered.");

		// Register another event
		c.addMyEventListener(new MyEventListener() {
			public void myEventOccurred(MyEvent evt) {
				// MyEvent was fired
				System.out.println(" 2nd Event Fired");
			}
		});
		System.out.println("Second event is registered.");
	}
}
