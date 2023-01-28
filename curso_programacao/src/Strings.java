public class Strings {

    public static void main(String[] args) {
        String s = "Claudio Delfino Machado";
        String[] vet = s.split(" ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(i + " - "+ vet[i]);

        }
    }
}
