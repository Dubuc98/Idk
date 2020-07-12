package Stuff;

public class animales {
	private double peso;
	private double altura;
	private String color;
	private String name;
	private String tipo;
	private int idanimal;
	
	public animales(int idanimal,String name,String color, String tipo, double peso, double altura  ) {
		this.color = color;
		this.altura = altura;
		this.peso = peso;
		this.name = name;
		this.tipo = tipo;
		this.idanimal = idanimal;
	}
	public animales() {
		// TODO Auto-generated constructor stub
	}
	public String getname() {
		return name;
	}
    public void setname(String name) {
    	this.name = name;
    }
    public double getpeso() {
		return peso;
    }
    public void setpeso(double weight) {
		this.peso = weight;
    }
    public double getaltura() {
		return altura;
	}
	public void setHeight(float height ) {
			this.altura = height;
	}
    public String getcolor() {
    	return color;
    }
	public void  setcolor(String color) {
    	this.color = color;
    }
	public String gettipo() {
		return tipo;
	}
	public int getid() {
		return idanimal;
	}
	
}
