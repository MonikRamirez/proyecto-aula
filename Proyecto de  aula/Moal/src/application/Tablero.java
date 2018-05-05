package application;

public class Tablero {
	private final int largoImagenes = 40;
	private final int AltoImagenes = 40;

	public String tableroActual[][] = {
			{ "", "", "", "", "", "", "", "", "", "", "", "", "", "P", "" },
			{ "", "", "", "B", "B", "B", "B", "", "B", "B", "B", "B", "B", "", "" },
			{ "B", "", "", "M", "M", "M", "M", "", "M", "M", "M", "M", "M", "M", "M" },
			{ "M", "", "", "", "", "", "", "", "", "", "", "", "", "", "" },
			{ "B", "B", "B", "", "", "", "", "", "", "B", "B", "B", "", "", "" },

			{ "M", "M", "M", "", "", "", "", "B", "B", "M", "M", "M", "", "", "" },
			{ "", "", "B", "B", "B", "B", "", "M", "M", "", "", "", "", "", "" },
			{ "", "", "M", "M", "M", "M", "", "", "", "", "", "", "B", "", "" },
			{ "", "", "", "", "", "", "", "", "", "", "B", "", "C", "M", "M" },
			{ "", "", "", "", "", "", "", "", "B", "", "C", "", "C", "", "" },

			{ "", "", "", "", "", "", "B", "", "C", "", "C", "", "C", "", "" },
			{ "", "", "", "", "B", "", "C", "", "C", "", "C", "", "C", "", "" },
			{ "", "", "B", "T", "C", "T", "C", "T", "C", "T", "C", "T", "C", "T", "T" },
			{ "", "", "C", "H", "C", "H", "C", "H", "C", "H", "C", "H", "C", "H", "H" },
			{ "M", "M", "M", "M", "M", "M", "M", "M", "M", "M", "M", "M", "M", "M", "M" }, };

	public int DevolverLargoImagenes() {
		return largoImagenes;
		
	}

	
	public int DevolverAlturaImagenes() {
		return AltoImagenes;
	}

	public int DevolverCantidadFilasTablero() {
		return tableroActual.length;
	}

	public int DevolverCantidadColumnasTablero() {
		return tableroActual[0].length;
	}

	public String DevolverCodigoImagenMatriz(int fila, int columna) {
		return tableroActual[fila][columna];
	}
}