package deviceFactory;

public class FactoryDevices {
    public static IDevice make(String type){
        IDevice device;
        switch (type.toLowerCase()){
            case "android":
                device = new Android();
                break;
            default:
                device= new AndroidCloud();
                break;
        }
        return device;
    }
}
