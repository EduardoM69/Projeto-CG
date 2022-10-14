package web.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@IdClass(SolicitacaoItemPK.class)
public class SolicitacaoItem {

	@Id
	@ManyToOne
	private Solicitacao solicitacao;

	@Id
	@ManyToOne
	private Item item;

	@NotNull
	private int qnt;
	
	public Solicitacao getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(Solicitacao solicitacao) {
		
		this.solicitacao = solicitacao;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

}
