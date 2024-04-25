while True:
    name = input("Nome: ")
    password = input("Senha: ")
    if name != password:
        print("Entrando...")
        break
    else:
        print("Erro")
