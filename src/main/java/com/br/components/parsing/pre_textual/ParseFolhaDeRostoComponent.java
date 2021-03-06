package com.br.components.parsing.pre_textual;

import org.springframework.stereotype.Component;

import com.br.components.parsing.Parse;
import com.br.models.Documento;
import com.br.models.enums.TipoTrabalho;

@Component
public final class ParseFolhaDeRostoComponent extends Parse {

	@Override
	public String persistData(String string, Documento document) {
		switch(string) {
			case"\\folhaderosto":
				if(document.getTipoTrabalho() == TipoTrabalho.TCC) {
					return "\\preambulo{{\\imprimirprojeto} apresentado ao {\\imprimirprograma} de {\\programanivel} do "
							+ "{\\imprimirinstituicao} - \\instituicaosigla, {\\instituicaocampus}, em cumprimento às "
							+ "exigências legais como requisito parcial à obtenção do título de {\\imprimirtituloAcademico} "
							+ "em " + document.getCurso().getNome() + "";
				}
				return "\\preambulo{{\\imprimirprojeto} apresentada ao Programa de \\mbox{Pós-graduação} da {\\imprimirinstituicao}, "
						+ "como requisito parcial para obtenção do título de {\\imprimirtituloAcademico}.}";
			default:
				return string;
		}
	}

}
