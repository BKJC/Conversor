import javax.swing.JOptionPane;

public class FunctionAExtranjero {
	
	ConvertirAMonedaExtranjera monedas = new ConvertirAMonedaExtranjera();
	
	public void ConvertirMonedas(double ValorRecibido){
		
		String tipoDeMoneda = (JOptionPane.showInputDialog(null, "Seleccione Moneda", "Monedas", JOptionPane.PLAIN_MESSAGE,
				null,
				new Object[] { "De Peso Chileno a Dolar", "De Peso Chileno a Euro",
						"De Peso Chileno a Libra Esterlina", "De Peso Chileno a Yen", "De Peso Chileno a Won" },
				"Seleccionar")).toString();
		
		switch (tipoDeMoneda) {
			case "De Peso Chileno a Dolar": 
				monedas.ConvertirCLPADolar(ValorRecibido);
				break;
				
			case "De Peso Chileno a Euro": 
				monedas.ConvertirCLPAEuro(ValorRecibido);
				break;
				
			case "De Peso Chileno a Libra Esterlina": 
				monedas.ConvertirCLPALEsterlina(ValorRecibido);
				break;
				
			case "De Peso Chileno a Yen": 
				monedas.ConvertirCLPAYen(ValorRecibido);
				break;
				
			case "De Peso Chileno a Won": 
				monedas.ConvertirCLPAWon(ValorRecibido);
				break;
		}
	}
}
