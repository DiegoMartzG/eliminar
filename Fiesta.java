package modelo.javabean;

public class Fiesta {
	//esto es declarar constantes 
	// los static  son de la clase
	// son constantes
	// no forma parte de los constructores ya que son estaticos
	public static final double  PRECIO_BOCATA;
	public static final double PRECIO_BEBIDA;
	public static final double PRECIO_INVITADO;
	// AQUI DESIGNAS EL VALOR
	static {
		PRECIO_BOCATA = 4;
		PRECIO_BEBIDA = 2;
		PRECIO_INVITADO = 5;
	}
		
		private String tipo;
		private String direccion;
		private int bocadillos;
		private int bebidas;
		private int invitados;
		private String fecha;
		private String hora;
		
		
		
		public Fiesta(String tipo, String direccion, int bocadillos, int bebidas, int invitados, String fecha,
				String hora) {
			super();
			this.tipo = tipo;
			this.direccion = direccion;
			this.bocadillos = bocadillos;
			this.bebidas = bebidas;
			this.invitados = invitados;
			this.fecha = fecha;
			this.hora = hora;
		}



		public Fiesta() {
			super();
		}



		public String getTipo() {
			return tipo;
		}



		public void setTipo(String tipo) {
			this.tipo = tipo;
		}



		public String getDireccion() {
			return direccion;
		}



		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}



		public int getBocadillos() {
			return bocadillos;
		}



		public void setBocadillos(int bocadillos) {
			this.bocadillos = bocadillos;
		}



		public int getBebidas() {
			return bebidas;
		}



		public void setBebidas(int bebidas) {
			this.bebidas = bebidas;
		}



		public int getInvitados() {
			return invitados;
		}



		public void setInvitados(int invitados) {
			this.invitados = invitados;
		}



		public String getFecha() {
			return fecha;
		}



		public void setFecha(String fecha) {
			this.fecha = fecha;
		}



		public String getHora() {
			return hora;
		}



		public void setHora(String hora) {
			this.hora = hora;
		}



		
		@Override
		public String toString() {
			return "Fiesta [tipo=" + tipo + ", direccion=" + direccion + ", bocadillos=" + bocadillos + ", bebidas="
					+ bebidas + ", invitados=" + invitados + ", fecha=" + fecha + ", hora=" + hora + "]";
		}



		// invitar(): void aumenta 1 en 1
		public  void invitar() {
			invitados ++;
			  
		}
		//invitar(int invitados): void aumentar numero de invitados
		public void invitar ( int invitados) {
			this.invitados+= invitados;
		}
		
		//cancelarInvitacion() void
		public void cancelarInvitacion() {
			invitados --;
			
		}
		
		// cancelarInvitacion (int introducidos)
		public void cancelarInvitacion ( int invitados) {
			this.invitados-= invitados;
		}
		
		// precioFiesta() double -> 5euros/invitado 2euros/bebida 4euros/bocadillos
		public double precioFiesta() {
			return invitados *  PRECIO_INVITADO + 
					bebidas* PRECIO_BEBIDA + 
					bocadillos * PRECIO_BOCATA;
		}
		
}
