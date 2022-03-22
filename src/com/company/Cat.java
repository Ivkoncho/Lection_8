package com.company;

public class Cat {

      private  String name;
        private  String Breed;
        private int age;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBreed() {
            return Breed;
        }

        public void setBreed(String breed) {
            Breed = breed;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String makeSound(){
            return "Meow";
        }
    }



