def verificaTriangulo(a, b, c):
    if (a+b >= c) and (b+c >= a) and (c+a >= b):
        return True
    else:
        return False
def dizTriangulo(a, b, c):
    if a == b and b == c:
        return "equilatero"
    elif a != b != c:
        return "escaleno"
    else:
        return "isosceles"

lado1 = float(input('Digite o lado 1: '))
lado2 = float(input('Digite o lado 2: '))
lado3 = float(input('Digite o lado 3: '))

if verificaTriangulo(lado1, lado2, lado3):
    print(dizTriangulo(lado1, lado2, lado3))
else:
    print('Não é um triangulo')

