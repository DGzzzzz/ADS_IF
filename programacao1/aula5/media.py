def mediaFinal(n1,n2):
    media = (n1+n2)/2
    return media

n1 = 10
n2 = 5

mediap = mediaFinal(n1, n2)
print(f'a Média desta avaliação foi {mediap}')

if mediaFinal(n1, n2) >= 6:
    print("Aprovado")
else:
    print("Reprovado")