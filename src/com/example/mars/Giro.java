package com.example.mars;

public class Giro 
{
	protected Posicion posicion;

	public Giro(Posicion posicion, String direccion)
	{
		this.posicion=posicion;
		if(direccion.compareTo("L")==0)
		{
			giro_izquierda();
		}
		else if(direccion.compareTo("R")==0)
		{
			giro_derecha();
		}
	}

	private void giro_izquierda()
	{
		String orientacion=this.posicion.getOrientacion();
		switch(orientacion)
		{
			case "N": this.posicion.setOrientacion("O"); break;
			case "O": this.posicion.setOrientacion("S"); break;
			case "S": this.posicion.setOrientacion("E"); break;
			case "E": this.posicion.setOrientacion("N"); break;
		}	
	}

	private void giro_derecha()
	{
		String orientacion=this.posicion.getOrientacion();
		switch(orientacion)
		{
			case "N": this.posicion.setOrientacion("E"); break;
			case "O": this.posicion.setOrientacion("N"); break;
			case "S": this.posicion.setOrientacion("O"); break;
			case "E": this.posicion.setOrientacion("S"); break;
		}	
	}
}
