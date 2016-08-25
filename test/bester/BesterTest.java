package bester;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class BesterTest {

    @Test
    public void shouldReturnRectangleWithLargestArea() throws Exception {
        Rectangle rectangle = new Rectangle(2,3);
        List<RulesOfComparing> rectangleList = new ArrayList<>();
        rectangleList.add(rectangle);
        Bester bester = new Bester();
        assertEquals(rectangle, bester.findBest(rectangleList));
    }

    @Test
    public void shouldReturnTheBiggerOneWhenGivenTwoRectangles() throws Exception {
        Rectangle rectangle1 = new Rectangle(2,3);
        Rectangle rectangle2 = new Rectangle(3,3);
        Bester bester = new Bester();

        List<RulesOfComparing> rectangleList = new ArrayList<>();
        rectangleList.add(rectangle1);
        rectangleList.add(rectangle2);

        assertEquals(rectangle2, bester.findBest(rectangleList));
    }

    @Test
    public void shouldReturnTheBestCookieGivenOneCookie() throws Exception {
        Bester bester = new Bester();
        Cookie cookie = new Cookie(5);
        List<RulesOfComparing> cookieList = new ArrayList<>();
        cookieList.add(cookie);
        Assert.assertEquals(cookie, bester.findBest(cookieList));
    }

    @Test
    public void shouldReturnTheBestCookieGivenTwoCookies() throws Exception {
        Bester bester = new Bester();
        Cookie cookie1 = new Cookie(5);
        Cookie cookie2 = new Cookie(15);
        List<RulesOfComparing> cookieList = new ArrayList<>();

        cookieList.add(cookie1);
        cookieList.add(cookie2);
        Assert.assertEquals(cookie2, bester.findBest(cookieList));
    }
}
