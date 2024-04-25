# utilizado estrutura de repetição for com função range() para que o numero de 1 ate 100 seja armazenado em i
for i in range(1, 101): 
  if i % 3 == 0 and i % 5 == 0: # verifica se o numero que foi colocado em i é divisivel por 3 e por 5, se por acaso não for por um dos dois, ele cai para o elif e assim por diante
    print("FizzBuzz")
  elif i % 3 == 0:
    print("Fizz")
  elif i % 5 == 0:
    print("Buzz")
  else: # o else tem a função de imprimir todos osnumeros que não são divisiveis nem por 3 nem por 5, imprimindo o numero armazenado em i
    print(i)
