enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome:String,val email:String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        for(user in usuario){
            inscritos.add(user)
        }
    }
}

fun main() {
    var conteudos:List<ConteudoEducacional> = mutableListOf(
        ConteudoEducacional("Python-I", 50),
        ConteudoEducacional("Python-II", 70)
    )
   	var formacoes:Formacao = Formacao("Python",Nivel.BASICO,conteudos)
    var user1:Usuario = Usuario("Carlos")
    var user2:Usuario = Usuario("Marcos")
    println(formacoes.inscritos)
    
    
    formacoes.matricular(user1)
    formacoes.matricular(user2)
    
    
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}