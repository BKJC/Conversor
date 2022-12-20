import javax.swing.JOptionPane;

public class Menu_Principal {

	public static void main(String[] args) {

		TipoDeConversion tipoConversion = new TipoDeConversion();
		VerificacionMonedas validar = new VerificacionMonedas();
		FunctionTemperaturas temperaturas = new FunctionTemperaturas();

		String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Selecciona", "Conversor de Moneda", "Conversor de Temperatura" }, "Seleciona"))
				.toString();

		switch (opciones) {
		case "Conversor de Moneda":
			String opcionConversion = (JOptionPane.showInputDialog(
					null, "Seleccione tipo de conversión", "Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
							"Seleccione", "Moneda Local a Moneda Extranjera", "Moneda Extranjera a Moneda Local" },
					"Seleccione")).toString();
			tipoConversion.OpcionDeConversion(opcionConversion);
			break;
		case "Conversor de Temperatura":
			String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir",
					"Local a Extranjera", 3);

			boolean valido = validar.ValidarNumeros(input);

			if (!valido) {
				JOptionPane.showMessageDialog(null, "Valor no válido", "Error", 1);
			} else {
				double valorRecibido = Double.parseDouble(input);
				temperaturas.ConvertirTemperaturas(valorRecibido);
			}

		}
	}
}
