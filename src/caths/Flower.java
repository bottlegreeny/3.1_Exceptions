package caths;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;




class Flower {
	String name;
    String colour;
	static int cost;
	static int total;
	
	Flower (String name, String colour, int cost){
		this.name = name;
		this.colour=colour;
		this.cost=cost;
	}
	
	public String getName() {
		return name;
	}
	public String getColour() {
		return colour;
	}
	public int getCost() {
		return cost;
	}
	 
	
	public void print (){
		
		System.out.print("In CuteFlowerStore you will find a ");
		
	}
	
	public void printCharacteristics (){
		
		System.out.println( name +   " of "  + colour + " colour are available only, " + cost + " pounds");
		
	}
	public String toString() {
		return name + " " + colour + " " + cost;
	}

	
	
static class Daffodil extends Flower {

	Daffodil(String name, String colour, int cost) {
		super(name, colour, cost);
		
		total += cost;
	}
	
	 
	
	
}
static class Rose extends Flower {

	Rose(String name, String colour, int cost) {
		super(name, colour, cost);
		total += cost;
	}

}
	
static class Chamomile extends Flower {

	Chamomile(String name, String colour, int cost) {
		super(name, colour, cost);
		total += cost;
	}
		

}
	
static class Cactus extends Flower {

	Cactus(String name, String colour, int cost) {
		super(name, colour, cost);
		total += cost;
	}

}
		

	



public static class Bouquet {


	
	static Collection fill(Collection<Flower> collection) throws TestException {
		
		
		
		try {
			Class.forName("Flower");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException has been detected");
		}
		
		try {
		Collection<Flower> collection2 = null;
		collection2.add	 (new Daffodil("Daffodils", "yellow", 20));	
		} catch (NullPointerException e) {
			System.out.println("NullPointerException has been detected");
		}
		try {
		Collection llist = new LinkedList <Flower>();
		llist.clear();
		((LinkedList<Flower>) llist).getFirst();
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException has been detected");
		}
		
		collection.add (new Daffodil("Daffodils", "yellow", 20));
		collection.add (new Rose("Roses", "red", 30));
		collection.add (new Chamomile("Chamomiles", "white", 40));
		collection.add (new Cactus("Cactuses", "green", 50));
		
		try {
		Flower f = new Flower(null, null, 0);
		int a = f.total/f.cost;
		System.out.println("The average value for roses is: " + a);
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException has been detected");
		}
		try {
			 
           
            File file = new File("R://filetest.txt");
 
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
           System.out.println("FileNotFoundException has been detected");
        }
		
		try {
			throw new Exception ("My exception");
		} catch (Exception e) {
			System.out.println("MyException has been detected");
		}
	
		
		
		
	
		Rose ros = new Rose(null, null, 0);
		
		
		if (ros.name==null) {
			try {
			throw new TestException();
		}catch(TestException e){
				System.out.println("TestException has been detected. Seems that the name for Rose is empty");
		}
		
		}
		
		
		collection.clear();
		System.out.println("Clearing all " + collection);
		collection.remove(2);
		
		
		return collection;
		
			
		}


	
	public static void main(String [] args) throws SimpleException, TestException {
		
        
		InheritingExceptions i = new InheritingExceptions();
		
		try {
	    i.f();
		}catch (SimpleException e){
			
		}
		System.out.println("All the elements have been removed in the previous method " + fill (new ArrayList<Flower>()));
		
		Daffodil dff = new Daffodil("Daffodils", "yellow", 20);
		dff.printCharacteristics();
		
		Rose rs = new Rose("Roses", "red", 30);
		rs.printCharacteristics();
		
		Chamomile ch = new Chamomile("Chamomiles", "white", 40);
		ch.printCharacteristics();
		
		Cactus ct = new Cactus("Cactuses", "green", 50);
		ct.printCharacteristics();
		System.out.println("The total sum of your bouquet is: " + Flower.total + " pounds");
		
	
		
	
	}
  
  }

}

				
				
