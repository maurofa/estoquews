package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;

@WebService
public class EstoqueWS {
	private ItemDao itemDAO = new ItemDao();

	public List<Item> getItens() {
		System.out.println("Chamando getItems()");
		return itemDAO.todosItens();
	}
}
