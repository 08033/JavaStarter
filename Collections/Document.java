//package Collections;

public class Document {

    public String Title;        //md1
    public String Type;         //PDF, CSV, EXCEL, DOCX
    public int SizeInBytes;     //1024
    public String Category;     //Id, Academic, Experience Certificate

    public Document(String Tt, String Ty, int Sz, String Ct){
        this.Title = Tt;
        this.Type = Ty;
        this.SizeInBytes = Sz;
        this.Category = Ct;
    }
}
