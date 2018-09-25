import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void one() {
        User u = new User();
        assertEquals(1, u.one());
    }
}