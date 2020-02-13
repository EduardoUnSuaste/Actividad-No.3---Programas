# Operaciones 
def suma(a, b):
   return a + b

def resta(a, b):
   return a - b

def multiplicacion(a, b):
   return a * b

def division(a, b):
   if b == 0:
      return "Error: Division entre cero..."
   else:
      return a / b
def default():
   return "Opcion Invalida"

#Control   
def switch(case, a, b):
   sw = {
      1: suma(a, b),
      2: resta(a, b),
      3: multiplicacion(a, b),
      4: division(a, b),
   }
   return sw.get(case, default())


#MENU Principal
def menu():
   print("----------- Calculadora -----------")
   print("1. Suma")
   print("2. Resta")
   print("3. Multiplicacion")
   print("4. Division")
   print("-----------------------------------")
#pedir los numeros   
a = int(input("Valor de a: "))
b = int(input("Valor de b: "))
#seleccionar la opcion el el switch
menu()
case = int(input("Seleccione una opcion: "))
print("el resultado es: ",switch(case, a, b))


