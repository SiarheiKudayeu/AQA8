package lesson11.enums.ex1;

public class WorkWithPlatform {
    public static void startPlatform(Platforms platforms){
        if(platforms.equals(Platforms.ANDROID)){
            System.out.println("Android started!!!");
        } else if (platforms.equals(Platforms.IOS)){
            System.out.println("iOS started");
        } else if (platforms.equals(Platforms.WINDOWS_PHONE)){
            System.out.println("Windows started");
        } else {
            System.out.println("Your platform is " + Platforms.WRONG_PLATFORM);
        }
    }

    public static void startPlatformCase(Platforms platforms){
        switch (platforms){
            case ANDROID ->   System.out.println("Android started!!!");
            case IOS ->       System.out.println("iOS started");
            case WINDOWS_PHONE ->  System.out.println("Windows started");
            default ->     System.out.println("Your platform is " + Platforms.WRONG_PLATFORM);
        }

    }
    public static void main(String[] args) {
        startPlatform(Platforms.WRONG_PLATFORM);
        startPlatformCase(Platforms.ANDROID);
    }
}
