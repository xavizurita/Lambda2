package LambdaCurs;

public class LambdaNoms {
	private String noms;
	
	public LambdaNoms() {
		
	}

	public LambdaNoms(String noms) {
		super();
		this.noms = noms;
	}

	public String getNoms() {
		return noms;
	}

	public void setNoms(String noms) {
		this.noms = noms;
	}

	@Override
	public String toString() {
		return "nom: " + noms;
	}
	
	
}
