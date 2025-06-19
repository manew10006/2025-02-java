package starcraft;

public class SiegeTank extends GroundUnit{
    private boolean siegeMode;

    public void toggleSiegeMode(boolean siegeMode) {
        // 이 메소드를 호출할 때마다 siegemode의 값이 true > false > true > false.. 가 되도록
        this.siegeMode = !siegeMode;
    }
}
