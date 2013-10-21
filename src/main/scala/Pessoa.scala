import java.util.Calendar

case class Pessoa(nome: String, nascimento: Calendar) {

  def calcularIdade = {
    val hoje = Calendar.getInstance()
    hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR)
  }

}
