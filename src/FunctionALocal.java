import javax.swing.JOptionPane;

public class FunctionALocal {
	
	ConvertirAMonedadLocal monedas = new ConvertirAMonedadLocal();
	
	public void ConvertirMonedas(double ValorRecibido){
			
			String tipoDeMoneda = (JOptionPane.showInputDialog(null, "Seleccione Moneda", "Monedas", JOptionPane.PLAIN_MESSAGE,
					null,
					new Object[] { "De Dolar a Peso Chileno", "De Euro a Peso Chileno",
							"De Libra Esterlina a Peso Chileno", "De Yen a Peso Chileno", "De Won a Peso Chileno" },
					"Seleccionar")).toString();
			
			switch (tipoDeMoneda) {
				case "De Dolar a Peso Chileno": 
					monedas.ConvertirDolarACLP(ValorRecibido);
					break;
					
				case "De Euro a Peso Chileno": 
					monedas.ConvertirEuroACLP(ValorRecibido);
					break;
					
				case "De Libra Esterlina a Peso Chileno": 
					monedas.ConvertirLEsterlinaACLP(ValorRecibido);
					break;
					
				case "De Yen a Peso Chileno": 
					monedas.ConvertirYenACLP(ValorRecibido);
					break;
					
				case "De Won a Peso Chileno": 
					monedas.ConvertirWonACLP(ValorRecibido);
					break;
			}
	}
}
