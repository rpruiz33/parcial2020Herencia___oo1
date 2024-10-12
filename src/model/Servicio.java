package model;

public class Servicio extends Mercancia {
private String servicio;
private double presupuesto;
private double porcentajeDescuento;
private boolean enPromocion;
public String getServicio() {
	return servicio;
}
public void setServicio(String servicio) {
	this.servicio = servicio;
}
public double getPresupuesto() {
	return presupuesto;
}
public void setPresupuesto(double presupuesto) {
	this.presupuesto = presupuesto;
}
public double getPorcentajeDescuento() {
	return porcentajeDescuento;
}
public void setPorcentajeDescuento(double porcentajeDescuento) {
	this.porcentajeDescuento = porcentajeDescuento;
}
public boolean isEnPromocion() {
	return enPromocion;
}
public void setEnPromocion(boolean enPromocion) {
	this.enPromocion = enPromocion;
}
public Servicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento,
		boolean enPromocion) throws Exception {
	super(codMercancia);
	this.servicio = servicio;
	this.presupuesto = presupuesto;
	this.porcentajeDescuento = porcentajeDescuento;
	this.enPromocion = enPromocion;
}

public double calcularPrecioFinal() {
double finalP=0;
if(enPromocion) {
	finalP=presupuesto*porcentajeDescuento;
	
}
return finalP;
}


}
