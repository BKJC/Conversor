import javax.swing.JOptionPane;

public class FunctionTemperaturas {
	
	ConvertidorDeTemperaturas temperatura = new ConvertidorDeTemperaturas();	
	public void ConvertirTemperaturas(double ValorRecibido) {
		
		String tipoDeTemperaturas = (JOptionPane.showInputDialog(null, "Seleccione la Temperatura", "Temperaturas", 									JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Seleccione", "De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit"}, "Seleccionar")).toString();
		
		switch(tipoDeTemperaturas) {
			case "De Celsius a Fahrenheit":
				temperatura.ConvertirCelsiusAFahrenheit(ValorRecibido);
				break;
				
			case "De Celsius a Kelvin":
				temperatura.ConvertirCelsiusAKelvin(ValorRecibido);
				break;
				
			case "De Fahrenheit a Celsius":
				temperatura.ConvertirFahrenheitACelsius(ValorRecibido);
				break;
				
			case "De Fahrenheit a Kelvin":
				temperatura.ConvertirFahrenheitAKelvin(ValorRecibido);
				break;
				
			case "De Kelvin a Celsius":
				temperatura.ConvertirKelvinACelsius(ValorRecibido);
				break;
				
			case "De Kelvin a Fahrenheit":
				temperatura.ConvertirKelvinAFahrenheit(ValorRecibido);
				break;
			
		}
	}
}
