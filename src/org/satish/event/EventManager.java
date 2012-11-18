package org.satish.event;

import java.util.ArrayList;
import java.util.List;

//Add the event registration and notification code to a class. 
public class EventManager {
	// Create the listener list
	protected List<MyEventListener> listenerList = new ArrayList<MyEventListener>();

	// This methods allows classes to register for MyEvents
	public void addMyEventListener(MyEventListener listener) {
		listenerList.add(listener);
	}

	// This methods allows classes to unregister for MyEvents
	public void removeMyEventListener(MyEventListener listener) {
		listenerList.remove(listener);
	}

	// This method is used to fire MyEvents
	void fireMyEvent(MyEvent evt) {
		System.out.println("Got the event." + listenerList.size());
		// Iterate the Listener list to fire the implemented method of each
		// listener.
		for (MyEventListener myEventListener : listenerList) {
			System.out
					.println("Firing listener method for each of the listener.");
			myEventListener.myEventOccurred(evt);
		}
	}
}