import Khodro.Mashin;
import Khodro.ranande;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Mashintest {
    @Test
    void Mashin_Bayad_Harkat_konad_Vaghti_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {
        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("volvo");
        boolean ayaharkatmikonad = benz.ayaDarHaleHarkatAst();
        volvo.roshan();
        boolean ayavolvoharkatmikonad = volvo.ayaDarHaleHarkatAst();

        Assertions.assertFalse(ayaharkatmikonad);
        Assertions.assertTrue(ayavolvoharkatmikonad);
        ranande ranande = new ranande();
    }
   }
