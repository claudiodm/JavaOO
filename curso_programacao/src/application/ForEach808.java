package application;

public class ForEach808 {
    public static void main(String[] args) {
        String[] vect = new String[] {"claudio","delfino","machado"};
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("O obj faz a mesma coisa que o vect[i]");
        //for (String obj : vect)  --> for (TipoDoObjeto apelido : Objeto)
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
