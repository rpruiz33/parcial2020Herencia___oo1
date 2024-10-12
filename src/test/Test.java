package test;

import model.Servicio;
import model.Sistema;
import model.Producto;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema =new Sistema();
		System.out.println("-------------------1---------------");
		try {
			System.out.println(sistema.agregarServicio("897323", "servicio=Mantenimiento maquina de cortar pasto", 2500, 15, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarServicio("8973231", "servicio=Mantenimiento maquina de cortar pasto", 2500, 15, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarProducto("432597","Manguera de desagote lavarropa,", 650, 15, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarProducto("4325971","Manguera de desagote lavarropa,", 650, 15, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------------------2---------------");
	
		System.out.println(((Servicio)sistema.traerMercancia("8973231")).calcularPrecioFinal()); 
		System.out.println(((Producto)sistema.traerMercancia("4325971")).calcularPrecioFinal()); 
		System.out.println("-------------------3---------------");
		
		try {
			System.out.println(sistema.agregarProducto("3892871","Aceite para maquinas", 430, 10, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarServicio("3892815", "Mantenimiento de cortadora de ceped,", 2520,0, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarProducto("9381925","Tambor lavaropa,", 7500, 25, false));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarServicio("3481759", "Mantenimiento estufa", 1250,0, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			System.out.println(sistema.agregarServicio("3892815", "Mantenimiento de cortadora de ceped,", 2520,0, true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarProducto("9381925","Tambor lavaropa,", 7500, 25, false));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-------------------4---------------");
		System.out.println(sistema.traerMercancia(true));
	}
	
	

}
