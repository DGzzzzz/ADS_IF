idade = int(input('Quantos anos você tem? '))
titulo = input('Você tem título de eleitor? S/N  ')

if idade >= 16 and titulo == 'S':
    print('Você pode votar')
else:
    print('Você ainda não pode voltar')