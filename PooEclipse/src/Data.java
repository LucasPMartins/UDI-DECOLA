
public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		if (verificarData(dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			this.dia = 1;
			this.mes = 1;
			this.ano = 2024;
		}
	}

	private boolean verificarData(int dia, int mes, int ano) {
		if (ano < 2024) {
			return false;
		}
		if (mes < 1 || mes > 12) {
			return false;
		}
		if (dia < 1 || dia > diasNoMes(mes, ano)) {
			return false;
		}
		return true;
	}

	private int diasNoMes(int mes, int ano) {
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return 31;
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;
		} else if (mes == 2) {
			if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
				return 29; // Ano bissexto
			} else {
				return 28; // Ano não bissexto
			}
		} else {
			return -1; // Mês inválido
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia < 0 || dia > 31)
			this.dia = 1;
		else
			this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes < 0 || mes > 12)
			this.mes = 1;
		else
			this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano <= 2024)
			this.ano = 2024;
		else
			this.ano = ano;

	}

	public boolean equals(Data d) {
		if (d == null) {
			return false;
		}
		return this.dia == d.getDia() && this.mes == d.getMes() && this.ano == d.getAno();
	}

	public String formatarData() {
		return String.format("%02d/%02d/%02d", dia, mes, ano % 100);
	}

	public Data proximoDia() {
		int proximoDia = this.dia + 1;
		int proximoMes = this.mes;
		int proximoAno = this.ano;

		// Verifica se o próximo dia ultrapassa o limite do mês
		if (proximoDia > diasNoMes(this.mes, this.ano)) {
			proximoDia = 1;
			proximoMes++;

			// Verifica se o próximo mês ultrapassa o limite do ano
			if (proximoMes > 12) {
				proximoMes = 1;
				proximoAno++;
			}
		}

		// Retorna a próxima data
		return new Data(proximoDia, proximoMes, proximoAno);
	}

}
