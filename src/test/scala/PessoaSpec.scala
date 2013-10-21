import java.lang.NullPointerException
import java.util.Calendar
import org.specs2.mutable.Specification

class PessoaSpec extends Specification {

  "testar criacao do objeto" should {
    "o objeto deve ser criado com todos os parametros" in {
      val pessoa = Pessoa("Fulano da Silva", Calendar.getInstance())

      pessoa mustNotEqual null
      pessoa.nome mustEqual "Fulano da Silva"
      pessoa.nascimento mustNotEqual null
    }

    "o objeto deve ser diferente caso os parametros sejam diferentes" in {
      val cal: Calendar = Calendar.getInstance()

      val pessoa1 = Pessoa("Fulano da Silva", Calendar.getInstance())
      val pessoa2 = Pessoa("Sicrano da Silva", cal)
      val pessoa3 = Pessoa("Sicrano da Silva", cal)

      pessoa1 mustNotEqual null
      pessoa2 mustNotEqual null
      pessoa1 mustNotEqual pessoa2
      pessoa2 mustEqual pessoa3
    }
  }

  "testar o calculo de idade" should {
    "a idade da pessoa, deve ser 20 anos" in {
      val nascimento = Calendar.getInstance()
      nascimento.set(1993, 5, 6)
      val pessoa = Pessoa("Fulano da Silva", nascimento)

      pessoa.calcularIdade mustNotEqual null
      pessoa.calcularIdade mustEqual 20
    }

    "a idade da pessoa eh passada como null" in {
      val pessoa = Pessoa("Fulano da Silva", null)
      pessoa.calcularIdade must throwA[NullPointerException]
    }
  }

}
