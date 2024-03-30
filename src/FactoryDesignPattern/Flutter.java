package FactoryDesignPattern;

public class Flutter {
    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms sP) {
        this.supportedPlatforms = sP;
    }

    public void setRefreshRate() {
        System.out.println("Refresh rate is set");
    }

    public void setTheme() {
        System.out.println("Theme is set");
    }

    public UIFactory createUIFactory() {
        if(supportedPlatforms == SupportedPlatforms.IOS) {
            return new iOSUIFactory();
        }
        else {
            return new AndroidUIFactory();
        }
    }
}
