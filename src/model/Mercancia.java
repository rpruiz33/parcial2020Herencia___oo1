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
}

public Mercancia(String codMercancia) throws Exception {
	super();
	setCodMercancia(codMercancia);
}

abstract double calcularPrecioFinal();
public boolean equals(String codigo) {
	return  this.codMercancia.equals(codigo);
}
}
