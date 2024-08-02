## função que coleta as idades e retorna em um array 
def coletaIdades():
    idades = []
    while True:
        idade = int(input('Digite a idade: '))
        if idade == -1:
            break
        else:
            idades.append(idade)
    return idades

## função que calcula a média das idades
def calculaMedia(idades):                                               # função que recebe um array de idades como parâmetro
    return sum(idades) / len(idades)                                    # função sum() retorna a soma de todos os elementos de uma lista e a função len() retorna o tamanho da lista

## função que retorna a quantidade de pessoas com mais de 18 anos
def pessoasMaiorIdade(idades):
    maiorIdade = []
    for idade in idades:
        if idade >= 18:
            maiorIdade.append(idade)
    return len(maiorIdade)

idades = coletaIdades()                                                # armazena o retorno da função coletaIdades() na variável idades
print(f'Media das idades: {calculaMedia(coletaIdades())}')
print(f'Pessoas com mais de 18 anos: {pessoasMaiorIdade(idades)}')

#commit