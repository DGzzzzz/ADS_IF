def get_name():
    name = input("Nome: ")
    while len(name) < 4:
        print("Minimo de 4 caracteres")
        name = input("Nome: ")
    return name
def get_age():
    age = int(input("Idade: "))
    while 0 < age > 150:
        print("Idade inválida")
        age = int(input("Idade: "))
    return age

def get_pay():
    pay = float(input("Salário: "))
    while pay < 0:
        print("Salário inválido")
        pay = float(input("Salário: "))
    return pay

def get_sex():
    sex = input("Sexo: (M) ou (F)").upper()
    while sex != "M" and sex != "F":
        print("Entrada inválida")
        sex = input("Sexo: (M) ou (F)").upper()
    return sex

name = get_name()
age = get_age()
pay = get_pay()
sex = get_sex()

print(name, age, pay, sex)