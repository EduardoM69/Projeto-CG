package web.modelo;

import java.io.Serializable;

public class SolicitacaoItemPK implements Serializable {

	private Long solicitacao;

	private Long item;

	public SolicitacaoItemPK(Long solicitacao, Long item) {
		super();
		this.solicitacao = solicitacao;
		this.item = item;
	}

	public SolicitacaoItemPK() {
	}

	public Long getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(Long solicitacao) {
		this.solicitacao = solicitacao;
	}

	public Long getItem() {
		return item;
	}

	public void setItem(Long item) {
		this.item = item;
	}

}
