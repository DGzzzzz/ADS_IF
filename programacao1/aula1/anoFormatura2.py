anoInicio = int(input("Informe o ano de inicio do curso: "))
qtdSemestre = int(input("Informe a quantidade de semestres no curso: "))

anosCurso = qtdSemestre / 2
print(f'O ano de término do curso será {anoInicio + anosCurso}')