package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaWebService {

	public static void main(String[] args) {
		EstoqueWS estoque = new EstoqueWS();
		String url = "http://localhost:8082/estoquews";
		System.out.println("Rodando o webservice em: " + url + "?wsdl");
		System.setProperty("javax.xml.soap.SAAJMetaFactory", "com.sun.xml.messaging.saaj.soap.SAAJMetaFactoryImpl");
		Endpoint.publish(url, estoque);
	}

}
