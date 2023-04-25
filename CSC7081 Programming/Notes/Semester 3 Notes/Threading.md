There are two ways to create threads:
1. Subclass the Thread class
2. Implement the Runnable interface

## Implementing Runnable
Best way to create user threads.

ImplementingRunnableTest (driver class):
```java
public class ImplementingRunnableTest {
	public static void main(String[] args) {
		// create class with run method
		ImplementingRunnableExample ire = new ImplementingRunnableExample();
		ImplementingRunnableExample thirdThread = new ImplementingRunnableExample();
		
		//pass the run class into Thread class
		Thread newThread = new Thread(ire);
		Thread newThread2 = new Thread(thirdThread);

		//start the thread via the newThread class
		newThread.start();
		do {
			System.out.println("Main thread running away");
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (true);
	}
}
```

ImplementingRunnableExample:
```java
public class ImplementingRunnableExample implements Runnable {
	public ImplementingRunnableExample() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		do {
			System.out.println("Second thread running away");
			try {
				Thread.sleep(new Random().nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (true);
	}
}
```

## Race Conditions, Deadlock and Critical Sections
Two threads can compete for the same resource. We avoid deadlock by **proper thread synchronization in critical sections.**

Mark method blocks needing exclusive lock on resources as synchronized:
```java
public synchronized void deposit(long value) {
	this.balance += value;
}

public synchronized void withdraw(long value) {
	this.balance -= value;
}
```

