package ar.edu.unlam.pb2.tp1;

public class Disco {

	// se desea conocer:
	//	• radio interior. 
	//	• radio exterior. 
	//	• perímetro interior. 
	//	• perímetro exterior. 
	//	• superficie.
		
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie; 
	
	public Disco(Double radioInterior, Double radioExterior, 
			Double perimetroInterior, Double perimetroExterio, Double superficie){
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
		this.perimetroInterior = perimetroInterior;
		this.perimetroExterior = perimetroExterior;
		this.superficie = (Math.PI * (radioExterior - radioInterior));
	}
	
}
