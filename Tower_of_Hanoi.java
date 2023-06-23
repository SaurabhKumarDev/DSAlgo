//Class
public class Tower_of_Hanoi {

    //Function
    public static void toh(int disk, char src, char hel, char des) {
        if(disk == 0) {
            return;
        }

        //Recursion 1
        toh(disk-1, src, des, hel);

        //Print Result
        System.out.println("Disk "+disk+" "+src+" "+des);

        //Recursion 2
        toh(disk-1, hel, src, des);
    }
    public static void main(String args[]) {
        toh(3, 'S', 'H', 'D');
    }
}

//OUTPUT : 
// Disk 1 S D
// Disk 2 S H
// Disk 1 D H
// Disk 3 S D
// Disk 1 H S
// Disk 2 H D
// Disk 1 S D