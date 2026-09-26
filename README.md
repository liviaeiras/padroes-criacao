Padrões de Criação — Abstract Factory + Factory Method + Singleton

Sistema simples de emissão de documentos acadêmicos (Historico e Diploma) para alunos de Graduação e Pós-Graduação.

Estrutura
Historico, Diploma — interfaces dos produtos.
HistoricoGraduacao, HistoricoPosGraduacao, DiplomaGraduacao, DiplomaPosGraduacao — produtos concretos.
FabricaAbstrata — interface que declara a família de produtos a criar.
FabricaGraduacao, FabricaPosGraduacao — fábricas concretas.
Aluno — cliente, recebe uma fábrica e obtém seus documentos sem saber a classe concreta.
Main — demonstração de uso.
