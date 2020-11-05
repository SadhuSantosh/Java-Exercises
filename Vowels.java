 package Santosh.exercises;

 import java.util.HashMap;
 import java.util.Map;
 import java.util.Scanner;


 class Vowels{
     public static void main(String[] args) {
         Map<Character,Integer> m=new HashMap<> ();
         System.out.println ("enter a string:\n");
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         s=s.toLowerCase();
         m.put('a',0);
         m.put('e',0);
         m.put('i',0);
         m.put('o',0);
         m.put('u',0);
         StringBuilder sk=new StringBuilder ("");
         for(int i=0;i<s.length ();i++)
         {   char j=s.charAt (i);
             int count;
              if(m.containsKey(j))
             {    count=m.get(j);
                 m.replace (j,count+1);
             }
              else
              {
                  sk.append(j);
              }

         }
         m.forEach((k,v)->{
             System.out.format("%c:%d\t",k,v);
         });

         System.out.println ("\n"+sk);
     }
 }