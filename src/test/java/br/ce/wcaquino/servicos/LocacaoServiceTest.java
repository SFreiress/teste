package br.ce.wcaquino.servicos;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {
	@Test	
	public void teste1() {
		//cenário
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Teste 01");
		Filme filme = new Filme ("Filme 1",2,5.0);
		
		//ação
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		//verficação
		Assert.assertEquals("Analisa Valor", 5.0, locacao.getValor(), 0.0);
		Assert.assertTrue (locacao.getValor()== 5.0);
		Assert.assertTrue (DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assert.assertTrue((DataUtils.isMesmaData(locacao.getDataRetorno(),DataUtils.obterDataComDiferencaDias(1))));
	}
}
