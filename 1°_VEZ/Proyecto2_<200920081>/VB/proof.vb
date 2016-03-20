Import principal.abap
Import cabecera.cab
Import pagina1.pag

Void Imprimir(){
	Write(Get_Value(A3()))
	Write(Get_Value(A4(a5,b4,gt6)))
	Write(Get_Value(A5))
}
Void Imprimir1(){
	Call ConvertirValores()
}
Void main(){
Crear_Cabecera(cabecera.cab)
Crear_Pagina(pagina1.pag)
Imprimir2()
}