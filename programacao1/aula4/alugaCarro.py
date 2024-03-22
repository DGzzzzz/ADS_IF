qtdDias = int(input("Por quantos dias você alugou o carro? "))
qtdKMr = int(input("Quantos KM rodados nesse tempo? "))

if qtdKMr > 100:
    taxa = (qtdKMr - 100) * 12
    valorDiaria = (qtdDias * 90)
    print(f'Valor total a pagar: R${valorDiaria + taxa}')
else:
    valorDiaria = qtdDias * 90
    print(f'Valor total a pagar: R${valorDiaria}')

