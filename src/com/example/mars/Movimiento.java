package com.example.mars;

public class Movimiento 
{
	protected Limites limites;

	public Posicion Mover(Posicion robot, Limites marco)
	{
		this.limites=marco;
		switch(robot.getOrientacion())
		{
		case "N": 
			if(limitey(robot.getY()+1)==true) 
				robot.setY(robot.getY()+1); 
			break;
		case "S": 
			if(limitey(robot.getY()-1)==true) 
				robot.setY(robot.getY()-1);
			break;
		case "E":
			if(limitex(robot.getX()+1)==true)
				robot.setX(robot.getX()+1); 
			break;
		case "O": 
			if(limitex(robot.getX()-1)==true)
				robot.setX(robot.getX()-1); 
			break;
		}
		return robot;
	}

	private boolean limitey(int y)
	{
		if(0<=y  && y<=limites.getLimite_y())
			return true;
		else
			return false;
	}

	private boolean limitex(int x)
	{
		if(0<=x  && x<=limites.getLimite_x())
			return true;
		else
			return false;
	}
}
