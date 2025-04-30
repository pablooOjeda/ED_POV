package examenRecu_entornos;

public class Persona_POV {
	private int id;
	public Persona_POV(int id, int nombre, double masa, double altura, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.masa = masa;
		this.altura = altura;
		this.edad = edad;
	}
	public Persona_POV(int id2, String string, int masa2, double altura2, int edad2) {
		// TODO Auto-generated constructor stub
	}
	private int nombre;
	@Override
	public String toString() {
		return "Persona_POV [id=" + id + ", nombre=" + nombre + ", masa=" + masa + ", altura=" + altura + ", edad="
				+ edad + "]";
	}
	private double masa;
	private double altura;
	private int edad;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getMasa() {
		return masa;
	}
	public void setMasa(double masa) {
		this.masa = masa;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
