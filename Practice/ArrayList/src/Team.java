package Practice.ArrayList.src;

import java.util.ArrayList;

public class Team {
    private ArrayList<Person> person;
    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
        person = new ArrayList<>();
    }

    public void add(Person p){
        person.add(p);
    }

    public void print(){
        for( Person p : person){
            System.out.println(p);
        }
    }

    public void sort(){
        for (int i=0; i<person.size();i++){
            int min = i;
            for (int j=i;j<person.size();j++){
                if (person.get(j).getHeightInCentimeters() < person.get(i).getHeightInCentimeters()){
                    min = j;
                }
            }
            Person p = person.remove(min);
            person.add(i,p);
        }
    }

    public int average(){
        int sum = 0;
        for (int i =0; i < person.size(); i++){
            sum += person.get(i).getHeightInCentimeters();

        }
        return sum/person.size();
    }
    public int duplicate(){
        int duplicate = 0;
        ArrayList<Person>temp = new ArrayList<Person>();
        for (int i=0;i<person.size();i++){
            boolean in = false;
            for (int j=0;j<temp.size();j++){
                if (person.get(i).equals(temp.get(j))){
                    in = true;
                }
            }
            if (in){
                duplicate++;
            }
            else {
                temp.add(person.get(i));
            }
        }
        return  duplicate;
    }

    public void removeDuplicates(){
        ArrayList<Person>temp = new ArrayList<Person>();
        for (int i=0;i<person.size();i++){
            boolean in = false;
            for (int j=0;j<temp.size();j++){
                if (person.get(i).equals(temp.get(j))){
                    in = true;
                }
            }
            if (!in){
                temp.add(person.get(i));
            }
        }
        person = temp;
    }
    public void printTeam(){
        for (Person p : person){
            System.out.println(p);
        }
    }


}
