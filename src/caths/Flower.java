package caths;

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
		
		System.out.println( name +   " of "  + colour + " colour are available only");
		
	}
	public String toString() {
		return name + " " + colour + " " + cost;
	}

	
	
static class Daffodil extends Flower {

	Daffodil(String name, String colour, int cost) {
		super(name, colour, cost);
		System.out.println("Note:");
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
	
	static Collection fill(Collection<Flower> collection) {
		
		collection.add (new Daffodil("Daffodils", "yellow", 20));
		collection.add (new Rose("Roses", "red", 30));
		collection.add (new Chamomile("Chamomiles", "white", 40));
		collection.add (new Cactus("Cactuses", "green", 50));
		return collection;
			
		}
		

	
	public static void main(String [] args) {
		
		
	
		System.out.println(fill (new ArrayList<Flower>()));
		
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



				
				