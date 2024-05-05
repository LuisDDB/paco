/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.negocio;

/**
 *
 * @author sergi
 */
public class MetodoAtbash {
    public class CifradoAtbash {
    public static String EncriptacionAtbash(String textoplano) {
        StringBuilder textocifrado = new StringBuilder();
        for (int i = 0; i < textoplano.length(); i++) {
            char arreglodechar = textoplano.charAt(i);
            if (Character.isLetter(arreglodechar)) {
                char charencriptado = (char) ('Z' - (Character.toUpperCase(arreglodechar) - 'A'));
                textocifrado.append(charencriptado);
            } else {
                textocifrado.append(arreglodechar);
            }
        }
        return textocifrado.toString();
    }

    public static String desencriptado(String Textocifrado) {
        return EncriptacionAtbash(Textocifrado);
    }

    public static void main(String[] args) {
        String textoplano = "Hello World!";
        String textoencriptado = EncriptacionAtbash(textoplano);
        String textodesencriptado = desencriptado(textoencriptado);
        
        System.out.println("Original Text: " + textoplano);
        System.out.println("Encrypted Text: " + textoencriptado);
        System.out.println("Decrypted Text: " + textodesencriptado);
    }
}
}
