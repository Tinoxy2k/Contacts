package org.example.database.entitis;
//Клас модель об*єкту - в нащому випадку якийсь Контакт - який саме не зрозуміло
public class Contact {
    int id; // Змінна ID з бази данних;
    String name; // змінна ім*я колонки в базі данних;
    String phone; //змінна колонки phone в базі данних;

    public  Contact (){ //порожній конструктор

    }
    public Contact(int id, String name, String phone) { //параметризований конструктор зі змінних;
        this.id = id;
        this.name = name;
        this.phone = phone;



    }
    //Геттери і сеттери для нашого об*єкту
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



}
