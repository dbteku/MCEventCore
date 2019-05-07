McEventCore
===============================

The purpose of McEventCore is to provide a common simple event mechanism to run on your Minecraft Servers.

The core of this project runs on JavaEvents located in [github](https://github.com/dbteku/JavaEvents).

## Code Examples ##

> **Example Event**

```java
    public class ExampleEvent extends JavaEvent{
    
    	private String someData;
    	
    	public ExampleEvent(String data) {
    		super(ExampleEvent.class.getSimpleName());
    		this.someData = data;
    	}
    
    	public String getSomeData() {
    		return someData;
    	}
    	
    }
```
> **Example Listener Class**

```java
    public class ConcreteClass{
        public ConcreteClass(){
        // Register Listener
            EventManager.getInstance().registerEventListener(ExampleEvent.class, this);
        }
        
        //Add the EventListener annotation
        //Note: It does not matter what the method name is called as long as the first parameter matches the event
        // you subscribed to.
        @EventListener
        void onWhateverEvent(ExampleEvent event){
            System.out.println("Reflective got a call!");
        }
        
    }
```

> **Registering/Throwing Events**

```java
	...
	// Register Event
	EventManager.getInstance().registerEvent(ExampleEvent.class);
	// Throw Event
	EventManager.getInstance().throwEvent(new ExampleEvent());
	// If you throw an event without registering it, listeners will never be notified.
```