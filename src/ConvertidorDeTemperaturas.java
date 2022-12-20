import javax.swing.JOptionPane;

public class ConvertidorDeTemperaturas {
	
	DeseaContinuar continuar = new DeseaContinuar();
	
	public void ConvertirCelsiusAFahrenheit(double valorRecibido) {
		double fahrenheit = valorRecibido * 1.8 + 32;
		fahrenheit = (double) Math.round(fahrenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, "Serían "+fahrenheit+"°F", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirCelsiusAKelvin(double valorRecibido) {
		double kelvin = valorRecibido + 273.15;
		kelvin = (double) Math.round(kelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, "Serían "+kelvin+"K", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirFahrenheitACelsius(double valorRecibido) {
		double celsius = (valorRecibido - 32) / 1.8;
		celsius = (double) Math.round(celsius * 100d)/100;
		JOptionPane.showMessageDialog(null, "Serían "+celsius+"°C", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirFahrenheitAKelvin(double valorRecibido) {
		double kelvinG = (5 / 9) * (valorRecibido - 32) + 273.15;
		kelvinG = (double) Math.round(kelvinG * 100d)/100;
		JOptionPane.showMessageDialog(null, "Serían "+kelvinG+"K", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirKelvinACelsius(double valorRecibido) {
		double celsius = valorRecibido - 273.15;
		celsius = (double) Math.round(celsius * 100d)/100;
		JOptionPane.showMessageDialog(null, "Serían "+celsius+"°C", "Conversión", 1);
		continuar.Continuar();
	}
	
	public void ConvertirKelvinAFahrenheit(double valorRecibido) {
		double fahrenheit = 1.8 * (valorRecibido - 273.15) + 32;
		fahrenheit = (double) Math.round(fahrenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, "Serían "+fahrenheit+"°F", "Conversión", 1);
		continuar.Continuar();
	}
}
