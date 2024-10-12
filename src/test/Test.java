package test;

import model.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema =new Sistema();
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
		
	}

}
