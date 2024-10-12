package model;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
private List<Mercancia> lstMercancia;

public List<Mercancia> getLstMenrcancia() {
	return lstMercancia;
}

public void setLstMenrcancia(List<Mercancia> lstMenrcancia) {
	this.lstMercancia = lstMenrcancia;
}

public Sistema() {
	super();
	this.lstMercancia = new ArrayList <Mercancia>();
}
public Mercancia traerMercancia(String CodMercancia) {
	Mercancia merca=null;
	int i=0;
	while(i<lstMercancia.size() && merca==null) {
		if(lstMercancia.get(i).getCodMercancia().equalsIgnoreCase(CodMercancia)) {
			merca=lstMercancia.get(i);
		}
	}
	return merca;
}
public List <Mercancia> traerMercancia(boolean enOferta) {
	List<Mercancia> mercancias=new ArrayList<Mercancia>();
	for (int i=0; i<lstMercancia.size();i++) {

			if(((Servicio)lstMercancia.get(i)).isEnPromocion()) {
				mercancias.add(lstMercancia.get(i));
			}
			if(((Producto)lstMercancia.get(i)).isEsDescuentoEn2daUnidad()) {
				mercancias.add(lstMercancia.get(i));
			}
		}
	return mercancias;
	}
	
public boolean agregarProducto(String codMercancia, String producto, double precioProducto, double porcentajeDescuento, 
		boolean esDescuentoEn2daUnidad) throws Exception {
	boolean flag=false;
	List<Mercancia> mercancia=new ArrayList<Mercancia>();
	mercancia= traerMercancia(esDescuentoEn2daUnidad);

	if(mercancia==null) {
		lstMercancia.add( new Producto(codMercancia, producto,  precioProducto,  porcentajeDescuento,esDescuentoEn2daUnidad));
		flag=true;
		}
	
	flag=true;
	return flag;
}

public boolean agregarServicio(String codMercancia, String servicio, double presupuesto, double porcentajeDescuento, boolean enPromocion) throws Exception {
	boolean flag=false;
	Mercancia mercancia=null;
	mercancia=traerMercancia(codMercancia);
	if(mercancia==null) {
		lstMercancia.add( new Servicio(codMercancia, servicio, presupuesto, porcentajeDescuento, enPromocion));
		flag=true;
		}
	else {
		throw new Exception("YA EXISTE");
	}
	
	flag=true;
	return flag;
	}
	

}
