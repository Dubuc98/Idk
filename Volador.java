package zoo;

public class Volador extends Animal {

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
	public String toString() {
		return "\n\nAnimal Volador" + super.toString();
	}
}
