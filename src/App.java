import java.util.Scanner;

public class App {

	void main() {
		List list = new List();
		menu(list);
	}

	public void menu(List list) {
		Scanner sc = new Scanner(System.in);
		IO.println("1. Agregar un nueva mascota: ");
		IO.println("2. Buscar por nombre: ");
		IO.println("3. Mostrar todas las mascotas: ");
		IO.println("4. Salir: ");
		int opcion = sc.nextInt();
		sc.nextLine();
		switch (opcion) {
		case 1: {
			IO.println("Ingrese el nombre de la mascota: ");
			String name = sc.nextLine();
			IO.println("Ingrese la raza de la mascota: ");
			String raza = sc.nextLine();
			IO.println("Ingrese el sexo de la mascota: ");
			String sexo = sc.nextLine();
			IO.println("Ingrese el peso de la mascota: ");
			double peso = sc.nextDouble();
			IO.println("Ingrese la fecha de la mascota: ");
			int fecha = sc.nextInt();
			list.addNodo(new Element(name), new Element(raza), new Element(sexo), new Element(peso),
					new Element(fecha));
			menu(list);
			break;
		}
		case 2: {
			IO.println("Ingrese el nombre de la mascota a buscar: ");
			String name = sc.nextLine();
			list.searchName(name);
			menu(list);
			break;
		}
		case 3: {
			IO.println("\n\nMostrando todas las mascotas: ");
			list.showList();
			menu(list);
			break;
		}
		case 4: {
			break;
		}
		}
	}
}
