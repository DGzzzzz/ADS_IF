def calculaArea(base, altura):
    area = base * altura
    return area

base = float(input())
altura = float(input())

areaRetangulo = calculaArea(base, altura)
print(f'A Area desse retangulo é: {areaRetangulo}')