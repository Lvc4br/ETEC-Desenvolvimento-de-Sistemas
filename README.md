# ETEC — Desenvolvimento de Sistemas

Repositório acadêmico com exercícios de Java realizados durante o curso Técnico em Desenvolvimento de Sistemas. O conteúdo é organizado por listas e atividades; cada arquivo registra uma solução de exercício, não um sistema único.

## Arquitetura e organização

```text
ETEC-Desenvolvimento-de-Sistemas/
└── java/
    ├── listaA/          # exercícios A1, A2, ...
    ├── listaAExtra2/    # lista extra
    ├── listaD/          # exercícios D1, D2, ...
    ├── listaExtra/      # exercícios complementares
    ├── listaF/          # exercícios F1, F2, ...
    ├── listaI/          # exercícios I1, I2, ...
    ├── gado.java
    └── gado_bianca.java
```

A árvore pode conter outras listas ou arquivos conforme novas atividades forem adicionadas. Os nomes dos diretórios e arquivos são o índice principal; confira o conteúdo da atividade antes de executar.

## Objetivos de aprendizagem

- Praticar lógica de programação e sintaxe Java.
- Resolver problemas pequenos de forma incremental.
- Comparar abordagens e manter um histórico de atividades.
- Utilizar Git/GitHub para versionar código.

## Requisitos e execução

É necessário um JDK compatível com o código de cada exercício. Muitos arquivos são exercícios independentes e podem declarar uma classe principal própria. Para executar um arquivo isolado, abra o diretório apropriado e compile/execute conforme a classe e o nome do arquivo. Exemplo genérico:

```bash
javac A1.java
java A1
```

O exemplo só funciona se a classe pública do arquivo se chamar `A1` e não houver dependências ou declaração de pacote que exijam outro comando.

## Relação com Java Lab

[Java-Lab](https://github.com/Lvc4br/Java-Lab) é uma interface separada para catalogar e experimentar a execução de exercícios deste repositório. O Java Lab carrega uma cópia do código e pode adaptá-la ao executor externo; editar no navegador não altera os arquivos originais daqui.

## Escopo e limitações

- Repositório de exercícios, não aplicação Java integrada.
- Não há build único, gerenciador de dependências ou testes automatizados globais documentados.
- O modo de compilação pode variar entre arquivos.
- Soluções com finalidade acadêmica podem refletir o conteúdo estudado na época da atividade.

**Autor:** Luca Toniolo — [@Lvc4br](https://github.com/Lvc4br)
