import javax.swing.JOptionPane;

public class ConvertirAMonedadLocal {
	
	DeseaContinuar continuar = new DeseaContinuar();
	
	public void ConvertirDolarACLP(double valorRecibido) {
		double monedaLocal = valorRecibido * 884.96;
		monedaLocal = (double) Math.round(monedaLocal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaLocal + " Pesos Chilenos", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirEuroACLP(double valorRecibido) {
		double monedaLocal = valorRecibido * 938.55;
		monedaLocal = (double) Math.round(monedaLocal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaLocal + " Pesos Chilenos", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirLEsterlinaACLP(double valorRecibido) {
		double monedaLocal = valorRecibido * 1078.53;
		monedaLocal = (double) Math.round(monedaLocal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaLocal + " Pesos Chilenos", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirYenACLP(double valorRecibido) {
		double monedaLocal = valorRecibido * 6.47;
		monedaLocal = (double) Math.round(monedaLocal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaLocal + " Pesos Chilenos", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirWonACLP(double valorRecibido) {
		double monedaLocal = valorRecibido * 0.68;
		monedaLocal = (double) Math.round(monedaLocal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaLocal + " Pesos Chilenos", "Conversión", 1);
		continuar.Continuar();
	}
}
