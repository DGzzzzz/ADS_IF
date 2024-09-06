# lista = ["banana", "maçã", "uva", "abacaxi", "laranja"]

lista = []
for i in range(1, 6):
    item = input("Digite uma fruta: ")
    lista.append(item)

def ordena_lista(lista):
    n = len(lista)
    for i in range(n-1):
        min_index = i
        for j in range(i+1, n):
            if lista[j] < lista[min_index]:
                min_index = j
        lista[i], lista[min_index] = lista[min_index], lista[i]    
        # if lista[i] > lista[min_index]:
        #     aux = lista[i]
        #     lista[i] = lista[min_index]
        #     lista[min_index] = aux
    return lista

print(ordena_lista(lista))    

# Selection Sort
# Esse algoritmo tem complexidade O(n^2) no pior caso ou medio caso. Pois ele sempre vai percorrer a lista inteira
# Para melhorar utilizar outro algoritmo de ordenação, como o merge sort, quick sort, etc.