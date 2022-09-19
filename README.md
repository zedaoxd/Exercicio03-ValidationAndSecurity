# Desafio Validação e Segurança

## Sobre o projeto
Este é o terceiro desafio do **Bootcamp Spring** da [DevSuperior](https://devsuperior.com.br/cursos) cuja aulas estão sendo ministradas pelo professor [Nelio Alves](https://www.linkedin.com/in/nelio-alves/?originalSubdomain=br).

Este exercício foi proposto que implementassemos as funcionalidades para que os testes de validação e de segurança ao nível de rotas passasem, entre os desafios estava os seguintes testes:

- Testes no end-point da cidade:
  - Insert deve retornar 401 (unauthorized) quando não tiver usuário logado;
  - Insert deve retornar 403 (forbidden) quando tiver um cliente logado;
  - Insert deve inserir e retornar a entidade quando tiver um administrador logado, se os dados tiverrem corretos;
  - Insert deve retornar 422 (unprocessableEntity) quando o administrador estiver logado e inserir nome em branco/null;
  - FindAll deve retornar todos os dados;
- Tests no end-point dos eventos:
  - Insert deve retornar 401 (unauthorized) quando não tiver usuário logado;
  - Insert deve inserir e retornar a entidade quando tiver um cliente ou administrador logado, se os dados tiverrem corretos;
  - Insert deve retornar 422 (unprocessableEntity) quando o administrador estiver logado e inserir nome em branco/null;
  - Insert deve retornar 422 (unprocessableEntity) quando o administrador estiver logado e inserir uma data no passado ou presente, somente aceita datas futuras;
  - FindAll deve retornar uma lista paginavel de todos os dados;

Neste sistema, somente as rotas de leitura de eventos e cidades são públicas. Usuários CLIENT podem também inserir novos eventos. Os demais acessos são permitidos apenas a usuários ADMIN

## Modelo Conceitual
Este é um sistema de eventos e cidades com uma relação N-1 entre eles
![Modelo Conceitual](https://user-images.githubusercontent.com/55067151/191044427-568e5fa1-296e-4ce6-82b8-0df5df86fdb9.png)

## Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Como executar o projeto

Pré-requisitos: Java 11
- Clone o projeto
```bash
# clonar repositório
git clone https://github.com/zedaoxd/Exercicio02-DesafioTDD.git
```
- Importe na sua IDE Java
- Clique em Run Tests

## Autor

[Bruno Lessa Ferraz](https://www.linkedin.com/in/bruno-lessa-ferraz/)

