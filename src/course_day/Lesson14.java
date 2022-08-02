package course_day;

public class Lesson14 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("OUGH");
        person1.setAge(12);
        System.out.println("wiuu in main metod: "+person1.getName());
        System.out.println("Wiuu in mait metod: "+person1.getAge());
        person1.speak();
    }
}

class Person{
    private String name;
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Error");
        } else{
            name = userName;
        }

    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("Error");
        } else {
            age = userAge;
        }
    }

    public int getAge(){
        return age;
    }

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }
    void speak(){
        for (int i = 0; i < 3; i++)
            System.out.println("My name " + name + ", me " + age + " years");
    }
    void sayHello(){
        System.out.println("Hi");
    }
}