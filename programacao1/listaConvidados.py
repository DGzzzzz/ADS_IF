convidados = []

def novoConvidado():
    nome = input("Digite o nome do convidado: ")
    convidados.append(nome)

def removerConvidado():
    nome = input("Digite o nome do convidado: ")
    convidados.remove(nome)

def listarConvidados():
    print("Lista de convidados:")
    for convidado in convidados:
        print(convidado)

def contarConvidados():
    print("Quantidade de convidados: ", len(convidados))

def menu():
    print("1 - Novo convidado")
    print("2 - Remover convidado")
    print("3 - Listar convidados")
    print("4 - Contar convidados")
    print("0 - Sair")

while True:
    menu()
    opcao = input("Digite a opção desejada: ")
    if opcao == "1":
        novoConvidado()
    elif opcao == "2":
        removerConvidado()
    elif opcao == "3":
        listarConvidados()
    elif opcao == "4":
        contarConvidados()
    elif opcao == "0":
        break
    else:
        print("Opção inválida")


