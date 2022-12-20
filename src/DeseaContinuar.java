import javax.swing.JOptionPane;

public class DeseaContinuar {
	
	public void Continuar() {
		
		int resp = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Menú", JOptionPane.YES_NO_CANCEL_OPTION, 					JOptionPane.QUESTION_MESSAGE);
		
		switch (resp) {
		case 0: 
			Menu_Principal.main(null);
			break;
		
		case 1: 
			JOptionPane.showMessageDialog(null, "Programa Terminado", "Fin", 1);
			break;
			
		case 2: 
			JOptionPane.showMessageDialog(null, "Programa Terminado", "Fin", 1);
			break;
		}
		
	}

}
