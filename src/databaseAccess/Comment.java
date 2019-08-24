package databaseAccess;

public class Comment {
    
    private String author;
    private String authorName;
    private String comment; 

    public Comment() {
    }

    public Comment(String author, String comment, String authorName) {
        this.author = author;
        this.comment = comment;
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
