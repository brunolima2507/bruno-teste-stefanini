package pages;

import java.io.IOException;

import elementos.ElementosWeb;

public class CadastrarUsuario {
	
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	public void preencherDadosUsuario (String nome, String email, String senha) throws IOException {
		metodos.preencher(el.getNome(), nome, "preenchendo o nome");
		metodos.preencher(el.getEmail(), email, "preenchendo o email");
		metodos.preencher(el.getSenha(), senha, "preenchendo a senha");
		//metodos.screnShoot("Dados do usuário");
		
		}
	
	public void enviarCadastro () throws IOException {
		metodos.clicar(el.getCadastrar(), "clicando em cadastrar");
		metodos.validarTexto(el.getValidamsg(), "Usuários cadastrados", "validando a msg final");
		//metodos.screnShoot("Usuário cadastrado");
		
	}
	
	

}
