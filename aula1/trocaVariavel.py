A = int(input("Digite um número: "))
B = int(input("Digite outro número: "))

memoria = A
A = B
B = memoria

print(f"Valor de A: {A} \nValor de B: {B}")