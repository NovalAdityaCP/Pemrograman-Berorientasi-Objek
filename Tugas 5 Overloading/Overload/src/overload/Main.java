package overload;
public class Main {
    public static void main(String[] args) {
        Vector3 v1 = new Vector3(2, 3, 4);
        Vector3 v2 = new Vector3(5, 6, 7);
        
        Vector3 hasilSkalar1 = v1.multiply(5);
        System.out.println("Hasil perkalian vektor 1 dengan skalar: " + hasilSkalar1);
        
        Vector3 hasilSkalar2 = v2.multiply(7);
        System.out.println("Hasil perkalian vektor 1 dengan skalar: " + hasilSkalar2);

        int hasilVektor = v1.multiply(v2);
        System.out.println("Hasil perkalian vektor dengan vektor: " + hasilVektor);
    }
    
}
