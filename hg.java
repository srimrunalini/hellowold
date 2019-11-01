package project1;
import java.util.*;
import java.io.*;
public class hg
{
    static public void guess(String word,int len)
    {
        int score;
        char[] mb=new char[word.length()];
        int i=0;
        while(i<word.length())
        {
            mb[i]='-';
            if(word.charAt(i)==' ')
            {
                mb[i]=' ';
            }
            i++;
        }
          System.out.print(mb);
          System.out.println("chances remaining   " +len);

         Scanner sc= new Scanner(System.in);
         ArrayList<Character> array=new ArrayList<Character>();
         
         while(len>0)
         {
             char x=sc.next().charAt(0);
             
              if(array.contains(x))
              {         
                  System.out.println("alredy entered");
                  continue; 
              }
              array.add(x);
             if(word.contains(x+""))
             {
                 for(int j=0;j<word.length();j++)
                 {
                     if(word.charAt(j)==x)
                     {
                         
                         mb[j]=x;
                     }
                 }
             }
             else
             {
                len--;
             } 
             
             if(word.equals(String.valueOf(mb)))
             {
                System.out.println(mb);
                System.out.println("winner winner chicken dinner");
                score=len;
                System.out.println(" your score is:"+score);
                break;
             }
             System.out.print(mb);
             System.out.println("chances remaining" +len);
         
         }
         if(len==0)
         {
             System.out.println("You lost ... Out of chances");
             
         }
    }
	public static void main(String[] args) {
	    String fileName;
	    String line;
	    String randomWord="";
	    ArrayList<String> words;
	    Scanner readTextFile,fileInput;
	    File TextFile;
	 
	    try
	    {
	        System.out.println("enter file:");
	        Scanner input = new Scanner(System.in);
	        fileInput = new Scanner(System.in);
            fileName = fileInput.nextLine(); // fileName
            TextFile = new File(fileName);
            readTextFile = new Scanner(TextFile);
            words = new ArrayList<String>();
            
            while (readTextFile.hasNextLine()) 
            {
                line = readTextFile.nextLine();
                words.add(line);
            }
            Random rand = new Random();
            randomWord = words.get(rand.nextInt(words.size()));
            System.out.println(randomWord);
	    }
	   catch (Exception e)
	   {
        System.out.println(e);
	   }
	    int len=randomWord.length();
	    guess(randomWord,len);
	    }
	}