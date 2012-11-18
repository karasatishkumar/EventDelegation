package org.satish.event;

import java.util.EventObject;

//Declare the event. It must extend EventObject. 
public class MyEvent extends EventObject {
	public MyEvent(Object source) {
		super(source);
	}
}
