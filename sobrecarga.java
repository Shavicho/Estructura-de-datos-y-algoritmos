public class sobrecarga {
    public static void main(String[] args) {
        Nombre("Javier");
        Nombre("Justo","Lucinda");
        Nombre("Pamela","Gonzalo","Javier");
        
    }
    static void Nombre(String nombre)
    {
        System.out.println("mi nombre es "+nombre);
    } 
    static void Nombre(String nombre1,String nombre2)
    {
        System.out.println("el nombre de mis padres es "+nombre1+" y "+nombre2);
    }
    static void Nombre(String nombre1,String nombre2,String nombre3)
    {
        System.out.println("mis hermanos y yo nos llamamos "+nombre1+","+nombre2+","+nombre3);
    }
}
