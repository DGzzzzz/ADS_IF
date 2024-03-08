mao1 = input('pedra, papel ou tesoura: ')
mao2 = input('pedra, papel ou tesoura: ')

if mao1 == 'pedra' and mao2 == 'tesoura':
    print(f'{mao1} venceu')
if mao1 == 'pedra' and mao2 == 'papel':
    print(f'{mao2} venceu')
if mao1 == 'papel' and mao2 == 'tesoura':
    print(f'{mao2} venceu')
if mao1 == 'papel' and mao2 == 'pedra':
    print(f'{mao1} venceu')
if mao1 == 'tesoura' and mao2 == 'papel':
    print(f'{mao1} venceu')
if mao1 == 'tesoura' and mao2 == 'pedra':
    print(f'{mao2} venceu')



