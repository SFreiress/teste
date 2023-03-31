package br.ce.wcaquino.servicos;

import static org.junit.Assert.fail;

import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {
	@Rule
	public ErrorCollector error = new ErrorCollector();

	@Test
	public void teste1() throws Exception {
		// cenário
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Teste 01");
		Filme filme = new Filme("Filme 1", 1, -5.0);

		// ação
		Locacao locacao;
		

		// verficação
		locacao = service.alugarFilme(usuario, filme);
		error.checkThat(locacao.getValor(), CoreMatchers.is(5.0));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(2)),
				CoreMatchers.is(true));

//		Assert.assertEquals("Analisa Valor", 5.0, locacao.getValor(), 0.0);
//		Assert.assertTrue (locacao.getValor()== 5.0);
//		Assert.assertTrue (DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
//		Assert.assertTrue((DataUtils.isMesmaData(locacao.getDataRetorno(),DataUtils.obterDataComDiferencaDias(1))));
	}
}
