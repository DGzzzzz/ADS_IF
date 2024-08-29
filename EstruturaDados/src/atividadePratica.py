with open('netflix_titles.csv', 'r') as arquivo:
    linhas = arquivo.readlines()

nomes_filmes = []
anos_lancamentos = []

for linha in linhas:
    partes = linha.split(';')
    if len(partes) > 4:
        nome_filme = partes[1]
        ano_lancamento = partes[4]
        nomes_filmes.append(nome_filme)
        anos_lancamentos.append(ano_lancamento)

nomes_filmes.sort()

def pesquisaBinaria(nomes_filmes, nome_filme):
    inicio = 0
    fim = len(nomes_filmes) - 1
    while inicio <= fim:
        meio = (inicio + fim) // 2
        if nomes_filmes[meio] == nome_filme:
            return meio
        elif nomes_filmes[meio] < nome_filme:
            inicio = meio + 1
        else:
            fim = meio - 1
    return -1

def filmeMaisAntigo(nomes_filmes, anos_lancamentos):
    if not anos_lancamentos:
        return None
    indice_mais_antigo = 0
    for i in range(1, len(anos_lancamentos)):
        if anos_lancamentos[i] < anos_lancamentos[indice_mais_antigo]:
            indice_mais_antigo = i
    return nomes_filmes[indice_mais_antigo]

# nome_filme = input('Digite o nome do filme que deseja pesquisar: ')
nome_filme = 'Yes or No 2'
indice = pesquisaBinaria(nomes_filmes, nome_filme)

if indice != -1:
    print(f'O filme "{nome_filme}" foi encontrado na posição {indice}.')
else:
    print(f'O filme "{nome_filme}" não foi encontrado.')    

filme_mais_antigo = filmeMaisAntigo(nomes_filmes, anos_lancamentos)
if filme_mais_antigo:
    print(f'O filme mais antigo é "{filme_mais_antigo}". Lançado em {anos_lancamentos[nomes_filmes.index(filme_mais_antigo)]}.')
else:
    print('Não foi possível determinar o filme mais antigo.')