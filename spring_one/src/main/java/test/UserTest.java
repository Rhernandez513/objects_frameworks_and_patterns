package test;

import io.roberthernandez.Model.UserManag.User;
import io.roberthernandez.Model.UserManag.UserImp;

import org.junit.jupiter.api.Test;

import org.junit.Assert;



class UserTest {

    @Test
    public void setUsernameTest() {
        User user = new UserImp();
        user.setUsername("Jun");
        String expectedResult = "Jun";
        String actualResult = user.getUsername();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getUsernameTest() {
        User user = new UserImp();
        user.setUsername("Jun");
        String expectedResult = "Jun";
        String actualResult = user.getUsername();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void setUserIDTest() {
        User user = new UserImp();
        user.setUserID(1);
        int expectedResult = 1;
        int actualResult = user.getUserID();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getUserIDTest() {
        User user = new UserImp();
        user.setUserID(1);
        int expectedResult = 1;
        int actualResult = user.getUserID();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void setContactInfo() {
        User user = new UserImp();
        user.setContactInfo("rhernandez3@luc.edu");
        String expectedResult = "rhernandez3@luc.edu";
        String actualResult = user.getContactInfo();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getContactInfo() {
        User user = new UserImp();
        user.setContactInfo("rhernandez3@luc.edu");
        String expectedResult = "rhernandez3@luc.edu";
        String actualResult = user.getContactInfo();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void toStringTest() {
        User user = new UserImp();
        user.setUsername("Jun");
        String expectedResult = "Jun";
        String actualResult = user.toString();
        Assert.assertEquals(expectedResult, actualResult);

    }
}