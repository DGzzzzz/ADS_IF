with open('medals_total.csv', 'r') as arquivo:
    linhas = arquivo.readlines()
    
country_names = []
total_medals = []
total_golds = []
total_silvers = []
total_bronzes = []

def ordena_lista(lista):
    n = len(lista)
    if n > 1:
        meio = n // 2
        listaDaEsquerda = lista[:meio]
        listaDaDireita = lista[meio:]
        
        ordena_lista(listaDaEsquerda)
        ordena_lista(listaDaDireita)
        
        i = j = k = 0
        while i < len(listaDaEsquerda) and j < len(listaDaDireita):
            if listaDaEsquerda[i] < listaDaDireita[j]:
                lista[k] = listaDaEsquerda[i]
                i += 1
            else:
                lista[k] = listaDaDireita[j]
                j += 1
            k += 1
            
        # Copia os elementos restantes
        lista[k:] = listaDaEsquerda[i:] or listaDaDireita[j:]
        
    return lista

ordena_lista(country_names)
ordena_lista(total_medals)
ordena_lista(total_golds)
ordena_lista(total_silvers)
ordena_lista(total_bronzes)


for linha in linhas[1:]:
    partes = linha.split(',')
    if(len(partes) > 5):
        names = partes[1]
        gold = int(partes[3])  
        silver = int(partes[4])
        bronze = int(partes[5])
        
        country_names.append(names)
        total_medals.append(int(gold) + int(silver) + int(bronze)) 
        total_golds.append(gold)
        total_silvers.append(silver)
        total_bronzes.append(bronze)
        
        
def country_top_medal(country_names, total_medals):
    max_medal = max(total_medals)
    max_index = total_medals.index(max_medal)
    return country_names[max_index], max_medal

def country_top_gold(country_names, total_golds):
    max_gold = max(total_golds)
    max_index = total_golds.index(max_gold)
    return country_names[max_index], max_gold

def country_top_silver(country_names, total_silvers):
    max_silver = max(total_silvers)
    max_index  = total_silvers.index(max_silver)
    return country_names[max_index], max_silver

def country_top_bronze(country_names, total_bronzes):
    max_bronze = max(total_bronzes)
    max_index  = total_bronzes.index(max_bronze)
    return country_names[max_index], max_bronze

def countrys_top3_medals_gold(country_names, total_golds):
    top3 = []
    for i in range(3):
        max_gold = max(total_golds)
        max_index = total_golds.index(max_gold)
        top3.append((country_names[max_index], max_gold))
        total_golds.pop(max_index)
        country_names.pop(max_index)        
    return top3

def pesquisa_pais(pais):
    try:
        index = country_names.index(pais)
        return total_medals[index], total_golds[index], total_silvers[index], total_bronzes[index]
    except ValueError:
        return 'Pais não encontrado', 0, 0, 0

print(f'Pais com mais medalhas: {country_top_medal(country_names, total_medals)[0]} com {country_top_medal(country_names, total_medals)[1]} medalhas')
print(f'Pais com mais medalhas de ouro: {country_top_gold(country_names, total_golds)[0]} com {country_top_gold(country_names, total_golds)[1]} medalhas de ouro')
print(f'Pais com mais medalhas de prata: {country_top_gold(country_names, total_silvers)[0]} com {country_top_silver(country_names, total_silvers)[1]} medalhas de prata')
print(f'Pais com mais medalhas de bronze: {country_top_gold(country_names, total_bronzes)[0]} com {country_top_bronze(country_names, total_bronzes)[1]} medalhas de bronze')
print(f'Top 3 paises com mais medalhas de ouro: {countrys_top3_medals_gold(country_names, total_golds)}')

pais = input('Digite o nome do pais: ')
resultado = pesquisa_pais(pais)
if resultado[0] == 'Pais não encontrado':
    print(resultado[0])
else:
    print(f'O pais digitado tem essas medalhas: Ouro: {pesquisa_pais(pais)[1]}, Prata: {pesquisa_pais(pais)[2]}, Bronze: {pesquisa_pais(pais)[3]}')