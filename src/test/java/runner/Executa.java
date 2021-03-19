package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		// Mostrar o caminho das features
		features = "src/test/resources/features/",
		// Mostrar pacote estão os steps para execução
		glue = "tests",
		// Tags para direcionar a execução dos testes
		tags = "@Executa",
		// Formatação do console cucumber | report html
		plugin = {"pretty", "html:target/report.html"},
		// Monochrome deixa mais limpo o console, sem trazer caracteres especiais
		monochrome = true,
		// Deixa os métodos com padrão da linguagem Java ao invés de underline 
		snippets = SnippetType.CAMELCASE,
		// Não executa o teste ele so valida o mapeamento se falta terminar alguma coisa, padrão deixar false
		dryRun = false
		)

public class Executa {

}
