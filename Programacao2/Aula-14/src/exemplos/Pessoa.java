package exemplos;

public class Pessoa {
	
	private int id;
	private String name;
		
	public Pessoa(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public int compareTo(Pessoa o) {
//		if (this.id < o.id)
	//		return -1;
		//else if (this.id > o.id)
			//return 1;
		//return 0;
	//}
}
