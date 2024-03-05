kgPeixe = float(input("Digite o kg do peixe: "))
excesso = kgPeixe - 50
multa = excesso * 4

print(f'Como o peixe excedeu {excesso:0.2f}KG o valor da multa fica em R${multa:0.2f}')