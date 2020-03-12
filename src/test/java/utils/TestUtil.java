package utils;

import actions.common.AbstractTest;

public class TestUtil  extends AbstractTest {

    public static long PAGE_LOAD_TIMEOUT = 30;
    public static long IMPLICIT_WAIT_TIMEOUT = 30;
    public void deleteCookiesBeforeTest() {
        driver.manage().deleteAllCookies();
    }
}
