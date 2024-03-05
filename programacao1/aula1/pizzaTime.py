qtdPessoas = int(input("Quantas pessoas vão comer? "))
qtdFatias = int(input("Quantidade de fatias por pessoa: "))

print(f'Se as {qtdPessoas} pessoas comer {qtdFatias} pedaços cada, terá que pedir {qtdPessoas * qtdFatias / 12:.0f} pizzas')
