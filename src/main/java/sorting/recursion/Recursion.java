package sorting.recursion;

public class Recursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int result = recursion.recursiveFactoriel(3);
        System.out.println(result);
    }

    public int recursiveFactoriel(int num) {
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactoriel(num - 1);
    }
}
