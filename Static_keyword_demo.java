import java.util.Scanner;
class Static_keyword{
    static String str;
    static void get_str(String s){
              str=s;
          }
    static void display_str(){
        System.out.println(str);
    }
}
class Static_Keyword_demo{
    public static void main(String srgs[]){
        String str;
        Scanner s =new Scanner (System.in);
        System.out.println("Enter the String");
        str=s.nextLine();
        Static_keyword st=new Static_keyword();
        st.get_str(str);
        st.display_str();
    }
}
