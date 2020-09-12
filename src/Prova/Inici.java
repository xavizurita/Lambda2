package Prova;
import java.util.*;
import java.util.function.*;

public class Inici {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor =3.1416;
		Fase2 h = m -> {
//			double valor =3.1416;
			System.out.println("Pi es: "+ valor );
		};
		h.getPiValue(valor);
	}
}



