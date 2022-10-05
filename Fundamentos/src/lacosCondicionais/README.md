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
  A estrutura acima está completa conforme o que conhecemos.No entanto, caso queiramos, o bloco do Else pode ser omitido nos casos em que somente nos interessa executar alguma ação quando o teste_lógico retornar verdadeiro, não importando o que ocorra se o teste retornar falso. Com isso, temos a estrutura do if simples, que foi discutido nas aulas de reforço, logo abaixo: </p>
   
   ```
   if (teste_lógico) {
   Bloco de comandos a executar se o teste_lógico retornar verdadeiro
}
   ```   
   <p>Pois nesse caso, o que nos interessa é somente o retorno da condição verdadeira, então, não há necessidade de incluir o Else.</p>
   
   <h3>Encadeamento de If/else</h3>
   <p>Utilizamos condicionais aninhados, ou encadeamento de laços condicionais quando precisamos testar mais que duas condições ao          longo do laço sucessivamente. Ao invés de utilizarmos somente um if/else, podemos construir dentro dessa própria lógica, mais laços condicionais para determinar quais testes queremos realizar, utilizando uma ordem coerente de acordo com o que você quer construir no seu programa.</p>
   
   <h3>Visualização no Fluxograma</h3>
   <p>Antes de entrar no pseudocódigo propriamente dito, vale a pena olhar a representação gráfica desse caso no fluxograma: </p>
   
   ![image](https://user-images.githubusercontent.com/62121416/193960542-c2447591-cdf5-4372-af10-93bbe94f6c20.png)

   <p>Ainda no pseudocódigo, podemos observar que a estrutura se comportaria dessa forma: </p>
   
   ```
   if (teste_lógico) {
   Bloco de comandos a executar se o teste_lógico retornar verdadeiro
   }
   else {      
      if(teste_lógico){
      Bloco de comandos a executar se o teste_lógico retornar verdadeiro
      }
      else{
      Bloco de comandos a executar se o teste_lógico retornar falso
      }      
   }
   ```
   
   <p> Repare que, se no primeiro laço, tivermos um retorno falso, o primeiro Else abrirá um novo laço condicional, colocamos um if/else dentro de um else para conseguirmos testar mais condições sucessivamente</p>
