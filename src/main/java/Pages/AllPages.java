package Pages;

public class AllPages {
    public AllPages() {
    }

    private MainPage mainPage;


    public MainPage mainPage() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }

    //---------------------------------------------------
    private HomePage homePage;

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }
//-------------------------------------------------------


//----------------------------------------------------------------
}