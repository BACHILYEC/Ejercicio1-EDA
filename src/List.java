
public class List {

	Nodo head = null;
	Nodo tail = null;

	public boolean isEmpty() {
		return head == null;
	}

	public void addNodoTail(Element name, Element raza, Element sexo, Element peso, Element fecha) {
		if (isEmpty()) {
			head = new Nodo(name, raza, sexo, peso, fecha);
			tail = head;
		} else {
			tail.next = new Nodo(name, raza, sexo, peso, fecha);
			tail = tail.next;
		}
	}

	public void addNodoHead(Element name, Element raza, Element sexo, Element peso, Element fecha) {
		if (isEmpty()) {
			head = new Nodo(name, raza, sexo, peso, fecha);
			tail = head;
		} else {
			head = new Nodo(name, raza, sexo, peso, fecha, head);
		}
	}

	public void addNodo(Element name, Element raza, Element sexo, Element peso, Element fecha) {
		if (isEmpty()) {
			addNodoTail(name, raza, sexo, peso, fecha);
		} else if (head == tail) {
			if (head.fecha.number >= fecha.number) {
				addNodoHead(name, raza, sexo, peso, fecha);
				return;
			} else {
				addNodoTail(name, raza, sexo, peso, fecha);
				return;
			}
		} else if (fecha.number >= tail.fecha.number) {
			addNodoTail(name, raza, sexo, peso, fecha);
			return;
		} else {
			Nodo temp = head;
			Nodo tempnext = head.next;
			while (tempnext != null) {
				if (tempnext.fecha.number > fecha.number) {
					if (temp == head) {
						addNodoHead(name, raza, sexo, peso, fecha);
						return;
					} else if (tempnext == tail) {
						temp.next = new Nodo(name, raza, sexo, peso, fecha, tail);
						return;
					} else {
						temp.next = new Nodo(name, raza, sexo, peso, fecha, tempnext);
						return;
					}
				} else {
					temp = tempnext;
					tempnext = tempnext.next;
				}

			}

		}
	}

	public void showList() {
		if (isEmpty()) {
			IO.println("No hay nada en la lista  ");
		} else {
			Nodo temp = head;
			while (temp != null) {
				IO.println("Nombre: " + temp.name.text + "\nRaza: " + temp.raza.text + "\nSexo: " + temp.sexo.text
						+ "\nPeso: " + temp.peso.number_double + "\nFecha: " + temp.fecha.number + "\n\n");
				temp = temp.next;
			}
		}
	}
}
