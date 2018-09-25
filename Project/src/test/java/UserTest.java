import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void one(){
        User u = new User();
        assertEquals(1, u.one());
    }

}