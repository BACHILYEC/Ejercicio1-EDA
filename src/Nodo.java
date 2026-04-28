
public class Nodo {

	Element name;
	Element raza;
	Element sexo;
	Element peso;
	Element fecha;
	
	Nodo next;
	
	public Nodo(Element name, Element raza, Element sexo, Element peso, Element fecha) {
		this.name = name;
		this.raza = raza;
		this.sexo = sexo;
		this.peso = peso;
		this.fecha = fecha;
		next=null;
	}
	
	public Nodo(Element name, Element raza, Element sexo, Element peso, Element fecha, Nodo next) {
		this.name = name;
		this.raza = raza;
		this.sexo = sexo;
		this.peso = peso;
		this.fecha = fecha;
		this.next = next;
	}
	
}
