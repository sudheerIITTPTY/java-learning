/*
 *  Author : DSK
 *  This driver class is to test the towers of Hanoi class
 *
 *
 * */
public class TowersOfHanoiDriver {
    public static void main(String[] args){
        int disks = 3;
        TowersOfHanoi obj = new TowersOfHanoi(disks);
        obj.solveTowersOfHanoi();
    }
}
