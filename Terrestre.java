package zoo;

public class Terrestre extends Animal{
	private boolean cantfly = true;
	public Terrestre(double weight, float height, String name, String color) {
		super(weight, height, name, color);
	}
	public Terrestre() {
		super();
	}
	@Override 
	public void makeSound() {
	    System.out.println("Ground animal sound...");
	}
	public String toString() {
		return "\n\nAnimal terrestre" + super.toString();
		};
	  }


