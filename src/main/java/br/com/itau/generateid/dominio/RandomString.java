package br.com.itau.generateid.dominio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        String nomeUsuario = new String();
        String nomeArquivo = "C:\\Users\\EmilyOliveiraXavier\\IdeaProjects\\GenerateID\\Massa de Dados.txt";



        File arq = new File(nomeArquivo);

        if(arq.exists()){
            try {
                FileReader leitorArquivos = new FileReader(nomeArquivo);
                BufferedReader bufferedReader = new BufferedReader(leitorArquivos);

                while(true){
                    nomeUsuario = bufferedReader.readLine();
                    nomeUsuario = nomeUsuario.replaceAll(" de "," ");
                    nomeUsuario = nomeUsuario.replaceAll(" da ", " ");
                    String[] loginUsuario = nomeUsuario.split(" ");

                    if(nomeUsuario == null) {break;}

                    System.out.println("Usuario: " +nomeUsuario);

                    if(loginUsuario[2].length() >= 3){
                        System.out.println("Login: "+loginUsuario[0].substring(0,3).toUpperCase()+
                                loginUsuario[1].substring(0,3).toUpperCase()+
                                loginUsuario[2].substring(0,3).toUpperCase());
                        if(loginUsuario[0].length() >= 7 || loginUsuario[1].length() >= 3 && loginUsuario[2] == null){
                            System.out.println("Login: "+loginUsuario[0].substring(0,3).toUpperCase()+
                                              loginUsuario[1].substring(0,3).toUpperCase());
                        }
                    }

                    /*
                    if(loginUsuario[0].length() >= 7 || loginUsuario[1].length() >= 3){
                        System.out.println("Login: "+loginUsuario[0].substring(0,3).toUpperCase()+
                                         loginUsuario[1].substring(0,3).toUpperCase());
                    }
                    */


                }

            } catch (Exception e){

            }
        }


    }

}