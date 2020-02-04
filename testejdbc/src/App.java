import connection.JDBCConnection;
import dao.ModalidadeDAO;
import dao.TipoPasseioDAO;
import domain.Modalidade;
import domain.TipoPasseio;

public class App {
	
	public static void main(String[] args) {
		System.out.println(JDBCConnection.getConnection());
		
		//Modalidade modalidade = new Modalidade();
		
		//modalidade.setNomeModalidade("Caminhada tirando fotos");
		//modalidade.setIdModalidade(5);
//		
//		System.out.println( new TipoPasseioDAO().listarTodos());
//		TipoPasseio passeio = new TipoPasseio();
//		
//		passeio.setIdTipoPasseio(4);
//		new TipoPasseioDAO().deletar(passeio);
//		passeio.setIdTipoPasseio(6);
//		new TipoPasseioDAO().deletar(passeio);
//		passeio.setIdTipoPasseio(7);
//		new TipoPasseioDAO().deletar(passeio);
		
		System.out.println( new TipoPasseioDAO().listarTodos());
		
		
		
	}
}
