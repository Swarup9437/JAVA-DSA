public class TOH {
    public static void towerOfHanoi(int n, String source, String helper, String destination){
        if (n==1) {
            System.out.println("transfer of disk "+ n +" from " +source + " to " + destination);
            return;
        }
        towerOfHanoi(n-1, source,destination,helper);
        System.out.println("transfer of disk "+ n +" from " +source + " to " + destination);
        towerOfHanoi(n-1,helper,source,destination);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n,"S","H","D");
    }
}
/*
Step 1 & 2 :
first transfer the n-1 element to helper via destination 
so that you will left of with 1 element in the source tower
and transer that top the destination
Step 3:
now transfer the n-1 element presesnt at hepler to the destination taking the help of soouce.
