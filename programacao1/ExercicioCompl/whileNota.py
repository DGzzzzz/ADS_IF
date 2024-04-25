while True:
    nota = int(input("Insira um valor de 0 a 10: "))
    if 0 <= nota <= 10:
        print(nota)
        break
    else:
        print("Informe valor válido")