def vogal(palavra):
    soma = 0
    for i in palavra:
        if i in "aeiou":
            soma+=1   
    return soma        
print(vogal("java"))
