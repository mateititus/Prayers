package prayer.pojo;

public class Biserici {

	private int id;
	private String nume;
	private String adresa;
	private String localitate;
	private String telefon;

	public Biserici(int id, String nume, String adresa, String localitate, String telefon) {
		super();
		this.id = id;
		this.nume = nume;
		this.adresa = adresa;
		this.localitate = localitate;
		this.telefon = telefon;
	}

	public Biserici() {
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

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getLocalitate() {
		return localitate;
	}

	public void setLocalitate(String localitate) {
		this.localitate = localitate;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

}
