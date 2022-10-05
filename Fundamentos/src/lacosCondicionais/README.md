<h2>Materiais Extras para Laços Condicionais</h2>

<h3>Fluxo Condicional</h3>
<p>O diagrama de fluxo, ou fluxograma, antes de mais nada, pode nos auxiliar a ter um visual mais intuitivo de como o if/else funciona. Temos a entrada de dados e, a seguir, a tomada de decisões com essas informações a partir da abertura do laço condicional. Se a condição for verdadeira, teremos uma saída, se for falsa, teremos uma outra saída, como ilustra a figura abaixo: </p>

![image](https://user-images.githubusercontent.com/62121416/193959797-53facac6-dc59-4f65-ab2a-fdb784b46490.png)

<h3>Sintaxe Básica</h3>
<p>A sintaxe, ou seja a forma que a lógica é escrita em Java para estruturar esses comandos é, resumidamente em pseudocódigo, essa a seguir:</p>

   ```
   if (teste_lógico) {
   Bloco de comandos a executar se o teste_lógico retornar verdadeiro
}
else {
   Bloco de comandos a executar se o teste_lógico retornar falso
}
   ```
<p>
   O bloco else pode ser omitido nos casos em que somente interessa executar alguma ação quando o teste_lógico retornar verdadeiro, não importando o que ocorra se o teste retornar falso. Com isso, temos a estrutura do if simples, que foi discutido nas aulas de reforço: </p>
   
   ```
   if (teste_lógico) {
   Bloco de comandos a executar se o teste_lógico retornar verdadeiro
}
   ```   
   <p>Pois nesse caso, o que nos interessa é somente o retorno da condição verdadeira, então, não há necessidade de incluir o Else.</p>
   
