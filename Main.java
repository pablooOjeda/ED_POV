package examenRecu_entornos;

public class Main {

	public static void main(String[] args) {
		//Instanciamos dos objetos de la clase persona
		Persona_POV per1 = new Persona_POV(1, "Jose", 85, 1.75, 22 );
		Persona_POV per2 = new Persona_POV(2, "Pablo", 60, 1.65, 24 );
		//Instanciamos tres objetos de la clase GravedadPlanetaria
		POV_GravedadPlaneta pla1 = new POV_GravedadPlaneta(1, "Tierra", 9.81);
		POV_GravedadPlaneta pla2 = new POV_GravedadPlaneta(2, "Marte", 3.72);
		POV_GravedadPlaneta pla3 = new POV_GravedadPlaneta(3, "Jupiter", 24.79);
		//Calcular peso por persona en tierra
		double masaPersona = per1.getMasa();
		double gravedadTierra = pla1.getGravedadPlaneta();
		double pesoTierra = masaPersona*gravedadTierra;
		
		//Calculo peso por persona en marte
		double masaPersona2 = per1.getMasa();
		double gravedadMarte = pla1.getGravedadPlaneta();
		double pesoMarte = masaPersona*gravedadMarte;
		
		//Calculo peso por persona en jupiter
				double masaPersona3 = per1.getMasa();
				double gravedadJupiter = pla1.getGravedadPlaneta();
				double pesoJupiter = masaPersona*gravedadJupiter;
		//Mostrar informacion
		extracted(per1, per2, pla1, pla2, pla3, pesoTierra, pesoMarte, pesoJupiter);
	}

	public static void extracted(Persona_POV per1, Persona_POV per2, POV_GravedadPlaneta pla1, POV_GravedadPlaneta pla2,
			POV_GravedadPlaneta pla3, double pesoTierra, double pesoMarte, double pesoJupiter) {
		System.out.println(per1);
		System.out.println("El IMC de la persona "+per1.getNombre()+" es...");
		System.out.println(per2);
		System.out.println("El IMC de la persona "+per2.getNombre()+" es...");
		System.out.println(pla1);
		System.out.println(pla2);
		System.out.println(pla3);
		System.out.println("Peso "+ per1.getNombre() +"en tierra: "+pesoTierra);
		System.out.println("Peso "+ per1.getNombre() +"en marte: "+pesoMarte);
		System.out.println("Peso "+ per1.getNombre() +"en jupiter: "+pesoJupiter);
	}

}
