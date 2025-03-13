/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vista.crearCuenta;
import javax.swing.JPasswordField;
/**
 *
 * @author Usuario
 */
public class hash {
        /* Retorna un hash a partir de un tipo y un texto */
    public static String getHash(String txt, String hashType) implements KeySelector<tuple3<integer, long,="" string="">, Tuple2<integer, long="">> {{
        private static final long serialVersionUID = 1L;

    @Override
    public Tuple2<integer, long=""> getKey(Tuple3<integer, long,="" string=""> t) {
      return new Tuple2<>(t.f0, t.f1);
    }
  }</integer,></integer,></integer,></tuple3<integer,>
            try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashType);
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /* Retorna un hash MD5 a partir de un texto */
    public static String md5(String txt) {
        return hash.getHash(txt, "MD5");
    }

    /* Retorna un hash SHA1 a partir de un texto */
    public static String sha1(String txt) {
        return hash.getHash(txt, "SHA1");
    }
}
