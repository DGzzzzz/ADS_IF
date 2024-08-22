package main

import (
	"fmt"
)

func PesquisaLinear(lista []int, chave int) []int {
	var listaAchados []int
	for i := 0; i < len(lista); i++ {
		if lista[i] == chave {
			listaAchados = append(listaAchados, i)
		}
	}
	return listaAchados
}

func main() {
	lista := []int{1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 5, 9, 10}
	chave := 5
	resultado := PesquisaLinear(lista, chave)
	fmt.Println("Índices encontrados: ", resultado)
}
