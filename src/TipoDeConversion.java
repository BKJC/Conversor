import javax.swing.JOptionPane;

public class TipoDeConversion {
	
	public void OpcionDeConversion(String opcionConversion){
		
		FunctionAExtranjero monedaLocal = new FunctionAExtranjero();
		FunctionALocal monedaExtranjera = new FunctionALocal();
		VerificacionMonedas validar = new VerificacionMonedas();
		
		
		
		switch (opcionConversion) {
			case "Moneda Local a Moneda Extranjera":
				String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir", 								"Local a Extranjera", 3);
				
				boolean valido = validar.ValidarNumeros(input);
				
				if(!valido) {
					JOptionPane.showMessageDialog(null, "Valor no válido", "Error", 1);
				} else {
					double valorRecibido = Double.parseDouble(input);
					monedaLocal.ConvertirMonedas(valorRecibido);
				}
				break;
			
			case "Moneda Extranjera a Moneda Local":
				input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir", 								"Extranjera a Local", 3);
				valido = validar.ValidarNumeros(input);
				
				if(!valido) {
					JOptionPane.showMessageDialog(null, "Valor no válido", "Error", 1);
				} else {
					double valorRecibido = Double.parseDouble(input);
					monedaExtranjera.ConvertirMonedas(valorRecibido);
				}
				break;
		}
	}
}
