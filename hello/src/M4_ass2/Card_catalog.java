package M4_ass2;

public class Card_catalog {
	String author[];
	String title[];
	String subject[];
	static int count=0;
	Card_class cards[];
	
	Card_catalog(){
		this.author= new String[15];
		this.title= new String[15];
		this.subject= new String[15];
		this.cards = new Card_class[15];
	}
	
	public void addAcard(Card_class card) {
		author[count]= card.author;
		title[count]= card.title;
		subject[count]= card.subject;
		cards[count]=card;
		count++;	
	}
	
	public Card_class getATitle(String title) {
		for( int i=0; i<cards.length; i++) {
			if(cards[i].getTitle().equals(title)){
                return cards[i];
		}
	}
		return null;
		
	}
	
	public String[] getAnAuthor(String auth){
        String books[]=new String[10];
        int k=0;
        for(int i=0;i<cards.length;i++){
            if (cards[i]!=null){
                if(cards[i].getAuthor().equals(auth)){
                    books[k]=cards[i].getTitle();
                    k=k+1;
                }
            }

        }
        return books;
    }

    public Card_class getSubject(String subject){
        for(int i=0;i<cards.length;i++){
            if(cards[i].getSubject().equals(subject)){
                return cards[i];
            }
        }
        return null;
    }
    public void removeATitle(String title){
        for (int i = 0; i < count; i++) {
            if (cards[i].getTitle().equals(title) || cards[i].equals(null)) {
                cards[i]=null;
                count=count-1;
            } else
                System.out.println(cards[i]);
        }
    }

    public void printTheCatalog(){
        System.out.println(count);
        for (int i=0;i<count;i++){
            if(!(cards[i].equals(null)))
                System.out.println(cards[i]);
        }
    }
}

	

