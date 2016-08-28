package bester;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class BesterTest {
    private Bester bester;
    private List<RulesOfComparing> list;

    @Before
    public void setUp() throws Exception {
        bester = new Bester();
        list = new ArrayList<>();
    }

    @Test
    public void shouldReturnRectangleWithLargestArea() throws Exception {
        Rectangle rectangle = new Rectangle(2,3);

        list.add(rectangle);

        assertEquals(rectangle, bester.findBest(list));
    }

    @Test
    public void shouldReturnTheBiggerOneWhenGivenTwoRectangles() throws Exception {
        Rectangle rectangle1 = new Rectangle(2,3);
        Rectangle rectangle2 = new Rectangle(3,3);

        list.add(rectangle1);
        list.add(rectangle2);

        assertEquals(rectangle2, bester.findBest(list));
    }

    @Test
    public void shouldReturnTheBestCookieGivenOneCookie() throws Exception {
        Cookie cookie = new Cookie(5);

        list.add(cookie);

        assertEquals(cookie, bester.findBest(list));
    }

    @Test
    public void shouldReturnTheBestCookieGivenTwoCookies() throws Exception {
        Cookie cookie1 = new Cookie(5);
        Cookie cookie2 = new Cookie(15);

        list.add(cookie1);
        list.add(cookie2);

        assertEquals(cookie2, bester.findBest(list));
    }

    @Test(expected = Exception.class)
    public void shouldThrowAnExceptionWhenGiveEmptyInput() throws Exception {
        bester.findBest(list);
    }

    @Test(expected = ClassCastException.class)
    public void shouldThrowAnClassCastExceptionWhenGivenOneCookieAndOneRectangle() throws Exception {
        Cookie cookie = new Cookie(5);
        RulesOfComparing rectangle = new Rectangle(5, 5);

        list.add(cookie);
        list.add(rectangle);

        bester.findBest(list);
    }


}
