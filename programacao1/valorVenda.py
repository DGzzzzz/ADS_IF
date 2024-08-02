import random ## Importa a biblioteca random, para gerar um valor de venda aleatório

## Função que retorna um dicionário com as opções de forma de pagamento e o desconto de cada uma
## dicionário é uma estrutura de dados que armazena pares chave-valor
def opcoesFormaPgto():
    return {1: 0.12, 2: 0.03}

## Função que imprime as opções de forma de pagamento 
def formaDePgto():
    opcoes = opcoesFormaPgto()                                          ## Chama a função opcoesFormaPgto() e armazena o retorno na variável opcoes
    print("Qual a forma de pagamento?")
    for opcao, desconto in opcoes.items():                              ## Percorre o dicionário opcoes e imprime a chave (opcao) e o valor (desconto) de cada item do dicionário
        print(f'{opcao} - Desconto de {desconto * 100}%')               ## imprime a opção e o desconto


## Função que pega a opção de forma de pagamento do usuário
def pegaOpcao():
    try:
        return int(input())
    except ValueError:
        print("Opção inválida")
        return pegaOpcao()


## Função que calcula o valor total da venda
def calculaValorTotalVenda(valorCompra, forma):                        ## Recebe o valor da compra e a forma de pagamento
    opcoes = opcoesFormaPgto()                                         ## Chama a função opcoesFormaPgto() e armazena o retorno na variável opcoes
    if forma in opcoes:                                                ## Verifica se a forma de pagamento informada está no dicionário opcoes
        return valorCompra - (valorCompra * opcoes[forma])             ## Retorna o valor da compra menos o desconto da forma de pagamento informada
    else:
        print("Opção inválida")
        return calculaValorTotalVenda(valorCompra, pegaOpcao())       ## Se a forma de pagamento informada não estiver no dicionário opcoes, imprime "Opção inválida" e chama a função calculaValorTotalVenda() novamente


## Função que simula uma compra
def compras(): 
    valorCompra = random.randint(1, 100)                              ## Gera um valor de compra aleatório entre 1 e 100
    print("O Valor da compra é R$", valorCompra)
    formaDePgto()                                                     ## Chama a função formaDePgto() para imprimir as opções de forma de pagamento
    forma = pegaOpcao()                                               ## Chama a função pegaOpcao() e armazena o retorno na variável forma
    return calculaValorTotalVenda(valorCompra, forma)                 ## Retorna o valor total da venda

print("O valor total da venda é R$", compras())                       ## Imprime o valor total da venda

#commit