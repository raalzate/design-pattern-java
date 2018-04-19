package co.com.techandsolve.patten;

import co.com.techandsolve.patten.templateMethod.PintarNombres;
import org.junit.Test;

/**
 * Created by MyMac on 18/04/18.
 */
public class TemplateMethodTest {
    @Test
    public void validPatten(){
        PintarNombres pintarNombres =new PintarNombres();
        pintarNombres.pintarNombre();
    }
}
