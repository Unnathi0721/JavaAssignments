package unnathi.assignment.assignment3;

import java.util.*;
import java.lang.*;
import java.io.*;
public class PingDemo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        try {
            //s[i]=Integer.parseInt(st.substring(42,st.length()-10));
            //"cmd /c start cmd.exe /K \
            int no_of_requests=scanner.nextInt();
            String cmd="ping -n "+no_of_requests+" www.google.com";
            Process process = Runtime.getRuntime().exec(cmd);
            InputStream output=process.getInputStream();
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(output));
            System.out.println(stdInput.readLine());
            System.out.println(stdInput.readLine());
            int[] time=new int[no_of_requests];
            String st;
            for (int i = 0; i < time.length; i++) {
                st=stdInput.readLine();
                System.out.println(st);
                int start=st.indexOf("time=");
                int end=st.indexOf("ms");
                time[i]=Integer.parseInt(st.substring(start+5,end));
                System.out.println(time[i]+" hi");
            }
            while((st=stdInput.readLine())!=null) {
                System.out.println(st);
            }
            Arrays.sort(time);
            int size=time.length;
            int median=(size%2==0)?((time[size/2]+time[(size/2)-1])/2):time[size/2];
            System.out.println(median);
        }catch(IOException io){
            System.out.println("Exception");
        }
    }
}
