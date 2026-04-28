
public class App {

	void main() {
		List list = new List();
		
		list.addNodo(new Element("Firulais"),new Element("Salchicha"),new Element("Macho"),new Element(21.1),new Element(2020));
		list.addNodo(new Element("Firulais"),new Element("Salchicha"),new Element("Macho"),new Element(21.1),new Element(2021));
		list.addNodo(new Element("Firulais"),new Element("Salchicha"),new Element("Macho"),new Element(21.1),new Element(2024));
		list.addNodo(new Element("Firulais"),new Element("Salchicha"),new Element("Macho"),new Element(21.1),new Element(2022));
		list.addNodo(new Element("Firulais"),new Element("Salchicha"),new Element("Macho"),new Element(21.1),new Element(2021));
		list.addNodo(new Element("Firulais"),new Element("Salchicha"),new Element("Macho"),new Element(21.1),new Element(2029));
		list.addNodo(new Element("Firulais"),new Element("Salchicha"),new Element("Macho"),new Element(21.1),new Element(2030));
		list.addNodo(new Element("Firulais"),new Element("Salchicha"),new Element("Macho"),new Element(21.1),new Element(2040));
		
		list.showList();
	}
}
