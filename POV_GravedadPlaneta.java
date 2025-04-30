package examenRecu_entornos;

public class POV_GravedadPlaneta {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getGravedadPlaneta() {
		return GravedadPlaneta;
	}

	public void setGravedadPlaneta(double gravedadPlaneta) {
		GravedadPlaneta = gravedadPlaneta;
	}
	
	public POV_GravedadPlaneta(int id, String nombre, double gravedadPlaneta) {
		super();
		this.id = id;
		this.nombre = nombre;
		GravedadPlaneta = gravedadPlaneta;
	}
	@Override
	public String toString() {
		return "POV_GravedadPlaneta [id=" + id + ", nombre=" + nombre + ", GravedadPlaneta=" + GravedadPlaneta + "]";
	}
	private int id;
	private String nombre;
	private double GravedadPlaneta;
	
	public static void main(String[] args) {
		 

	}

}
