package lambda;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {
        Lambda2 lambda2=new Lambda2();
        lambda2.start();
    }
    public void start() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("aaa", 12));
        people.add(new Person("bbb", 21));
        people.add(new Person("ccc", 14));
        people.add(new Person("ddd", 31));
        people.add(new Person("eee", 43));

//        for(Person p: people){
//            System.out.println(p.toString());
//        }

//        people.stream().forEach((Person p)->{
//            System.out.println(p.toString());
//        });

        //people.stream().forEach(person -> System.out.println(person));
        people.stream().filter(person -> person.getAge() >= 20).
                sorted((people1, people2) -> people1.getName().compareTo(people2.getName())).
                forEach(System.out::println);
        System.out.println("");
        people.stream().filter(p->p.getAge()>25).sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(people::add);
        people.stream().forEach(System.out::println);
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}