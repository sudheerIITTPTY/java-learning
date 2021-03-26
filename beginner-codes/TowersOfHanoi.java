/*
 *  Author : DSK
 *  This java class contains solution for Towers of Hanoi problem
 *
 *
 * */
public class TowersOfHanoi {
    int disks;
    char fromPole;
    char middlePole;
    char toPole;

    public TowersOfHanoi(){
        disks = 5;
        this.fromPole = 'A';
        this.middlePole = 'B';
        this.toPole = 'C';
    }

    public TowersOfHanoi(int disks){
        this.disks = disks;
        this.fromPole = 'A';
        this.middlePole = 'B';
        this.toPole = 'C';
    }

    public void solveTowersOfHanoi(int n, char fromPole, char toPole, char middlePole){

        if(n==1){
            System.out.println("Move disk 1 from " + fromPole + " to " + toPole);
            return;
        }

        this.solveTowersOfHanoi(n-1,fromPole,middlePole,toPole);
        System.out.println("Move disk " + n + " from " + fromPole + " to " + toPole);
        this.solveTowersOfHanoi(n-1,middlePole,toPole,fromPole);

    }

    public void solveTowersOfHanoi(){
        this.solveTowersOfHanoi(this.disks,this.fromPole,this.toPole,this.middlePole);
    }

}
