package tests;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import elementos.ElementosWeb;
import pages.CadastrarUsuario;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	CadastrarUsuario cadu = new CadastrarUsuario();

	@Dado("^que eu acesse o site \"([^\"]*)\" para realizar um cadastro$")
	public void que_eu_acesse_o_site_para_realizar_um_cadastro(String site) throws Throwable {
		metodos.abrirNavegador(site, "FIREFOX", "acessando a tela para realizar cadastro");

	}

	@Quando("^informar os dados do primeiro usuario$")
	public void informar_os_dados_do_primeiro_usuario() throws Throwable {
		cadu.preencherDadosUsuario("Felipe Leal", "Felipe.leal@gmail.com", "12345678");
		cadu.enviarCadastro();
		metodos.screnShoot("primeiro usuário cadastrado");

	}

	@E("^informar os dados do segundo usuario$")
	public void informar_os_dados_do_segundo_usuario() throws Throwable {
		cadu.preencherDadosUsuario("Kethilyn Miranda", "kethilyn.miranda@gmail.com", "12345678");
		cadu.enviarCadastro();
		metodos.screnShoot("segundo usuário cadastrado");

	}
	
	@E("^informar os mesmos dados do segundo usuario$")
	public void informar_os_mesmos_dados_do_segundo_usuario() throws Throwable {
		cadu.preencherDadosUsuario("Kethilyn Miranda", "kethilyn.miranda@gmail.com", "12345678");
		cadu.enviarCadastro();
		metodos.screnShoot("teceiro usuário cadastrado");

	}

	@E("^excluo usuario o primeiro usuario$")
	public void excluo_usuario_o_primeiro_usuario() throws Throwable {
		metodos.clicar(el.getExcluir(), "excluo primeiro usuário criado");
		metodos.screnShoot("excluo primeiro usuário criado");

	}

	@Entao("^finalizo o teste$")
	public void finalizo_o_teste() throws Throwable {
		metodos.fecharBrowser("fechando navegador");


	}
	
	@Quando("^insiro nome \"([^\"]*)\"$")
	public void insiro_nome(String texto) throws Throwable {
		metodos.preencher(el.getNome(), texto, "insiro nome");
		
	}

	@Quando("^insero email \"([^\"]*)\"$")
	public void insero_email(String texto) throws Throwable {
		metodos.preencher(el.getEmail(), texto, "insiro e-mail");
		
	}

	@Quando("^insiro senha \"([^\"]*)\"$")
	public void insiro_senha(String texto) throws Throwable {
		metodos.preencher(el.getSenha(), texto, "insiro a senha");
		
	}

	@Quando("^tiro print \"([^\"]*)\"$")
	public void tiro_print(String texto) throws Throwable {
		metodos.clicar(el.getCadastrar(), "clico em cadastrar");
		metodos.screnShoot(texto);
		
	}

	@Entao("^encerro o primeiro teste$")
	public void encerro_o_primeiro_teste() throws Throwable {
		
		metodos.fecharBrowser("encerro o teste e fecho navegador");

	}

}
