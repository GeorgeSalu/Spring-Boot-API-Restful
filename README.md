### Spring-Boot-API-Restful

    Introdução ao Spring Boot
        Hello World
        (Opcional) Download do projeto inicial
        Sobre Spring e Spring Boot
    Publicando Endpoints
        Conhecendo o projeto
        Download das classes de modelo
        Primeiro Endpoint da API
        Uso da anotação @ResponseBody
        Usando DTO
        Módulo Spring Boot DevTools
        O que é REST
    Usando Spring Data
        Começando com Spring Data JPA
        Configurações do banco de dados da aplicação
        Utilizando Repository
        Interface que segue o padrão Repository
        Consulta com filtros
        Filtrando dados pelo relacionamento
    Trabalhando com POST
        Cadastrando tópicos
        Uso da anotação @RequestBody
        Boas práticas no cadastro
        Métodos com retorno void
        Testando o cadastro com Postman
        O cabeçalho Content-Type
    Validação com Bean Validation
        Validações com Bean Validation
        Uso da anotação @Valid
        Simplificando o JSON
        Uso da anotação @ResponseStatus no RestControllerAdvice
    Métodos PUT, DELETE e tratamento de erro
        Detalhando tópicos
        Paths dinâmicos
        Atualizando tópicos
        Controle transacional
        Removendo tópicos
        Anotação dos métodos de remoção
        Tratando o erro 404
        Vantagem de devolver o erro 404
    Paginação e Ordenação de recursos
        Paginação
        Vantagem de utilizar a interface Page
        Ordenação
        Ordenando registros na lista
        Simplificando a paginação e ordenação
        Uso da anotação @PageableDefault
    Melhorando desempenho com Spring Cache
        Utilizando Cache
        Anotação @Cacheable
        Invalidando Cache
        Invalidação de caches
        Boas práticas no uso de cache
    Proteção com Spring Security
        Habilitando o Spring Security
        Habilitando o Spring Security
        Liberando acesso aos endpoints públicos
        Liberando acesso aos endpoints públicos
        Restringindo acesso aos endpoints privados
        Restringindo acesso aos endpoints privados
        Autenticando o usuário
        Lógica de autenticação
    Gerando Token com JWT
        Por que autenticar via token
        Configurando autenticação Stateless
        Página de login
        Gerando tokens com JWT
        Injeção de propriedades
        Retornando o token para o cliente
        Token
    Autenticação via Token
        Recuperando o token do header Authorization
        OncePerRequestFilter
        Validando o token
        Injeção de dependências no Filter
        Autenticando o cliente via Spring Security
        Forçando a autenticação via SecurityContextHolder
    Monitoramento com Spring Boot Actuator e Admin
        Spring Boot Actuator
        Spring Boot Admin
        (Opcional) Download do projeto de monitoramento
        Spring Boot Admin
        Monitorando nossa API com Spring Boot Admin
        Spring Boot Admin Client
    Documentação da API com Swagger
        Porque documentar a API
        Documentação da API
        Documentação da API com SpringFox Swagger
        Token JWT na documentação do Swagger
        Enviando token JWT no Swagger