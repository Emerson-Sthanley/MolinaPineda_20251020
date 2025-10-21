/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MolinaPineda_20251020;

/**
 *
 * @author UFG
 */
public class Pila {
    
    private int [] elementos;
    private int cima;
    private int capacidad;
    
    //METODO CONSTRUCTOR DE LA CLASE PILA
    //AL INSTANCIAR UNA NUEVA VARIABLE DE TIPO PILA, ENTONCES 
    //SE CREARA EN MEMORIA UN OBJETO CON LOS ATRIBUTOS QUE ESTAN
    //DENTOR DE ESTE CONSTRUCTOR
    
    public Pila(int tamano){
        
        
        this.capacidad = tamano;//CANTIDAD DE ELEMENTOS UQE SE VAN A ALAMACENAR EN LA PILA 
        this.elementos = new int [this.capacidad];//SE CREA UN NUEVO ARREGLO DE TIPO ENTERO
        this.cima = -1;//EL VALOR POR DEFECTO DE LA CIMA ES -1
    }
    
    //METODO PARA VERIFICAR SI LA PILA ESTA VACIA , ES DECIR, SI NO HAY ELEMENTOS 
    //O VALORES APILADOS 
    public boolean estaVacia(){
    
        if (this.cima == -1){
            //EL VALOR DE LA CIMA ES -1 POR LO TANTO, LA PILA ESTA VACIA  
            return true;
        }else { //
            //EL VALOR DE LA CIMA ES UN NUMERO DIFERENTE DE -1 POR LO TANTO
            //LA PILA SI TIENE ALMENOS UN ELEMENTO O VALOR
            return false;
        }
        
    }
    
    //METODO PARA VERIFICAR SI LA PILA ESTA LLENA, DE ESTA MANERA TOMA RLA DECISION 
    //DE NO SEGUIR ALMACENANDO VALORES
    public boolean estaLlena(){
    
    if(this.cima == (this.capacidad -1) ){
    
        return true;
    }else{
        return false;
    }
    
    }
    
    //SE DEVUELVE EL VALOR DE LA CIMA , ES DECIR EL VALOR EL ULTIMO ELEMENTO
    //QUE FUE INSERTADO AL ARREGLO
    public int tamano(){
        return this.cima +1;
    }
    //METODO PARA AGREGAR ELEMENTOS AL ARREGLO, ES DECIR A LA PILA
    //PRIMERO SE DEBE REALIZAR LA VERIFICACIÓN DEL TAMAÑO DE LA PILA 
    //UNA VEZ VERIFICADA SE PUEDE AGREGAR EL ELEMENTO AL ARREGLO
    public void push(int elemento){
        //PRIMERO SE VERIFICA SI LA PILA ESTA LLENA
        if(estaLlena()){
            System.out.println("La pila esta llena, no se puede agregar el valor: "+elemento);
            //return
        }else{
            this.cima++; //SE INCREMENTA EL VALOR DE LA CIMA
            this.elementos[this.cima] = elemento;//SE AGREGA EL NUEVO ELEMENTO AL ARREGLO (A LA PILA)
            System.out.println("El valor : "+elemento+ " fue agregado a la pila");
        }
    }
    
    //METODO PARA EXTRAER UN ELEMENTO DE LA PILA (EL ULTIMO QUE HA SIDO INSERTADO AL ARREGLO)
    public int pop(){
        //SE VERIFICA QUE LA PILA, NO ESTE VACIA PARA EXTRAER UN ELEMENTO
        if(estaVacia()){
            //SI ESTA VACIA, POR LO TANTO, SE NOTIFICA AL USUARIO
            System.out.println("La pila esta vacia, no se puede hacer la extracion del elemento");
            //NO SE REALIZA NINGUNA ACCIÓN
           return -1;
        }else{
            //SI
            int elementoExtraido = this.elementos[this.cima];
            this.cima--;
            return elementoExtraido;
            
        }
    }
    
    public int peek(){
        if(estaVacia()){
            System.out.println("La pila esta vacia ");
            return -1;
            
        }else{
            return this.elementos[this.cima];
            
        }
    }
    //METODO PARA IMPRIMIR LOS CALORES QUE POSEE UNA PILA, ES DECIR
    //IMPRIMIR TODOS LOS VALORES DEL ARREGLO, DESDE EL ULTIMO QUE FUE
    //AGREGADO, HASTA EL PIMERO (EN ESE ORDEN)
    public void mostrar(){
        //SE VERIFICA QUE LA PILA NO ESTE VACIA
        if(estaVacia()){
            //SI ESTA VACIA , POR LO TANTO NO SE REALIZA NADA 
            System.out.println("La pila esta vacia");
        }else{
            //SE IMPIRME LA SALIDA AL USUARIO
            System.out.println("Contenido de la pila (desde la cima, hasta la base de la pila)");
            //SE INICIA UNA ESTRUCTURA CON CORCHETE ({)
            System.out.println("{");
            //SE DEBE RECORRE EL ARREGLO DE LA PILA PARA PODER IMPRIMIR CADA VALOR
            //EN LA ESTRUCTURA ITERATIVA QUE INCIA DESDE EL VALOR DE LA CIMA, ES DECIR 
            //DESDE LA ULTIMA POCISIÓN AGREGADA AL ARREGLO, MIENTRAS EL VALOR DE "i" SEA
            //MAYOR QUE CERO (ES DECIR QUE AUN NO HA LLEGADO A LA BASE DE LA PILA ), EL VALOR 
            //DE "i" ESTARA EN DECREMENTO HASTA LLEGAR A CERO
            for (int i =this.cima; i >=0; i--){
                //SE IMPRIME CADA VALOR EN SU POSICIÓN CORRESPONDIENTRE DE MANERA CONTINUA (SIN SALTOS DE LINEA)
                System.out.print(this.elementos[i]);
                //SE VERIFICA SI EL VALOR DE "i" ES MAYOR QUE CERO PARA PODER IMPRIMIR UN CARAC TER
                if (i> 0){
                    //"i" NO HA LLEGADO A CERO, POR LO TANTO, SE PUEDE IMPRIMIR UNA COMA
                    System.out.print(" , ");//SE IMPRIME UNA COMA
                }
            }
            
        }
                    //SE CIERRA LA ESCTRUCTURA DELCORCHETE 
                    System.out.println("}");

    }

    
}
