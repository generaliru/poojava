import java.util.Scanner;

public class Principal {

	int opcion = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta_personal = new CuentaBancaria();
		Scanner in = new Scanner(System.in);
		/*int opcion = 1;
		
		while(opcion != 0) {
			System.out.println("Bienvenido. Elige una de las siguientes opciones"
					+ "\n0. Salir"
					+ "\n1. Retiro"
					+ "\n2. Deposiito"
					+ "\n3. Imprimir saldo"
					+ "\n4. Estado de cuenta"
					+ "\n5. Agregar Beneficiario"
					+ "\nEscribe el numero clave de operacion: ");
			opcion = in.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Ingrese la cantidad que desea retirar");
				float monto = in.nextFloat();
				cuenta_personal.retiro(monto);
				break;
			case 2:
				System.out.println("Ingrese la cantidad que desea depositar");
				float deposito = in.nextFloat();
				cuenta_personal.depositos(deposito);
				break;
			case 3:
				System.out.println("El monto total de su saldo es: " +
						cuenta_personal.consultarSaldo());
				break;
			case 4:
				System.out.println("El nombre del beneficiario es " + cuenta_personal);
				break;
			case 5:
				System.out.println("Ingrese el nombre del beneficiario: ");
				String beneficiario = in.nextLine();
				cuenta_personal.beneficiario = beneficiario;
				break;
			}
			System.out.println("*********************************************");
		}
		in.close();
		*/
		/*
		CuentaBancaria cuenta_papa = new CuentaBancaria();
		
		cuenta_personal.beneficiario = "Uriel German Camacho Ayala";
		System.out.println(cuenta_personal.beneficiario);
		System.out.println("Ingresa un monto para depositar: ");
		float monto = in.nextFloat();
		cuenta_personal.depositos(monto);
		System.out.println("Ingresa un monto para retirar: ");
		monto = in.nextFloat();
		cuenta_personal.retiro(monto);
		cuenta_papa.beneficiario = "German Camacho Rebollo";
		System.out.println("Tu saldo final es: " 
		+ cuenta_personal.consultarSaldo());
		System.out.println(cuenta_papa.beneficiario);
		in.close();
		*/
	}

}


