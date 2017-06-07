package mvc;

public class CalculoIMCModel {
	
	
	private float altura;
	private float peso;


	public CalculoIMCModel(float altura, float peso) {
		this.altura = altura;
		this.peso   = peso;
	}
	
	public float imc (){
		return peso/(altura*altura);
	}
	
	public String resultado(){
		if (imc() < 18.5)
			return "Voce esta magro";
		else if (imc() >= 18.5 && imc() < 24.9)
			return "Voce esta normal";
		else if (imc() >= 25 && imc() < 29.9)
			return "Voce esta com sobre peso";
		else if (imc() >= 30 && imc() < 39.9)
			return "Voce esta com obesidade";
		else if (imc() > 40)
			return "Voce esta com obesidade grave";
		else
			return "?";
	}


}
