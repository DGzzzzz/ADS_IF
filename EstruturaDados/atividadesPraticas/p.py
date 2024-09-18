with open('produtos.txt', 'r', encoding='utf-16') as arquivo:
    linhas = arquivo.readlines()
    
nomes_produtos = []

for linha in linhas:
    partes = linha.split(';')
    if len(partes) > 1:
        nome_produto = partes[1]
        nomes_produtos.append(nome_produto)
        
def ordena_lista(lista): #Bubble Sort
    n = len(lista)
    for i in range(n):
        trocou = False
        for j in range(n-1 - i):
            if lista[j] > lista[j+1]:
                lista[j], lista[j+1] = lista[j+1], lista[j]
                trocou = True
        if not trocou:
            break
    return lista

ordena_lista(nomes_produtos)

def pesquisaBinaria(nomes_produtos, nome_produto):
    inicio = 0
    fim = len(nomes_produtos) - 1
    while inicio <= fim:
        meio = (inicio + fim) // 2
        if nomes_produtos[meio] == nome_produto:
            return meio
        elif nomes_produtos[meio] < nome_produto:
            inicio = meio + 1
        else:
            fim = meio - 1
    return -1

# nome_produto = input('Digite o nome do produto que deseja pesquisar: ')
nome_produto = 'REAL EQ. HORSE POWER C/MEL 25Kg'
indice = pesquisaBinaria(nomes_produtos, nome_produto)

if indice != -1:
    print(f'O produto "{nome_produto}" foi encontrado na posição {indice}.')
else:
    print(f'O produto "{nome_produto}" não foi encontrado.')


