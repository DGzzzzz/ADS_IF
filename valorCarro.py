def quantidades(km, dias):
    km = int(input("Digite a quantidade de km percorridos: "))
    dias = int(input("Digite a quantidade de dias que o carro foi alugado: "))
    return km, dias

def caculaValorTotal(km, dias):
    valor = (60 * dias) + (0.15 * km)
    return valor

def imprimeResultado(valor):
    print(f'O valor total a ser pago é de R$ {valor:.2f}')

imprimeResultado(caculaValorTotal(*quantidades(0, 0)))