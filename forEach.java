import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {
        String[] nombres={"ana", "tito","jordy","piero"};

        for (String n:nombres){
            System.out.println(n);
        }

        //recorrer un arreglo de nombre y mostrar solo loque empieza con una letra especifica

        String[] artistas={"faraon", "artic monkey","keke"};
        System.out.println("artista que empiecen con la letra:f");
        for(String artista : artistas){
            if (artista.startsWith("f")){
                System.out.println(artista);
            }
        }



    }
}