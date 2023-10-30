import Khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MotorTest {
    @Test
    void Motor_Bayad_Harkat_konad_Vaghti_Roshan_Ast() {
        Motor motor = new Motor();
        boolean ayaharkatmikonad=motor.ayaDarHaleHarkatAst();
        assertFalse(ayaharkatmikonad);

    }
}
