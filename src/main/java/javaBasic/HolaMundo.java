package javaBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HolaMundo {
	
	int sumatoria =10;
		
public static void main(String[] args) {
	System.out.println("Hola Mundo");
	System.out.print("Hola");	
}//end main

@Test(priority=2)
public void showConsole() {
	System.out.println("Hola Mundo TestNG");
	Reporter.log("Hola mundo", true);
	sumatoria = sumatoria +1; 
	Reporter.log("La sumatoria es: "+ sumatoria,true);
}// end showConsol

@Test(priority=1)
public void typeOfVariables() {
	int numero1 = 10;
	char letra = 's';
	float numeroDecimal = 10.5f;
	double numeroGrande = 10.23142124;
	boolean flag = true; 
	String nombre = "Lourdes";
	Boolean flag2=false;
	Double nombreGrande2 = 10023.123123;
		int numero2;
		Reporter.log("El valor de la variable: " + numero1,true);
		sumatoria = numero1 + sumatoria;
		Reporter.log(" El valor de la sumatoria: "+sumatoria,true);
		}

@Test(priority=3)
public void sumatoriaDeDosNumeros() {
int numero1 = 10;
int numero2 = 99;
double resultado=0;

resultado = numero1 + numero2; 
Reporter.log("El resultado de la suma es: "+resultado,true);

resultado = numero1 - numero2;
Reporter.log("El resultado de la resta es: "+resultado,true);

resultado = numero1 * numero2;
Reporter.log("El resultado de la Multiplicacion es: "+resultado,true);

resultado = numero1 / numero2;
Reporter.log("El resultado de la division es: "+resultado,true);

resultado = numero1 % numero2;
Reporter.log("El resultado del residuo es: "+resultado,true);
}

}//end class
