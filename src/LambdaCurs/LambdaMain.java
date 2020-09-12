package LambdaCurs;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

import lambdas.AinterfaceLambda;
import lambdas.PruebaNum;

public class LambdaMain {
	
	static List<LambdaNoms> nomsicognoms = new ArrayList<LambdaNoms>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nomsicognoms.add(new LambdaNoms("Joan"));
		nomsicognoms.add(new LambdaNoms("Marta"));
		nomsicognoms.add(new LambdaNoms("Nuria"));
		nomsicognoms.add(new LambdaNoms("Lucia"));
		nomsicognoms.add(new LambdaNoms("Pere"));
		nomsicognoms.add(new LambdaNoms("Arturo"));
		nomsicognoms.add(new LambdaNoms("Andreu"));
		nomsicognoms.add(new LambdaNoms("Noe"));
		nomsicognoms.add(new LambdaNoms("Alfred"));
		nomsicognoms.add(new LambdaNoms("Leo"));
		nomsicognoms.add(new LambdaNoms("Marcial"));
		nomsicognoms.add(new LambdaNoms("Lluc"));
		nomsicognoms.add(new LambdaNoms("Patric"));
		nomsicognoms.add(new LambdaNoms("Clio"));
		nomsicognoms.add(new LambdaNoms("Astrid"));
		nomsicognoms.add(new LambdaNoms("Marga"));
		nomsicognoms.add(new LambdaNoms("Teo"));
		nomsicognoms.add(new LambdaNoms("Ramon"));
		nomsicognoms.add(new LambdaNoms("Julia"));
		nomsicognoms.add(new LambdaNoms("Dani"));
		nomsicognoms.add(new LambdaNoms("Abelardo"));
		nomsicognoms.add(new LambdaNoms("Ave"));
		
		System.out.println("* * * Llista Noms que comença per A o per a de 3 caracters  * * *");
		String lletrastring= JOptionPane.showInputDialog("letra por la que buscar", "a");
		int largo10 = Integer.parseInt(JOptionPane.showInputDialog("largo que tiene que ser", 3));
		String lletraStringMayuscula = lletrastring.toUpperCase();
		String lletraStringMinuscula = lletrastring.toLowerCase();
// ojo aqui ha de ser de 3 exacte, no de mes de 3		
		System.out.println("");
		nomsicognoms.stream().filter(ss-> (ss.getNoms().startsWith(lletraStringMayuscula) 
				|| ss.getNoms().startsWith(lletraStringMinuscula)) 
				&& ss.getNoms().length()==largo10).forEach(System.out:: println);
		
		System.out.println("");
		System.out.println("* * * Noms que tingui la lletra  (o) * * *");
		String LletraBuscar= JOptionPane.showInputDialog("letra que ha de contenir", "o");
		nomsicognoms.stream().filter(p -> p.getNoms().contains(LletraBuscar)).forEach(System.out:: println);			
		
		System.out.println("");
		System.out.println("* * * Noms amb mes de 5 lletres * * *");
		nomsicognoms.stream().filter(p -> (p.getNoms().length()>=5 && p.getNoms().contains(LletraBuscar))).forEach(System.out:: println);
		
		//carrega l'array list de numeros aleatoris    EXERCICI 2 VER 1
		List<Integer> listanumeros = new ArrayList();

		System.out.println("");
		for (int i=0; i<20; i++) {
			listanumeros.add((int)(Math.random()*100));
			int ini1 = listanumeros.get(i);
			ParsImpars operacion = (n1)-> {
				if (n1%2 == 0) {
					System.out.print(" e" + ini1 + ",");
				}else {
					System.out.print(" o" + ini1 + ",");
				}
			};
			operacion.operar(ini1);
		}
		
		//  EXERCICI 2 VER 2		
		System.out.println("");
		listanumeros.stream().filter(x -> x%2==0).forEach(n->System.out.print("e" + n +", "));
		listanumeros.stream().filter(x -> x%2==1).forEach(n->System.out.print("o" + n +", "));
		
//		listanumeros.stream().map(x-> x%2==0 || x%2 == 1).forEach(System.out::print);
	
		List<String> mesos = new ArrayList();
		mesos.add("Gener ");
		mesos.add("Febrer ");
		mesos.add("Març ");
		mesos.add("Abril ");
		mesos.add("Maig ");
		mesos.add("Juny ");
		mesos.add("Juliol ");
		mesos.add("Agost ");
		mesos.add("Setembre ");
		mesos.add("Octubre ");
		mesos.add("Novembre ");
		mesos.add("Desembre ");
		
		System.out.println("");
		System.out.println("");
		mesos.stream().forEach(x-> System.out.print(x));
		
		System.out.println("");
		mesos.stream().forEach(System.out:: print);
	}

}
