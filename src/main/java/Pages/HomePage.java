package Pages;

import Base.BaseStepMethod;

import static Base.BaseTest.driver;

public class HomePage extends BaseStepMethod {

    public void go_To_Url1(String url){
        driver.get(url);


    }
}