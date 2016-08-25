package bester;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CookieTest {
    @Test
    public void shouldReturnTrueWhenCookieOneHasMoreChips() throws Exception {
        Cookie cookieOne = new Cookie(6);
        Cookie cookieTwo = new Cookie(5);
        assertTrue(cookieOne.betterThan(cookieTwo));
    }
}
