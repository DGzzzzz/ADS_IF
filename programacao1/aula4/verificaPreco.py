vlrProd = float(input("Qual o valor do produto: "))

match vlrProd:
    case vlrProd if vlrProd > 50.00:
        print(f'O valor do produto passou da faixa de isenção de R$50,00. Por isso deverá ser aplicado uma taxa de 60%, o valor do produto ficando em R${vlrProd * 1.60:0.2f}')
    case _:
        print(f'O valor do produto não sofrerá ajuste pela taxa, ficando apenas R${vlrProd:0.2f}')