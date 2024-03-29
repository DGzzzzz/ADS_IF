import random
numeroPC = random.randint(1, 10)
numeroPessoa = int(input("Tenta acertar o numero que a maquina sorteou entre 1 a 10: "))

if numeroPessoa == numeroPC:
    print("Acertou")
else:
    print("Errou")