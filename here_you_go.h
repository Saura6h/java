public class Main
{

    public static void main(String args[])
        {
            System.out.println(canCheck(1, 8,18));
        }
    static boolean canCheck(int bigCount,int smallCount,int goal)
        {
            if((bigCount==goal/5 || bigCount+1==goal/5) && smallCount>=goal%5 || smallCount>=goal) {
                return true;
            }
            else{
                return false;
            }
        }
}
