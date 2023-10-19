# generics_list

Os generics em Java são uma forma de adicionar tipos parametrizados a classes, interfaces e métodos. Eles permitem que seja definido tipos específicos que serão usados em um código, o que pode aumentar a segurança de tipo e reutilização de código.

No código desse projeto, `` é o tipo parametrizado usado para criar uma lista de objetos do tipo `carro`. Isso significa que a lista só pode conter objetos do tipo `carro` ou de suas subclasses. O uso de generics também permite que você especifique o tipo de retorno em declarações de método e evita a necessidade de fazer castings.

Por exemplo, a linha `list listadecarros = new arraylist<>();` declara uma lista de objetos do tipo `carro`. Isso garante que a lista só pode conter objetos do tipo `carro` ou de suas subclasses. Sem o uso de generics, seria necessário fazer um casting ao obter um objeto da lista, o que poderia causar erros de tempo de execução se o objeto não fosse do tipo esperado.

Além disso, o exemplo usa o loop `foreach` para iterar sobre a lista de carros e imprimir o nome da classe de cada carro. A lambda expression `carro -> system.out.println(carro.getclass().getname())` é usada para definir a ação a ser executada para cada elemento da lista.

Em resumo, o uso de generics no código permite uma maior segurança de tipo e maior reutilização de código, tornando-o mais legível e robusto.

## Skills utilizadas:
<div style="display: inline_block"><br>
   <img align="center" alt="Spring" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
  <img align="center" alt="Spring" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
