import bclib

def converteRealParaDolar(valorReal):
    valorDolar = valorReal / bclib.getTaxa()
    return valorDolar

valorReal = float(input('Digite o valor que você tem em reais: '))
valorConvertido = converteRealParaDolar(valorReal)
print(f'O valor convertido em dolar ficou em {valorConvertido:.2f}')