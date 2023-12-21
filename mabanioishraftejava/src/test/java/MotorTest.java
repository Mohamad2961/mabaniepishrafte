import Khodro.Motor;
import Khodro.khodro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MotorTest {
    @Test
    void Motor_Bayad_Harkat_konad_Vaghti_Roshan_Ast() {
        Motor motor = new Motor();
       //motor.roshan();
        boolean ayaharkatmikonad=motor.ayaDarHaleHarkatAst();
        Assertions.assertFalse(ayaharkatmikonad);

    }
}
