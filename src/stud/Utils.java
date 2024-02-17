package stud;

public class Utils {

    public static void bestStud(Student[] stud){
        int id = -1;
        float score=0;
            for(Student st:stud){
                float tmpScore=0;
                    for (Subject sb:st.getSubjects()){
                        tmpScore+=sb.getMark();
                    }
                    if(tmpScore/5>score){
                        score=tmpScore/5;
                        id=st.getId();
                    }
            }
            P.rint("Best student is:"+stud[id-1].getName()+" "+stud[id-1].getSurname());
    }
    class P{
       static void rint(String str){
           System.out.print(str);
       }

    }
}
