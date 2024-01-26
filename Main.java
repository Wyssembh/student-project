import java.util.Arrays;

class Note{
    String mat;float note;float coef;

    public Note(String mat, float note, float coef) {
        this.mat = mat;
        this.note = note;
        this.coef = coef;
    }

    @Override
    public String toString() {
        return "Note{" +
                "mat='" + mat + '\'' +
                ", note=" + note +
                ", coef=" + coef +
                '}';
    }
}
class student{
    int id ; String name,email; Note[] notes;

    public student(int id, String name, String email, Note[] notes) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.notes =new Note[20];

    }

    @Override
    public String toString() {
        String str;
        for(int i=0;i<20;i++){
            str+=notes[i].toString();
        }
        return "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", notes="+str ;

    }
}
class groupe{
    String name; student[] students;
    public groupe(String name){
        this.name=name;
        students= new student[20];

    }

    @Override
    public String toString() {
       String st;
        for(int i=0;i<20;i++){
            st+=students[i].toString();


        }
        return "name: "+name;
    }
}
public class Main {
    public static void main (String[]args){
        Note n1=new Note("math",15,4);
        Note n2=new Note("math",15,4);
        Note n3=new Note("math",15,4);
        Note[] notes=new Note[4];
        Note[0]=n1;
        Note[1]=n2;
        Note[2]=n3;
        public String toString(){
        for (int j,j<4,j++){
            System.out.println(Note[j]);

        }}
        student s1=new student(4,"wissem","wiss0430",Note[j]);
        System.out.println(s1.toString());
        groupe g1 = new groupe("tic_g1");
        System.out.println(g1.toString());
    }
}
