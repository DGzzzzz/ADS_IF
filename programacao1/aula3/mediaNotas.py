print('Digite as notas do aluno para calcularmos a média.')
n1 = float(input('Nota 1: '))
n2 = float(input('Nota 2: '))
n3 = float(input('Nota 3: '))
n4 = float(input('Nota 4: '))

media = (n1 + n2 + n3 + n4) / 4
print(f'Sua media é {media}')

if media >= 6:
    print('Aprovado')
else:
    print('Reprovado')
