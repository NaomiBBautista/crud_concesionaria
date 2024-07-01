package peyoo_1p_proyecto;//Paquete 
import java.util.Scanner;//Scanner
public class PEyOO_1P_Proyecto 
{
    //Main
    public static void main(String[] args) 
    {
        Autos[] autitos=new Autos[15]; //Crear el arreglo del objeto
        int opcion, n=10;
        do
        {
            opcion=Menu();//Mostrar el menu con opciones
            Datos(autitos); //Precarga de datos
            switch (opcion)
            {
                case 1->
                { 
                    //Agregar un nuevo auto
                    autitos[n]= new Autos(); //Crear un nuevo elemnto en el arreglo
                    AgregarAuto(autitos, n); //Implementar metodo para agregar los atributos
                    n++; //Valor de la posicion dek arreglo
                }
                
                case 2->
                {
                    //Eliminar un autos
                    int encontrado=EliminarAuto(autitos, n); //Implementar el metodo que busca el auto
                    autitos[encontrado].setEstado(false);//Cambiar el estado del vehiculo seleccionado
                } 

                case 3->
                {
                    //Imprimir ordenado
                    long inicio=System.currentTimeMillis();//Iniciar el conteo de duracion
                    ordenamientoBurbuja(autitos, n);//Implementar metodo burbuja
                    long fin=System.currentTimeMillis();//Conteo de duracion del metodo
                    long total=fin-inicio;//Sacar el valor de la duracion
                    System.out.println("El Método tardó " + total + " milisegundos en ejecutarse");
                    
                }

                case 4->
                {
                    //Imprimir ordenado
                    long inicio=System.currentTimeMillis();//Iniciar el conteo de duracion
                    ordenamientoSeleccion(autitos, n);//Implementar el metodo de seleccion
                    long fin=System.currentTimeMillis();//Conteo de duracion del metodo
                    long total=fin-inicio;//Sacar el valor de la duracion
                    System.out.println("El Método tardó " + total + " milisegundos en ejecutarse");
                    
                }

                case 5->
                {
                    //Imprimir ordenado
                    long inicio=System.currentTimeMillis();//Iniciar el conteo de duracion
                    ordernamientoInsercion(autitos, n);//Implementar el metodo de inserccion
                    long fin=System.currentTimeMillis();//Conteo de duracion del metodo
                    long total=fin-inicio;//Sacar el valor de la duracion
                    System.out.println("El Método tardó " + total + " milisegundos en ejecutarse");
                    
                }
            }
        }
        while(opcion != 6);//Condicion para salir del menu
        
    }
    
    
    //Metodo que muestra el menu con las opciones de las funciones que pueden hacerse
    public static int Menu()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("\n\tBIENVENIDO A LA CONSECIONARÍA DANM");
        System.out.println("\n-----------------------------------------------------------------------");
        System.out.println("\n01 AGREGAR AUTO");
        System.out.println("02 ELIMINAR AUTO");
        System.out.println("03 MOSTRAR INVENTARIO ORDENADO POR EL MÉTODO BURBUJA");
        System.out.println("04 MOSTRAR INVENTARIO ORDENADO POR EL MÉTODO DE SELECCIÓN DIRECTA");
        System.out.println("05 MOSTRAR INVENTARIO ORDENADO POR EL MÉTODO DE INSERCIÓN DIRECTA");
        System.out.println("06 SALIR");
        System.out.println("\n-----------------------------------------------------------------------");
        System.out.println("\nPor favor ingrese la opción de lo que desea hacer");
        int opcion=input.nextInt();
        if(opcion<1 || opcion>6)//Condicion que valide que la opcion ingresada es valida
            System.out.println("Opción invalida,vuelva a intentarlo");
        return opcion;
    }//fin del metodo
    
    
    //Precarga de Datos
    public static void Datos(Autos[] a)
    {
        a[0] = new Autos(); a[0].setAño(2004);a[0].setColor("Vino");a[0].setDueño("Joana Marcus");a[0].setMarca("Ford");a[0].setModelo("F-150");a[0].setPlacas(156687);
        a[1] = new Autos(); a[1].setAño(2000);a[1].setColor("Azul");a[1].setDueño("Martín Velázquez");a[1].setMarca("Nissan");a[1].setModelo("Sentra");a[1].setPlacas(159735);
        a[2] = new Autos(); a[2].setAño(1997);a[2].setColor("Negro");a[2].setDueño("Juan Maldonado");a[2].setMarca("Hyundai");a[2].setModelo("Veloster");a[2].setPlacas(865475);
        a[3] = new Autos(); a[3].setAño(2020);a[3].setColor("Gris");a[3].setDueño("Elizabeth Camarillo");a[3].setMarca("VW");a[3].setModelo("Jetta");a[3].setPlacas(493475);
        a[4] = new Autos(); a[4].setAño(2023);a[4].setColor("Blanco");a[4].setDueño("Marco Bueno");a[4].setMarca("Nissan");a[4].setModelo("March");a[4].setPlacas(307964);
        a[5] = new Autos(); a[5].setAño(2016);a[5].setColor("Marino");a[5].setDueño("Alberto Barron");a[5].setMarca("Toyota");a[5].setModelo("Etios");a[5].setPlacas(397604);
        a[6] = new Autos(); a[6].setAño(2012);a[6].setColor("Dorado");a[6].setDueño("Saul Vazquéz");a[6].setMarca("Renault");a[6].setModelo("Kwid");a[6].setPlacas(193048);
        a[7] = new Autos(); a[7].setAño(2018);a[7].setColor("Blanco");a[7].setDueño("Abel Martínez");a[7].setMarca("Fiat");a[7].setModelo("Mobi");a[7].setPlacas(348610);
        a[8] = new Autos(); a[8].setAño(2021);a[8].setColor("Verde");a[8].setDueño("Fernanda Piza");a[8].setMarca("Ford");a[8].setModelo("KA");a[8].setPlacas(569301);
        a[9] = new Autos(); a[9].setAño(2010);a[9].setColor("Amarillo");a[9].setDueño("Jovana Juaréz");a[9].setMarca("Audi");a[9].setModelo("Allroad");a[9].setPlacas(679045);
    }//fin del metodo
    
    
    //Metodo que agrega un nuevo auto al arreglo a traves de los metodos de mutacion
    public static void AgregarAuto(Autos[] a, int n)
    {
        Scanner input=new Scanner(System.in);//Scanner
        System.out.println("\n-----------------------------------------------------------------------");
        System.out.println("\nPor favor ingrese los datos que se solicitan");
        System.out.println("\nNúmero de Placas del Vehículo:");
        a[n].setPlacas(input.nextInt());
        System.out.println("\nAño en 4 dígitos del Vehículo:");
        a[n].setAño(input.nextInt());
        System.out.println("\nColor del Vehículo:");
        a[n].setColor(input.next());
        System.out.println("\nMarca del Vehículo:");
        a[n].setMarca(input.next());
        System.out.println("\nModelo del Vehículo");
        a[n].setModelo(input.next());
        System.out.println("\nNombre del ultimo dueño del Vehículo");
        a[n].setDueño(input.next());  
    }//fin del metodo
    
    
    //Metodo que busca las placas del vehiculo y las compara con las del arreglo
    public static int EliminarAuto(Autos[] a, int n)
    {
        Scanner input=new Scanner(System.in);//Scanner
        int encontrado=456;
        do 
        {
            System.out.println("\n-----------------------------------------------------------------------");
            System.out.println("Por favor ingrese el número de placas del Vehículo");
            int numero=input.nextInt();//Numero de placas a encontrar
 
            for (int i = 0; i < n; i++)//Ciclo para buscar en el arreglo
            {
                if (numero==a[i].getPlacas())//Condicion que va comparando el numero hasta encontrarlo
                {
                    System.out.println("Vehículo encontrado con exito");
                    encontrado = i;
                }
                else 
                {
                }
            }
            if (encontrado == 456)
            {
                System.out.println("Vehículo no encontrado en el inventario");
            }
        } 
        while (encontrado == 456);
        return encontrado;//Regresa el valor de la posicion en la que se encuentra las placas encontradas
    }//fin del metodo


    //Metodos de Ordenamiento
    //Burbuja
    public static void ordenamientoBurbuja(Autos[] autitos, int n) 
    {
        int comparaciones=0, intercambios=0;
        for (int i = 0; i < n-1; i++) //Primer ciclo
        {
            for (int j = 0; j < n-i-1; j++) //Segundo ciclo
            {
                comparaciones++;//Variable que cuenta el numero de comparaciones
                if (autitos[j].getPlacas() > autitos[j+1].getPlacas()) 
                {
                    intercambios++;//Variable que cuenta el numero de intercambios realizados
                    //Intercambio de posiciones
                    Autos temp = autitos[j];
                    autitos[j]=autitos[j+1];
                    autitos[j+1]=temp;
                }
            }
        }//fin del metodo

        //Impresion de los datos en forma de tabla
        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\nLista de autos ordenados por número de placas por el Método de ordenamiento Burbuja");
        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("\nPlaca\t\tMarca\t\t\tModelo\t\t\tAño\t\t\tColor\t\t\tUltimo Dueño");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(autitos[i].getPlacas() + "\t\t");

            System.out.print(autitos[i].getMarca()  + "\t\t\t");
            
            System.out.print(autitos[i].getModelo() + "\t\t\t");

            System.out.print(autitos[i].getAño()  + "\t\t\t");
            
            System.out.print(autitos[i].getColor()  + "\t\t\t");

            System.out.println(autitos[i].getDueño()+ "\t\t\t");

            System.out.println(" ");
        }
        
        //Imprimir datos de estadisticas
        System.out.println("\n-----------------------------------------------------------------------");
        System.out.println("\nEl número de Comparaciones fue: "+ comparaciones);
        System.out.println("El Numero de intercambios fue: " + intercambios);
        
    }//fin del metodo

    
    //Selección directa
    public static void ordenamientoSeleccion(Autos[] autitos, int n) 
    {
        int comparaciones=0, intercambios=0;
        for (int i = 0; i < n-1; i++) //Primer ciclo
        {
            int aux = i;//Variable auxiliar para la posicion del arreglo
            for (int j = i + 1; j < n; j++) //Segundo ciclo
            {
                comparaciones++;//Variable que cuenta el numero de comparaciones
                if (autitos[j].getPlacas() < autitos[aux].getPlacas()) //Comparacion del numero de placas
                {
                    aux = j;//Cambiar valor de la posicion del arreglo
                }
            }
            if (aux != i)//Condicion si es mayor
            {
                intercambios++;//Variable que cuenta el numero de intercambios realizados
                //Intercambio de posiciones
                Autos temp = autitos[aux];
                autitos[aux]=autitos[i]; 
                autitos[i]=temp;
            }
        }
        
        //Impresion de los datos en forma de tabla
        System.out.println("\n--------------------------------------------------------------------------------------------------");
        System.out.println("\nLista de autos ordenados por número de placas por el Método de ordenamiento de Selección Directa");
        System.out.println("\n--------------------------------------------------------------------------------------------------");
        System.out.println("\nPlaca\t\tMarca\t\t\tModelo\t\t\tAño\t\t\tColor\t\t\tUltimo Dueño");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(autitos[i].getPlacas() + "\t\t");

            System.out.print(autitos[i].getMarca()  + "\t\t\t");
            
            System.out.print(autitos[i].getModelo() + "\t\t\t");

            System.out.print(autitos[i].getAño()  + "\t\t\t");
            
            System.out.print(autitos[i].getColor()  + "\t\t\t");

            System.out.println(autitos[i].getDueño()+ "\t\t\t");

            System.out.println(" ");
        }
        //Imprimir datos de estadisticas
        System.out.println("\n------------------------------------------------------------");
        System.out.println("El Número de Comparaciones fue: "+ comparaciones);
        System.out.println("El Número de intercambios fue: " + intercambios);
    }//fin del metodo

    
    //Inserción directa
    public static void ordernamientoInsercion(Autos[] autitos, int n) 
    {
        int comparaciones=0, intercambios=0;
        for (int i = 1; i < n; i++) //Primer ciclo
        {
            Autos aux = autitos[i];//Variable que almacena todos los atributos del arreglo
            int j = i - 1;//Variable menor a i
            while (j >= 0 && autitos[j].getPlacas() > aux.getPlacas()) //Segundo ciclo
            {
                comparaciones++;//Variable que cuenta el numero de comparaciones
                intercambios++;//Variable que cuenta el numero de intercambios realizados
                //Intercambio de posiciones
                autitos[j+1]=autitos[j];
                j--;
            }
            //Intercambio de posiciones
            autitos[j+1]=aux;
        }

        //Impresion de los datos en forma de tabla
        System.out.println("\n--------------------------------------------------------------------------------------------------");
        System.out.println("Lista de autos ordenados por número de placas por el Método de ordenamiento de Inserción directa");
        System.out.println("\n--------------------------------------------------------------------------------------------------");
        System.out.println("\nPlaca\t\tMarca\t\t\tModelo\t\t\tAño\t\t\tColor\t\t\tUltimo Dueño");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(autitos[i].getPlacas() + "\t\t");

            System.out.print(autitos[i].getMarca()  + "\t\t\t");
            
            System.out.print(autitos[i].getModelo() + "\t\t\t");

            System.out.print(autitos[i].getAño()  + "\t\t\t");
            
            System.out.print(autitos[i].getColor()  + "\t\t\t");

            System.out.println(autitos[i].getDueño()+ "\t\t\t");

            System.out.println(" ");
        }
        //Imprimir datos de estadisticas
        System.out.println("\n-------------------------------------------------------------------"); 
        System.out.println("El Número de Comparaciones realizadas fue: "+ comparaciones);
        System.out.println("El Número de Intercambios realizados fue: " + intercambios);
    }//fin del metodo

}//Fin

