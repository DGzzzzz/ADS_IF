import random
# função para jogar uma carta aleatoria, com valor de 1 ao 4
def jogar_carta():
  return random_randint(1, 4)
# função com a logica do jogo 21
def jogar_jogo():
  pontos_jogador = 0
  pontos_pc = 0
# estrutura de repetição, onde enquanto verdade, da carta ao jogador e ao computador
  while True:
    carta_jogador = jogar_carta() # variavel que recebe uma carta aleatoria com valor de 1 a 4
    pontos_jogador += carta_jogador # aqui ele recebe a informação do valor da carta recebida e soma no contador do jogador
    print(f'Você ganhou a carta com valor {carta_jogador} sua pontuação atual é {pontos_jogador}')
# verifica se a soma das cartas é maior que 21
    if pontos_jogador > 21:
      print("Você ultrapassou 21 pontos, o computador venceu")
      break
# verifica se a soma das cartas é igual a 21            
    if pontos_jogador == 21:
      print("21. Você ganhou")     
      break
# após logica do jogador, se repete para a mão do computador    
    carta_pc = jogar_carta()
    pontos_pc += carta_pc
    print(f'Você ganhou a carta com valor {carta_pc} sua pontuação atual é {pontos_pc}')

    if pontos_pc > 21:
      print("O computador ultrapassou 21 pontos, o jogador venceu")
      break
    if pontos_pc == 21:
      print("21. Computador ganhou")     
      break
# chama função assim que executa o código. Para iniciar o jogo.      
jogar_jogo()      
