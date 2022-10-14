package web.modelo;

import java.io.Serializable;

public class EntradaItemPK implements Serializable {

	private Long responsavel;

	private Long item;

	public EntradaItemPK(Long responsavel, Long item) {
		super();
		this.responsavel = responsavel;
		this.item = item;
	}

	public EntradaItemPK() {
	}

	public Long getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Long responsavel) {
		this.responsavel = responsavel;
	}

	public Long getItem() {
		return item;
	}

	public void setItem(Long item) {
		this.item = item;
	}

}
