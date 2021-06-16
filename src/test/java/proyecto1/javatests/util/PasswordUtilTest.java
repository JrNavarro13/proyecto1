package proyecto1.javatests.util;

import static org.junit.Assert.*;
import static proyecto1.javatests.PasswordUtil.SecurityLevel.*;

import org.junit.Test;
import proyecto1.javatests.PasswordUtil;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }
    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("asdfghj"));
    }
    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUM, PasswordUtil.assessPassword("1qwer234567"));
    }
    @Test
    public void strong_when_has_letters_numbers_and_symbols(){
        assertEquals(STRONG, PasswordUtil.assessPassword("qwer234567!!"));
    }



}