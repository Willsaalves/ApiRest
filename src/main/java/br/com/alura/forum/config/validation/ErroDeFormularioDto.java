package br.com.alura.forum.config.validation;

public class ErroDeFormularioDto {

	private String campo;
	private String mensagemErro;

	public String getCampo() {
		return campo;
	}

	public String getMensagemErro() {
		return mensagemErro;
	}

	public ErroDeFormularioDto(String campo, String mensagemErro) {
		super();
		this.campo = campo;
		this.mensagemErro = mensagemErro;
	}
}
