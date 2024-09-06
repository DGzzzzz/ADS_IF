lista = []

for i in range(1, 11):
    item = int(input("Digite um número: "))
    lista.append(item)

                                                           
def ordena_lista(lista):
    n = len(lista)                                         
    for i in range(n):
        trocou = False  # variável para verificar se houve troca                                
        for j in range(n-1 - i):    # n-1 para não ultrapassar o limite da lista                      
            if lista[j] > lista[j+1]:                      
                lista[j], lista[j+1] = lista[j+1], lista[j]
                trocou = True
        if not trocou:  # se não houve troca, a lista já está ordenada
            break        
    return lista            

print(ordena_lista(lista))

# Esse algoritmo tem complexidade O(n^2) no pior caso, caso a lista esteja ordenada de forma decrescente. 
# E O(n) no melhor caso, caso a lista já esteja ordenada, pois break'amos ele se nao há nenhuma troca. 
