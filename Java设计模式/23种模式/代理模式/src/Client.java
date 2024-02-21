/**
 * @author yyx
 */
public class Client {
//    public static void main(String[] args) {
//        Request request = new Youku();
//        request.processRequest();
//    }


    public static void main(String[] args) {
        Request request = new Youtube();
        VPN vpn = new VPN();
        vpn.setRequest(request);
        vpn.processRequest();
    }
}
