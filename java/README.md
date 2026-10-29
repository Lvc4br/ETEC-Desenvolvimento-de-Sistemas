# Exercícios de Java

Este diretório reúne **exercícios independentes** feitos durante o curso Técnico em Desenvolvimento de Sistemas na ETEC. Cada lista permanece separada para preservar a organização original das atividades; este repositório não é uma aplicação única nem um projeto coletivo.

## Índice das listas

| Diretório | Conteúdo identificado |
| --- | --- |
| [listaA](./listaA/) | Exercícios A1–A8 |
| [listaAExtra2](./listaAExtra2/) | Exercícios extras A1–A9 |
| [listaD](./listaD/) | Exercícios D1–D9 |
| [listaExtra](./listaExtra/) | Exercícios complementares A1–A6 |
| [listaF](./listaF/) | Exercícios F1–F10 |
| [listaI](./listaI/) | Exercícios I1–I15 |

Os intervalos acima refletem os arquivos atualmente presentes e podem mudar conforme novas atividades forem adicionadas.

## Arquivos avulsos

- [gado.java](./gado.java) — exercício de processamento de dados de um lote de bois.
- [gado_bianca.java](./gado_bianca.java) — outra versão do exercício, preservada separadamente para comparação.

Os dois arquivos são mantidos separados porque representam soluções diferentes. Não os combine nem sobrescreva uma versão com a outra sem uma decisão explícita.

## Como executar um exercício

Use um JDK instalado e compile o arquivo específico a partir da pasta dele. Exemplo, dentro de `listaA`:

```bash
javac A1.java
java A1
```

Esse comando é ilustrativo: o nome da classe pública precisa corresponder ao arquivo, e exercícios com dependências, pacotes ou requisitos diferentes podem precisar de comandos próprios. Compile um exercício por vez para evitar conflitos entre classes principais.

## Convenções para novas atividades

1. Mantenha cada lista da ETEC em seu próprio diretório.
2. Preserve o identificador usado no enunciado (por exemplo, `A1.java`, `D1.java`).
3. Coloque atividades complementares em uma pasta de extras apropriada, sem misturá-las às listas regulares.
4. Mantenha versões de autoria diferente em arquivos distintos e identifique a origem no comentário/README quando isso for conhecido.
5. Não adicione credenciais, dados pessoais ou arquivos gerados de compilação (`.class`).

O catálogo é documental: os nomes das pastas não garantem que todos os exercícios tratem do mesmo assunto. Consulte o enunciado e o código de cada arquivo.
