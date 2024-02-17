package stud;

import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Student[] studs=new Student[5];

        Scanner sc=new Scanner(System.in);
        for (int j=0;j<5;j++){
            System.out.println("Enter name:");
            String name=sc.nextLine();
            System.out.println("Enter surname:");
            String surname=sc.nextLine();
            studs[j]=new Student(name,surname);
            int i=1;
            Subject tmp[]=new Subject[5];
            for (int k=0;k<5;k++){
                tmp[k]=new Subject(Discipline.subjectById(i));
                i++;
            }
            studs[j].setSubjects(tmp);
        }

        for (Student st:studs) {
        System.out.println(st.getId()+" "+st.getName()+" "+st.getSurname()+":");
            for (Subject sb: st.getSubjects()){
                System.out.println(sb.getNameSubject()+": "+sb.getMark()+" "+sb.isPassed());
            }
            System.out.println("-------------");
        }
        Utils.bestStud(studs);
        }
    }

