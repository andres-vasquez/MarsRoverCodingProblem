package com.example.mars;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan;
		try
		{
			scan = new Scanner(new File("src/prueba.txt"));
			scan.useDelimiter(System.getProperty("line.separator")); 
			String[] marco=(scan.next()).split(" ");
			
			
			Limites limites=new Limites(Integer.parseInt(marco[0]), Integer.parseInt(marco[1]));
			while(scan.hasNext())
			{
				String[] coordenadas_robot=(scan.next()).split(" ");
				Posicion robot=new Posicion(Integer.parseInt(coordenadas_robot[0]),Integer.parseInt(coordenadas_robot[1]),coordenadas_robot[2]);
				
				String desplazamiento=scan.next();
				for(int i=0;i<desplazamiento.length();i++)
				{
					String orden=""+desplazamiento.charAt(i);
					if(orden.compareTo("M")!=0)
						new Giro(robot, orden);
					else
					{
						Movimiento mov=new Movimiento();
						mov.Mover(robot,limites);
					}
				}
				System.out.println(robot.x+" "+robot.y+" "+robot.orientacion);
			}
			scan.close();        
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
