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
	
	public Disco(Double radioInterior, Double radioExterior){
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
		this.perimetroInterior = perimetroInterior;
		this.perimetroExterior = perimetroExterior;
		this.superficie = superficie;
		// perimetroInterior = 2*Math.Pi*radioInterior;
		// perimetroExterior = 2*Math.Pi*radioExterior;
		// superficie = (Math.PI * (radioExterior^2 - radioInterior^2));
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

	public Double getPerimetroInterior() {
		return perimetroInterior;
	}

	public void setPerimetroInterior(Double perimetroInterior) {
		this.perimetroInterior = perimetroInterior;
	}

	public Double getPerimetroExterior() {
		return perimetroExterior;
	}

	public void setPerimetroExterior(Double perimetroExterior) {
		this.perimetroExterior = perimetroExterior;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}
	
	public Double perimetroInterior() {
		this.perimetroInterior = 2*Math.PI*this.radioInterior;
		return this.perimetroInterior;
	}
	
	public Double perimetroExterior() {
		this.perimetroExterior = 2*Math.PI*this.radioExterior;
		return this.perimetroExterior;
	}
	
	public Double superficie() {
		this.superficie = Math.PI*(this.radioExterior*2 - this.radioInterior*2);
		return this.superficie;
	}
	
}
