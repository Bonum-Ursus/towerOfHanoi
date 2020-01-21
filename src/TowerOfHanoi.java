public class TowerOfHanoi {
    int count = 0;
    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.hanoi(10, 1, 2);
        System.out.println("Total moves: " + towerOfHanoi.count);
    }
    void hanoi(int n, int i, int k){
        count++;
        if(n == 1)
            System.out.printf("Move disk 1 from pin %d to %d \n", i, k);
        else {
            int tmp = 6 - k - i;
            hanoi(n-1, i, tmp);
            System.out.printf("Move disk %d from pin %d to %d \n", n, i, k);
            hanoi(n-1, tmp, k);
        }
    }
}
