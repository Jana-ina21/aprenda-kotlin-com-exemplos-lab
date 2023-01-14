// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }
enum class Matricular { ESTUDANTE, PROFESSOR }

data class Usuarios(val fNome: String, val lNome: String, val email: String, val matricular: Matricular)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, val conteudo: List<ConteudoEducacional>, val nivel: Nivel) {

    val registrado = mutableListOf<Usuarios>()
   
    fun addUsuario(usuario: Usuarios) {
         registrado.add(usuario)
    }
   
    fun getAddUsuario(){
        for(usuario in registrado){
            println("|Nome: ${usuario.fNome+" "+usuario.lNome}| - |Email: ${usuario.email}| - (${usuario.matricular})")
        }
    }
   
    fun printConteudoEducacional(){
        for(cont in conteudo){
            println("${cont.nome} - ${cont.duracao}min - (${cont.nivel})")
        }
    }
}

fun main() {
 	val cursoKotlinB = ConteudoEducacional("Linguagem Kotlin", 150, Nivel.BASICO)
    val cursoAndroidStudioB = ConteudoEducacional("Fundamentos Android Studio", 150, Nivel.BASICO)
  	val cursoKotlinI = ConteudoEducacional("Linguagem Kotlin", 180, Nivel.INTERMEDIARIO)
  	val cursoAndroidStudioI = ConteudoEducacional("Fundamentos Multiscreen", 180, Nivel.INTERMEDIARIO)
   
	val Listadeconteudo = mutableListOf<ConteudoEducacional>()
  		Listadeconteudo.add(cursoKotlinB)
  		Listadeconteudo.add(cursoAndroidStudioB)
    	Listadeconteudo.add(cursoKotlinI)
        Listadeconteudo.add(cursoAndroidStudioI)
   
    val eliel = Usuarios("Eliel","Santos", "elielsantoszn@gmail.com", Matricular.ESTUDANTE)
    val stefani = Usuarios("Stefani","Aparecida", "stefaniaparecida@gmail.com", Matricular.ESTUDANTE)
    val emerson = Usuarios("Emerson","Nascimento", "nascimentoemerson20@gmail.com", Matricular.PROFESSOR)
   
    val Treinamentoandroid = Formacao("Formação Desenvolvedor Android", Listadeconteudo, Nivel.INTERMEDIARIO)
     
    Treinamentoandroid.addUsuario(eliel)
    Treinamentoandroid.addUsuario(stefani)
    Treinamentoandroid.addUsuario(emerson)
   
  	println(" -----------------------------------------")
    println("|${Treinamentoandroid.nome} - ${Treinamentoandroid.nivel}|")
    println(" -----------------------------------------")
   
    println("Grade do curso")
    println(Treinamentoandroid.printConteudoEducacional())
    println("-----------------------------------------")
   
    println("Usuarios cadastrados no curso")
    println(Treinamentoandroid.getAddUsuario())
}