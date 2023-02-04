public class palindrome {
    public boolean isPalindrome(int x) {
        Boolean result=false;
        //Integer input=new Integer(x);
        String temp=((Integer)x).toString();//input.toString();
        char [] tempChar= temp.toCharArray();
        if (0<=x&&x<10){
            result=true;
        }
        else{
        for (int i=0;i<(tempChar.length/2);i++){
            //输入0时会因为i=(tempChar.length/2)而退出循环
            //从而直接判断false
            System.out.print(tempChar.length-1-i);
            if(tempChar[i]==tempChar[(tempChar.length-1-i)]){
                result=true;
            }
            else{
                result=false;
                break;
            }
        }
        }
        return result;
    }
    public static void main(String [] args){
        int x=1000021;
        palindrome p= new palindrome();
        Boolean result = p.isPalindrome(x);
        System.out.print(result);
        
    }
}
