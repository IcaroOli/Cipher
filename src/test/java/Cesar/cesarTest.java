package Cesar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Cesar.Cesar.cesarCriptografar;
import static Cesar.Cesar.cesarDecriptografia;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class cesarTest {
    @Test
    public void testSucess_codificarCesar(){
        int chave = 13;
        String texto = "icaro";
        assertEquals("vpneb",cesarCriptografar(chave,texto));
    }
    @Test
    public void testSucess_decodificarCesar(){
        int chave = 13;
        String code = "vpneb";
        assertEquals("icaro",cesarDecriptografia(chave,code));
    }
    @Test
    public void testFail_codificarCesar(){
        int chave = 15;
        String texto = "icaro";
        assertNotEquals("vpneb",cesarCriptografar(chave,texto));
    }
    @Test
    public void testFail_decodificarCesar(){
        int chave = 15;
        String code = "vpneb";
        assertNotEquals("icaro",cesarDecriptografia(chave,code));
    }
}
