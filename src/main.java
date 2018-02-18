import java.util.Scanner;
//https://open.kattis.com/problems/secretmessage/statistics
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        int t = 0;

        while (t < tests) {
            StringBuilder a = new StringBuilder("");
            String s = in.next();
            int m = 2;
            while(m*m<s.length()){
                m++;
            }
            int ast = (m*m)- s.length();
            int k = 0;
            a.append(s);

            while(k<ast){
                a.append("*");
                k++;
            }


            char[][] st = new char[(int)Math.sqrt(a.length())][(int)Math.sqrt(a.length())];
            k=0;

            for(int i = 0;i<Math.sqrt(a.length());i++){
                for(int j = 0;j<Math.sqrt(a.length());j++){
                    st[i][j] = a.charAt(k);
                    k++;
                }
            }
            for(int i=0; i<st.length;i++)
            {
                for(int j=st.length-1; j>=0;j--)
                {
                    if(st[j][i]!='*')
                    System.out.print(st[j][i]);          //in C++
                }

            }
if(t!=tests-1)
    System.out.println();
        t++;
        }
    }
}
