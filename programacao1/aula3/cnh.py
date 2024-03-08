anoNasc = int(input('Em que ano você nasceu? '))
anoAtual = int(input('Informe o ano atual: '))
idade = anoAtual - anoNasc
print(f'Sua idade é {idade}')

if idade >= 18:
    print('Você pode ter CNH')
else:
    print('Você ainda não pode ter CNH.')

