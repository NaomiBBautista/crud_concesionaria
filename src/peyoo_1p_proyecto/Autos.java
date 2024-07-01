package peyoo_1p_proyecto;
public class Autos 
{
    //Atributos
    private int placas;
    private int año;
    private String color;
    private String ultimoDueño; 
    private String marca;
    private String modelo;
    private boolean estado=true;
    
    
    //Metodo Constructor
    public Autos(){}

    public Autos( int a,String col, String due, String mar,String mo, int p)
    {
        this.año=a;
        this.color=col;
        this.ultimoDueño=due;
        this.marca=mar;
        this.modelo=mo;
        this.placas=p;
    }
    
    
    //Metodos de Acceso        
    public int getAño()
    {
        return this.año;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public String getDueño()
    {
        return this.ultimoDueño;
    }
    
    public String getMarca()
    {
        return this.marca;
    }
    
    public String getModelo()
    {
        return this.modelo;
    }

    public int getPlacas() 
    {
        return placas;
    }
    
    public boolean getEstado()
    {
        return estado;
    }
    
    

    
    //Metodos de Mutacion
    public void setAño(int a)
    {
        this.año=a;
    }
   
    public void setColor(String col)
    {
        this.color=col;
    }
   
    public void setDueño(String d)
    {
        this.ultimoDueño=d;
    }
   
    public void setMarca(String mar)
    {
        this.marca=mar;
    }
   
    public void setModelo(String mo)
    {
        this.modelo=mo;
    }
   
    public void setPlacas(int p)
    {
        this.placas=p;
    }    
    
    public void setEstado(boolean e)
    {
        this.estado=e;
    }
}
