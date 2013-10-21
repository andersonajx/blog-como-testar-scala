import java.util.{Date, Calendar}

case class Pessoa(nome: String, nascimento: Calendar) {

  def calcularIdade = {
    val hoje = Calendar.getInstance()
    hoje.setTime(new Date)
    hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR)
  }

}
