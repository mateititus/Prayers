package prayer.pojo;

public class Motive {

	private int id;
	private String motiv;
	private String raspuns;
	private String categorie;

	public Motive(int id, String motiv, String raspuns, String categorie) {
		super();
		this.id = id;
		this.motiv = motiv;
		this.raspuns = raspuns;
		this.categorie = categorie;
	}

	public Motive() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMotiv() {
		return motiv;
	}

	public void setMotiv(String motiv) {
		this.motiv = motiv;
	}

	public String getRaspuns() {
		return raspuns;
	}

	public void setRaspuns(String raspuns) {
		this.raspuns = raspuns;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

}
