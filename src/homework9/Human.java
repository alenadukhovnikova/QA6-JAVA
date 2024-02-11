package homework9;
//Міні проєкт “Щаслива родина”
       // Суть проєкту: опис структури сім’ї з урахуванням того, що кожна людина має кровних родичів,
// а склад сім’ї може з часом змінюватися. До проходження теми “Колекції” всі домашні завдання повинні бути
// виконані з використанням масивів (НЕ використовуйте інтерфейси List, Set, Map, поки про це не буде прямо
// сказано у завданні). Об’єкти

import java.util.Arrays;
import java.util.Objects;

// Завдання
      //  • Створіть та опишіть класи: Домашній улюбленець (Pet), Людина (Human). Створіть конструктори
//  для написаних класів. Створіть клас Main та у ньому створіть екземпляри описаних класів.
        //• Зробіть поля всіх класів приватними.
       // • Створіть та опишіть клас Сім'я (Family). Вважатимемо, що сім'я може створюватися двома людьми,
// які не розходяться і можуть народжувати/усиновлювати своїх дітей. Діти можуть дорослішати та йти з сім'ї,
// створюючи свою власну.
       // • Перевизначте методи equals() та hashCode() у всіх класах проєкту.
       // • У класі Family додайте метод deleteChild(Human child) з урахуванням наявності даних методів.
       // Технічні вимоги:
      //  • Опишіть у класі Pet такі поля:
       // • вид тварини (species), рядок (собака, кіт тощо)
       // • кличка (nickname)
       // • вік (age)
       // • Рівень хитрості (trickLevel) (ціле число від 0 до 100)
      //  • звички (habits) (масив рядків)
      //  • Опишіть у класі Pet та реалізуйте такі методи:
     //   • поїсти (eat) (метод виводить на екран повідомлення Я ї'м!)
       // • відгукнутися (respond) (метод виводить на екран повідомлення Привіт, хазяїн. Я - [ім'я тварини]. Я скучив!)
      //  • зробити домашню гидоту (foul) (метод виводить на екран повідомлення Потрібно добре замести сліди...)
      //  • Опишіть у класу Human такі поля:
     //   • Ім'я (name)
     //   • Прізвище (surname)
       // • Рік народження (year), число
      //  • Рівень IQ (iq) (ціле число від 0 до 100)
      //  • Домашній улюбленець (pet) (об'єкт типу Pet)
     //   • Мама (mother) (об'єкт типу Human)
     //   • Тато (father) (об'єкт типу Human)
     //   • Опишіть у класу Human та реалізуйте такі методи:
    //    • привітати свого улюбленця (greetPet)("Привіт, [ім'я тварини]")
    //    • описати свого улюбленця (describePet): (вивести на екран всю інформацію про свого вихованця: "У мене є [вид тварини], їй [вік тварини] років, він [дуже хитрий]/[майже не хитрий]". описи хитрості повинна залежати від рівня хитрості вихованця, якщо понад 50 -[дуже хитрий], якщо менше або дорівнює 50 -[майже не хитрий])
   //     • Пере визначте метод toString() в обох класів;
    //    • Клас Pet повинен виводити повідомлення наступного виду: dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}, де dog - вид тварини;
    //    • Клас Human повинен виводити повідомлення наступного виду: Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname=' Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}
    //    • У класі Pet створіть конструктори:
    //    • конструктор, що описує вид тварини та її прізвисько
    //    • конструктор, що описує всі поля тварини
    //    • Порожній конструктор
   //     • У класі Human створіть конструктори:
   //     • конструктор, що описує ім'я, прізвище та рік народження
    //    • конструктор, що описує ім'я, прізвище, рік народження, тата та маму
    //    • конструктор, який описує всі поля
    //    • Порожній конструктор
    //    • Оголосіть усі поля наявних класів як приватні. Додайте гетери та сетери; зробіть рефакторинг наявних методів з урахуванням змін.
    //    • Опишіть у класу Family наступні поля:
   //     • мама mother (тип Human)
   //     • тато father (тип Human)
   //     • діти children (масив Human)
   //     • домашній улюбленець pet (тип Pet)
   //     • Додайте гетери, сетери; пере визначте toString так щоб він показував всю інформацію про всіх членів сім’ї.
   //     • У класі Family створіть конструктор:\
   //     • єдиною умовою створення нової сім'ї є наявність 2-х батьків, причому у батьків має встановлюватися посилання на поточну нову сім'ю, а сім'я створюється з порожнім масивом дітей.
   //     • Зробіть рефакторинг класу Human з урахуванням структури Family:
    //    • Видаліть з Human всю інформацію, що дублюється в класі Family (Human повинен зберігати тільки інформацію, що описує себе)
    //    • додайте поле family (тип Family) (тепер воно зберігає всю інформацію про сімейні дані людини)
    //    • додайте необхідні гетери, сетери, конструктори; видаліть неактуальні конструктори та методи; зробіть рефакторинг методів привітати свого улюбленця, описати свого улюбленця, нагодувати
    //    • Зробіть рефакторинг методу toString(). Він повинен виводити інформацію в наступному форматі: Human{name='Name', surname='Surname', year=1, iq=1, schedule=[[day, task], [day_2, task_2]]}.
   //     • У Family опишіть методи:
    //    • додати дитину addChild (приймає тип Human і додає її до масиву дітей; додає дитині посилання на поточну родину)
    //    • видалити дитину deleteChild (приймає індекс масиву та видаляє даний елемент; повертає логічне значення - чи був видалений елемент)
    //    • отримати кількість осіб у сім'ї countFamily (батьки у сім'ї ніколи не змінюються; якщо відбувається зміна батьківського складу – це вже інша родина)
   //     • Пере визначте метод toString()
    //    • Вирішіть, які поля варто використовувати для порівняння в методі equals() (наприклад, звички тварини можуть змінюватися).
    //    • У класі Main створіть кілька сімей, щоб у кожного класу були використані всі можливі конструктори. Виведіть інформацію про кожну людину на екран.
    //    • У класі Main створіть маму, тата, дитину та її домашню тварину. Надайте всі необхідні посилання (у дитини на батьків та вихованця), щоб вийшла повноцінна сім’я. Викличте всі доступні методи у дитини (включаючи метод toString()) та у його вихованця.
