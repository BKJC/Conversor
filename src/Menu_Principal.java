import javax.swing.JOptionPane;

public class Menu_Principal {

	public static void main(String[] args) {
		
		TipoDeConversion tipoConversion = new TipoDeConversion();

		String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Selecciona", "Conversor de Moneda", "Conversor de Temperatura" }, "Seleciona"))
				.toString();
		
		
		switch (opciones) {
			case "Conversor de Moneda": 
				String opcionConversion = 	(JOptionPane.showInputDialog(
						null, "Seleccione tipo de conversión", "Conversor", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
								"Seleccione", "Moneda Local a Moneda Extranjera", "Moneda Extranjera a Moneda Local" },
						"Seleccione")).toString();
				tipoConversion.OpcionDeConversion(opcionConversion);
			break;		
		}
	}
}
