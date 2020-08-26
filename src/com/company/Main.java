package com.company;

import kg.geekteck.lesson7.homework.*;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        Hero hero = new Hero() {
            @Override
            public void applySuperAbility(String superAbilityType) {

            }
        };
        HavingSuperAbility[] superAbilities = {magic, medic, warrior};
        for (HavingSuperAbility i: superAbilities) {
            printIn(i);
            
        }
    }
    public static void printIn(HavingSuperAbility superAbility){
        superAbility.applySuperAbility(" CRITICAL DAMAGE");

    }
}
