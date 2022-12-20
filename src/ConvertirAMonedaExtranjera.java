import javax.swing.JOptionPane;

public class ConvertirAMonedaExtranjera {
	
	DeseaContinuar continuar = new DeseaContinuar();

	public void ConvertirCLPADolar(double valorRecibido) {
		double monedaDolar = valorRecibido * 0.0011;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirCLPAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido * 0.0011;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro + " Euros", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirCLPALEsterlina(double valorRecibido) {
		double monedaEsterlina = valorRecibido * 0.00093;
		monedaEsterlina = (double) Math.round(monedaEsterlina * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaEsterlina + " Libras Esterlinas", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirCLPAYen(double valorRecibido) {
		double monedaYen = valorRecibido * 0.15;
		monedaYen = (double) Math.round(monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaYen + " Yenes", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirCLPAWon(double valorRecibido) {
		double monedaWon = valorRecibido * 1.48;
		monedaWon= (double) Math.round(monedaWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaWon + " Wones", "Conversión", 1);
		continuar.Continuar();
	}
}
