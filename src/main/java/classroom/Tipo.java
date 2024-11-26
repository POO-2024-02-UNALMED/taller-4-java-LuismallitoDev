package classroom;

public enum Tipo {
	DISCIPLINAR(10, "Disciplinar"),
	FUNDAMENTACION(20, "Fundamentación"),
	ELECTIVA(30, "Electiva");
	
	private int codigo;
	private String nombre;

	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	//Getters para poder acceder a los valores de instancia y no crearlos por que sí
    public int getCodigo() {
        return codigo;
    }
	public String getNombre() {
        return nombre;
    }
}
