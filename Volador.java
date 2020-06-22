package zoo;

public class Volador extends Animal {
	private boolean canfly = true;
	public Volador(double weight, float height, String name, String color) {
		super(weight, height, name, color); 
		
	}
	public Volador() {
		// TODO Auto-generated constructor stub
	}
	@Override 
	public void makeSound() {
	    System.out.println("Flying animal sound....");
	  }
	public void fly() {
		System.out.println("flying...");
	}
	public String toString() {
		return "\n\nAnimal Volador" + super.toString();
	}
}
