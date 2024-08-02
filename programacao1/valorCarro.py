## função coleta as quantidades de km e dias
def quantidades(km, dias):
    km = int(input("Digite a quantidade de km percorridos: "))
    dias = int(input("Digite a quantidade de dias que o carro foi alugado: "))
    return km, dias

## função que calcula o valor total a ser pago
def caculaValorTotal(km, dias):
    valor = (60 * dias) + (0.15 * km)
    return valor

## função que imprime o valor total a ser pago
def imprimeResultado(valor):
    print(f'O valor total a ser pago é de R$ {valor:.2f}')

imprimeResultado(caculaValorTotal(*quantidades(0, 0)))

#commit