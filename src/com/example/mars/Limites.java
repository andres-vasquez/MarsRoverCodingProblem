package com.example.mars;

public class Limites 
{
	protected int limite_x;
	protected int limite_y;
	
	public Limites(int limite_x, int limite_y)
	{
		this.limite_x=limite_x;
		this.limite_y=limite_y;
	}

	public int getLimite_x() {
		return limite_x;
	}

	public void setLimite_x(int limite_x) {
		this.limite_x = limite_x;
	}

	public int getLimite_y() {
		return limite_y;
	}

	public void setLimite_y(int limite_y) {
		this.limite_y = limite_y;
	}
	
}
