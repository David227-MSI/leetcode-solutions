// LeetCode CN #1603
// 題目名稱：Design Parking System
// 題目連結：https://leetcode.cn/problems/design-parking-system/
// 題目類型：Java / Easy（簡單）

class ParkingSystem {
    int big, medium, small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0){
                big--;
                return true;
            } }else if (carType == 2) {
            if (medium > 0){
                medium--;
                return true;
            } } else if (carType == 3) {
            if (small > 0){
                small--;
                return true;
            }
        }
        return false;
    }
}
/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */