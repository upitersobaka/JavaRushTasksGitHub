package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grendFather1 = new Human("Kiril", true, 79);
        Human grendFather2 = new Human("Ivan",  true, 89);

        Human grendMather1 = new Human("Inna", false, 75);
        Human grendMather2 = new Human("Maria", false, 85);

        Human mather1 = new Human("Anna", false, 45, grendFather1, grendMather1);
        Human father1 = new Human("Petr", true, 47, grendFather2, grendMather2);


        Human children1 = new Human("Inessa", false, 23,  father1,mather1);
        Human children2 = new Human("Leo", true, 26,  father1,mather1);
        Human children3 = new Human("Mark", true, 29,  father1, mather1);


        System.out.println(grendFather1.toString());
        System.out.println(grendFather2.toString());
        System.out.println(grendMather1.toString());
        System.out.println(grendMather2.toString());

        System.out.println(father1.toString());
        System.out.println(mather1.toString());

        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());



    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















