user = input("Digite seu usuário: ")
password = input("Digite sua senha: ")

if user == 'admin' and password == '123':
    print("Fazendo login...")
else:
    print("Usuário e/ou senha incorretos")