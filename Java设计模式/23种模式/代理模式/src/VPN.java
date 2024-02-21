/**
 * @author yyx
 */
public class VPN implements Request{
    private Request request;
    public VPN() {
    }
    public void setRequest(Request request) {
        login();
        lianJie();
        this.request = request;
        close();
    }
    @Override
    public void processRequest() {
        request.processRequest();
    }
    private void login() {
        System.out.println("登录VPN");
    }
    private void lianJie() {
        System.out.println("VPN连接");
    }
    private void close() {
        System.out.println("关闭VPN");
    }
}
