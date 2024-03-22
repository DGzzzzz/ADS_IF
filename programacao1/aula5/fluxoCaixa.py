pastelCarne = int(input("Quantos pasteis de carne foram vendidos? "))
pastelFrango = int(input("Quantos pasteis de frango foram vendidos? "))
legumes = int(input("Quantos legumes foram vendidos? "))

valorCustoCarne = pastelCarne * 2.50
valorCustoFrango = pastelFrango * 1.50
valorCustoLegumes = legumes * 2

valorTotalCarne = (pastelCarne * 8) - valorCustoCarne
valorTotalFrango = (pastelFrango * 7) - valorCustoFrango
valorLegumes = (legumes * 6.50) - valorCustoLegumes

valorTotalTotal = valorTotalCarne + valorTotalFrango + valorLegumes
print(f'o valor total das vendas menos o custo ficou R${valorTotalTotal:.2f}')