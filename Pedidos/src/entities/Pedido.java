package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private OrdemPedido status;
	private Cliente cliente;

	private List<ItemPedido> item = new ArrayList<>();

	public Pedido() {

	}

	public Pedido(Date momento, OrdemPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemPedido getStatus() {
		return status;
	}

	public void setStatus(OrdemPedido status) {
		this.status = status;
	}

	public List<ItemPedido> getItens() {
		return item;
	}

	public void adicionarItem(ItemPedido itens) {
		item.add(itens);
	}

	public void removerItens(ItemPedido itens) {
		item.remove(itens);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double total() {

		double soma = 0;
		for (ItemPedido c : item) {
			soma += c.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: " );
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido: \n");
		for(ItemPedido c : item) {
			sb.append(c + "\n");
		}
		sb.append("Valor total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
	}

}
