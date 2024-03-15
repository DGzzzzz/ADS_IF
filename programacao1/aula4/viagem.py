D = int(input('Distancia da cidade atual '))
L = int(input('Capacidade de litros no tanque '))
podePercorrer = L * 10

R = float(input('Valor em dinheiro '))
P = int(input('Quantidade de postos no trajeto '))
G = float(input('Valor do litro da gasolina '))
if D > podePercorrer:
    print(f'Pode viajar, Sobrou R${R}')
    if podePercorrer < D:
        faltaKM = D - podePercorrer
        valorAbastecer = faltaKM * G
        valorSobra = R - valorAbastecer
        if valorSobra > 0:
            print(f'Pode viajar, Sobrou R${valorSobra:0.2f}')
else:
    print('Não pode viajar')
