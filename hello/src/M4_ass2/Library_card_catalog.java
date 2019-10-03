package M4_ass2;
import java.util.*;
public class Library_card_catalog {
	public static void main(String args[]){

        Scanner in =new Scanner(System.in);
        Card_catalog card=new Card_catalog();

        while(true){
            System.out.println("Enter your choice\n 1 for add card\n 2 get card by title \n 3 tot get books by author\n 4 tot get books by subjects\n 5 tot remove a title\n 6 Catalog \n 7 for exit");
            int choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter book title");
                    String title=in.next();
                    System.out.println("enter book author");
                    String author=in.next();
                    System.out.println("enter book subject");
                    String subject=in.next();
                    Card_class book=new Card_class(title,author,subject);

                    card.addAcard(book);
                    break;
                case 2:
                    System.out.println("Enter title");

                    title=in.next();
                    System.out.println(card.getATitle(title));
                    break;
                case 3:
                    System.out.println("enter author name");
                    author=in.next();
                    String bk[]=card.getAnAuthor(author);
                    for(int i=0;i<bk.length;i++){
                        if(bk[i]!=null){
                            System.out.println(bk[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter Subject");
                    subject=in.next();
                    System.out.println(card.getSubject(subject));
                    break;
                case 5:
                    System.out.println("Enter title to be removed");
                    title=in.next();
                    card.removeATitle(title);
                    break;
                case 6:
                    card.printTheCatalog();
                    break;
                    case 7:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please choice right option");
            }
        }
    }
}
	


