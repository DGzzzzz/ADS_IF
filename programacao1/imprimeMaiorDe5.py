maior = 0
numero = 0
cont = 0
while cont < 5:
    numero = int(input())
    if numero > maior:
        maior = numero
    cont+=1    
print(maior)
