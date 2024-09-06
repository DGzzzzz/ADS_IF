# lista = ["banana", "maçã", "uva", "abacaxi", "laranja"]

# def ordena_lista(lista):
#     n = len(lista)
#     if n > 1:
#         meio = n // 2
#         listaDaEsquerda = lista[:meio]
#         listaDaDireita = lista[meio:]
#         ordena_lista(listaDaEsquerda)
#         ordena_lista(listaDaDireita)
#         i = j = k = 0
#         while i < len(listaDaEsquerda) and j < len(listaDaDireita):
#             if listaDaEsquerda[i] < listaDaDireita[j]:
#                 lista[k] = listaDaEsquerda[i]
#                 i += 1
#             else:
#                 lista[k] = listaDaDireita[j]
#                 j += 1
#             k += 1
#         while i < len(listaDaEsquerda):
#             lista[k] = listaDaEsquerda[i]
#             i += 1
#             k += 1
#         while j < len(listaDaDireita):
#             lista[k] = listaDaDireita[j]
#             j += 1
#             k += 1
#     return lista

# print(ordena_lista(lista))

lista = ["banana", "maçã", "uva", "abacaxi", "laranja"]

def ordena_lista(lista):
    n = len(lista)
    if n > 1:
        meio = n // 2
        listaDaEsquerda = lista[:meio]
        listaDaDireita = lista[meio:]
        
        ordena_lista(listaDaEsquerda)
        ordena_lista(listaDaDireita)
        
        i = j = k = 0
        
        while i < len(listaDaEsquerda) and j < len(listaDaDireita):
            if listaDaEsquerda[i] < listaDaDireita[j]:
                lista[k] = listaDaEsquerda[i]
                i += 1
            else:
                lista[k] = listaDaDireita[j]
                j += 1
            k += 1
        
        # Copia os elementos restantes
        lista[k:] = listaDaEsquerda[i:] or listaDaDireita[j:]
        
    return lista

print(ordena_lista(lista))

#Marge Sort
# Esse algoritmo tem complexidade O(n log n) no pior caso, pois ele divide a lista em duas partes e ordena cada uma delas