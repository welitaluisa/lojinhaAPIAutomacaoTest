package modulos.produtos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste Web do Módulo de Produtos")

public class ProdutosTest {
    @Test
    @DisplayName("Não é permitido  registrar um produto com valor igual a zero")
    public void testNaoEPermitidoRegistrarProdutoComValorIgualAZero() {

        //Abrir o Navegador

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\ChomeDriver\\91\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        // Comando para Maximizar a tela
        navegador.manage().window().maximize();

        // Navegar para a pagina da loginha Web

        navegador.get("http://165.227.93.41/lojinha-web/v2/");
        //Fazer Login

        //Vou para a tela de resgistro de Produtos

        // Vou preencher dados do produto e o valor sera igual a zero

        // vou submeter o formulario

        // Vou validar que  mensagem de erro foi apresentada


    }
}
