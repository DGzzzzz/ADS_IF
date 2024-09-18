with open('top_intelligent_people_in_the_world_5000.csv', 'r') as arquivo:
    linhas = arquivo.readlines()
    
nomes = []
qis = []

for linha in linhas:
    partes = linha.split(',')
    if(len(partes) > 3):
        nome = partes[0]
        qi = partes[3]
        
        nomes.append(nome)
        if qi != 'IQ':
            qis.append(qi)
            
nomes.sort()        
qis.sort()

homens = []
mulheres = []
#Male
#Female

for linha in linhas:
    partes = linha.split(',')
    if(len(partes) > 6):
        nome = partes[0]
        sexo = partes[6]
        if sexo == 'Male':
            homens.append(nome)
        else:
            mulheres.append(nome)
        nomes.append(nome)
        
paises = []

for linha in linhas:
    partes = linha.split(',')
    if(len(partes) > 1):
        pais = partes[1]
        paises.append(pais)
        
contagem_paises = {}

for pais in paises:
    if pais in contagem_paises:
        contagem_paises[pais] += 1
    else:
        contagem_paises[pais] = 1

areas = []

for linha in linhas:
    partes = linha.split(',')
    if(len(partes) > 2):
        area = partes[2]
        areas.append(area)
        
contagem_areas = {}

def pesquisaBinaria(nomes, nome):
    inicio = 0
    fim = len(nomes) - 1
    while inicio <= fim:
        meio = (inicio + fim) // 2
        if nomes[meio] == nome:
            return meio
        elif nomes[meio] < nome:
            inicio = meio + 1
        else:
            fim = meio - 1
    return -1

def qiMaisAlto(qis):
    if not qis:
        return None
    indice_mais_alto = 0
    for i in range(1, len(qis)):
        if qis[i] > qis[indice_mais_alto]:
            indice_mais_alto = i
    return indice_mais_alto

def homemMaiorQi(homens, qis, nomes):
    if not homens:
        return None
    indice_mais_alto = 0
    for i in range(1, len(homens)):
        if qis[i] > qis[indice_mais_alto]:
            indice_mais_alto = i
    return homens[indice_mais_alto]

def mulherMaiorQi(mulheres, qis, nomes):
    if not mulheres:
        return None
    indice_mais_alto = 0
    for i in range(1, len(mulheres)):
        if qis[i] > qis[indice_mais_alto]:
            indice_mais_alto = i
    return mulheres[indice_mais_alto]


indice_mais_alto = qiMaisAlto(qis)
if indice_mais_alto is not None:
    qi_mais_alto = qis[indice_mais_alto]
    nome_mais_alto = nomes[indice_mais_alto]
    print(f'A pessoa com maior Qi é {nome_mais_alto} com Qi de {qi_mais_alto} !')
else:
    print("erro")


homem_maior_qi = homemMaiorQi(homens, qis, nomes)
mulher_maior_qi = mulherMaiorQi(mulheres, qis, nomes)
if homem_maior_qi is not None:
    print(f'O homem com maior Qi é {homem_maior_qi} !')
else:
    print("erro")
    
if mulher_maior_qi is not None:
    print(f'A mulher com maior Qi é {mulher_maior_qi} !')
else:
    print("erro")
    
pais_mais_ganhador = max(contagem_paises, key=contagem_paises.get)
print(f'O pais com mais pessoas é {pais_mais_ganhador}!')

area_mais_ganhadora = max(contagem_areas, key=contagem_areas.get)
print(f'A area com mais pessoas é {area_mais_ganhadora}!')
