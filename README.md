# Desafios de Códigos Intermediários Java

## Registros de Transações Bancárias

Desenvolver um programa simples em Java para manter um registro de transações bancárias. Cada transação é armazenada em uma lista.

**Entrada**
* O programa solicitará ao usuário que informe o saldo inicial da conta.
* Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.

**Entrada de Transações:**
* Para cada transação, o programa solicitará ao usuário:
* O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
* O valor da transação.
**Saída**
* Utilizando listas (ArrayList ou LinkedList), o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
* Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.

## Registros de Transações Bancárias com Stream API

Programa anterior aprimorado usando Stream API do Java para processar as transações bancárias de forma mais eficiente.

**Entrada**
* O programa solicitará ao usuário que informe o saldo inicial da conta.
* Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.

**Saída**
* Utilizando a Stream API, o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
* Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.

**Entrada de Transações:**
* Para cada transação, o programa solicitará ao usuário:
* O tipo de transação: Digite 'D' para depósito ou 'S' para saque. O valor da transação.

## Conta Bancária com Construtor em POO

Desenvolver um programa simples em Java para representar uma conta bancária. Utilizando programação orientada a objetos (POO), você criará uma classe ContaBancaria com um construtor que permitirá a inicialização da conta com um saldo inicial.

**Entrada**
* O programa solicitará ao usuário que informe o saldo inicial da conta.
* Em seguida, o programa solicitará ao usuário que realize transações de depósito e saque.
**Saída**
* A classe ContaBancaria conterá métodos para realizar depósitos e saques, atualizando o saldo da conta.
* O saldo atual será exibido após cada transação.
Se o valor do saque for maior que o saldo disponível na conta, imprima uma mensagem informando: Saldo insuficiente. Saque não realizado.
 



