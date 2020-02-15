package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;

@WebService
public class EstoqueWS {
	private ItemDao itemDAO = new ItemDao();

//	@WebMethod(operationName = "todosOsItens")
	@ResponseWrapper(localName = "itens")
	@WebResult(name = "item")
	@RequestWrapper(localName = "listaItens")
	public List<Item> getItens(@WebParam(name = "filtros") Filtros filtros) {
		System.out.println("Chamando getItems()");
		List<Filtro> lista = filtros.getLista();
		return itemDAO.todosItens(lista);
	}
}
