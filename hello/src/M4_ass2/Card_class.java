package M4_ass2;

public class Card_class {
	String author;
	String title;
	String subject;
	public Card_class(String Author, String Title, String Subject) {
		author=Author;
		title=Title;
		subject=Subject;	
	}
	String getAuthor() {
		return author;	
	}
	String getTitle() {
		return title;
	}
	String getSubject() {
		return subject;
	}
	String setAuthor(String Author){
        author=Author;
        return author;
    }
    String setTitle(String Title){
        title=Title;
        return title;
    }
    String setSubject(String Subject){
        subject= Subject;
        return subject;   
    }
    public String toString() {
    	String k= "{Author="+author+", Title= "+title+", Subject="+subject+"}";
    	return k;
    }
    
}  		