public class Human {
       private String name;
       private String surname;
       private int year;
       private int iq;
       private Pet pet;
       private Human mother;
       private Human father;

       private Family family;


       public Family getFamily() {
              return family;
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public String getSurname() {
              return surname;
       }

       public void setSurname(String surname) {
              this.surname = surname;
       }

       public int getYear() {
              return year;
       }

       public void setYear(int year) {
              this.year = year;
       }

       public int getIq() {
              return iq;
       }

       public void setIq(int iq) {
              this.iq = iq;
       }

       public Pet getPet() {
              return pet;
       }

       public void setPet(Pet pet) {
              this.pet = pet;
       }

       public Human getMother() {
              return mother;
       }

       public void setMother(Human mother) {
              this.mother = mother;
       }

       public Human getFather() {
              return father;
       }

       public void setFather(Human father) {
              this.father = father;
       }

       public void setFamily(Family family) {
              this.family = family;



              }

              public void greetPet () {
                     System.out.println("Привіт," + pet.getNickname());
              }

              public void describePet () {
                     String result;
                     if (pet.getTrickLevel() > 50) {
                            result = "Дуже хитрий";
                     } else {
                            result = "Майже не хитрий";
                            System.out.println("У мене є " + pet.getSpecies() + ", їй" + pet.getAge() + "років, він" + result + ".");
                     }
              }
       @Override
       public String toString () {
              return "Human{" +
                      "name='" + name + '\'' +
                      ", surname='" + surname + '\'' +
                      ", year=" + year +
                      ", iq=" + iq +
                      ", pet=" + pet +
                      ", mother=" + mother +
                      ", father=" + father +
                      ", pet ={" + pet.getSpecies() +
                      ", nickname='" + pet.getNickname() + '\'' +
                      ", age='" + pet.getAge() + '\'' +
                      ", trickLevel=" + pet.getTrickLevel() +
                      ", habits=" + Arrays.toString(pet.getHabits()) +
                      '}' + '}';
       }

       public Human(String name, String surname, int year){
                     this.name = name;
                     this.surname = surname;
                     this.year = year;
              }

       public Human(String name, String surname, int year, Human mother, Human father){
                     this.name = name;
                     this.surname = surname;
                     this.year = year;
                     this.mother = mother;
                     this.father = father;
              }

       public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father){
                     this.name = name;
                     this.surname = surname;
                     this.year = year;
                     this.iq = iq;
                     this.pet = pet;
                     this.mother = mother;
                     this.father = father;
              }
       public Human() {
              }

       @Override
       public boolean equals(Object o) {
              if (this == o) return true;
              if (!(o instanceof Human human)) return false;
              return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Objects.equals(family, human.family);
       }

       @Override
       public int hashCode() {
              return Objects.hash(name, surname, year, iq, pet, mother, father, family);
       }
}
