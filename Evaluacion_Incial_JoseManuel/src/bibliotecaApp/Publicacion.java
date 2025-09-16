package bibliotecaApp;

public class Publicacion {
	public String titulo;
	public int anioPublicacion;
	
	public Publicacion(String titulo, int anioPublicacion) {
		this.titulo=titulo;
		this.anioPublicacion=anioPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	@Override
	public String toString() {
		return this.getTitulo() + "-" + this.getAnioPublicacion();
	}

}
