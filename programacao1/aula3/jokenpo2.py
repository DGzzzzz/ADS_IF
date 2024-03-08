import random

jogador = int(input("[1]Pedra: [2]Papel: [3]Tesoura:"))
computador = random.randint(1, 3)
print(computador)

if jogador == computador:
    print("EMPATE")
elif (computador == 1 and jogador == 3) or (computador == 2 and jogador == 1) or (computador == 3 and jogador == 2):
    print("Computador venceu")
else:
    print("Jogador Venceu")