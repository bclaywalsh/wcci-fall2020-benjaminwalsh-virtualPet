package VirtualPet;
import VirtualPetApplication.VirtualPet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void petHasAName(){
        VirtualPet hearthKami = new VirtualPet("Hearth Kami","Jerald");
        assertEquals("", hearthKami.getName());
    }
}