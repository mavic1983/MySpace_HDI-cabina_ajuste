package com.myspace.hdi_cabina_ajuste;

import java.util.List;
import com.google.gson.Gson;

@org.kie.api.definition.type.Label("Poliza")
@javax.persistence.Entity
public class Poliza implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Numero")
	private long numero;
	@org.kie.api.definition.type.Label("Vigencia")
	private java.util.Date vigencia;
	@org.kie.api.definition.type.Label("Estatus")
	private java.lang.String estatus;
	@org.kie.api.definition.type.Label("Coberturas")
	private java.util.List<java.lang.String> coberturas;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "POLIZA_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "POLIZA_ID_SEQ", name = "POLIZA_ID_GENERATOR")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label(value = "Número")
	private java.lang.String numeroPoliza;

	public Poliza() {
	}

	public String toString() {
		return String.format("numero:%s,vigencia:%s,estatus:%s,coberturas:%s",
				numeroPoliza, vigencia, estatus, coberturas);
	}
	public long getNumero() {
		return this.numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public java.util.Date getVigencia() {
		return this.vigencia;
	}

	public void setVigencia(java.util.Date vigencia) {
		this.vigencia = vigencia;
	}

	public java.lang.String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(java.lang.String estatus) {
		this.estatus = estatus;
	}

	public java.util.List<java.lang.String> getCoberturas() {
		return this.coberturas;
	}

	public void setCoberturas(java.util.List<java.lang.String> coberturas) {
		this.coberturas = coberturas;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public void fromJSON(Object json) {
		String jsonString = json.toString();
		Poliza poliza = new Gson().fromJson(jsonString, Poliza.class);
		this.numero = poliza.getNumero();
		this.vigencia = poliza.getVigencia();
		this.estatus = poliza.getEstatus();
		this.coberturas = poliza.getCoberturas();
		this.id = getId();
	}

	public java.lang.String getNumeroPoliza() {
		return this.numeroPoliza;
	}

	public void setNumeroPoliza(java.lang.String numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public Poliza(long numero, java.util.Date vigencia,
			java.lang.String estatus,
			java.util.List<java.lang.String> coberturas, java.lang.Long id,
			java.lang.String numeroPoliza) {
		this.numero = numero;
		this.vigencia = vigencia;
		this.estatus = estatus;
		this.coberturas = coberturas;
		this.id = id;
		this.numeroPoliza = numeroPoliza;
	}

}