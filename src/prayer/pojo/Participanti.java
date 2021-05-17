package prayer.pojo;

public class Participanti {
	
	private int id;
	private String nume;
	private String prenume;
	private int varsta;
	private String telefon;
	public Participanti(int id, String nume, String prenume, int varsta, String telefon) {
		super();
		this.id = id;
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.telefon = telefon;
	}
	public Participanti() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
}
