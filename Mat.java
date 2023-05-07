public class Mat {
    public static void main(String[] args) {
      
        System.out.println("mayor numero"+Math.max(5, 10));
        System.out.println("menor numero"+Math.min(5, 10));
        System.out.println("raiz del numero"+Math.sqrt(64));
        System.out.println("positivo"+Math.abs(-4.7));
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println("numero aleatorio"+randomNum);
}
}
