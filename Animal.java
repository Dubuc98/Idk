package zoo;
public abstract class Animal {
	private double weight;
	private float height;
	private String color;
	private String name;
	
	public Animal(double weight, float height, String name, String color) {
		this.color = color;
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public String getname() {
		return name;
	}
    public void setname(String name) {
    	this.name = name;
    }
    public double getweight() {
		return weight;
    }
    public void setWeight(double weight) {
		this.weight = weight;
    }
    public float getHeight() {
		return height;
	}
	public void setHeight(float height ) {
			this.height = height;
	}
    public String getcolor() {
    	return color;
    }
	public void  setcolor(String color) {
    	this.color = color;
    }
	public String toString() {
		return "\nEs un " + this.getname() + "\nPesa: "+ this.getweight()+"Kg" + "\nMide: "+ this.getHeight() + "Mts" + "\nEs de color: " + this.getcolor();
	}
	public void makeSound() {
	    System.out.println("Regular animal sound....");
	}
}