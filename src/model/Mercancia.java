package model;

public abstract class Mercancia {
protected String codMercancia;

public String getCodMercancia() {
	return codMercancia;
}

public void setCodMercancia(String codMercancia) throws Exception {
	 if(codMercancia.length()!=7) {
			throw new Exception("tiene diferente de 7");
	 }
	 this.codMercancia=codMercancia;
			 
}

public Mercancia(String codMercancia) throws Exception {
	super();
	setCodMercancia(codMercancia);
}

public abstract double calcularPrecioFinal();

}
