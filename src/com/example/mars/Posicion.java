package com.example.mars;

public class Posicion 
{
	protected int x;
	protected int y;
	protected String orientacion;
	
	public Posicion()
	{
		this.x=0;
		this.y=0;
		this.orientacion="N";
	}
	
	public Posicion(int x, int y, String orientacion)
	{
		this.x=x;
		this.y=y;
		this.orientacion=orientacion;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getOrientacion() {
		return orientacion;
	}
	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}
}
