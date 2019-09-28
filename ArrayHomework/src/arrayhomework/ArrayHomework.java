/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author co.ho
 */
public class ArrayHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create object
        List<User> users = new ArrayList<User>();
        
        User user1 = new User(1, "Co", 20);
        User user2 = new User(2, "Ronaldo", 30);
        User user3 = new User(3, "John Cena", 19);
        User user4 = new User(4, "Benzema", 40);
        User user5 = new User(5, "G.Bale", 27);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        
        System.out.println("----------------- Show all User");
        for(User user: users){
            System.out.println("Name: " + user.getName() + ", Age:" + user.getAge());
        }   
    
        System.out.println("----------------- Show array User reverse");
        Collections.reverse(users);
        for(User user: users){
            System.out.println("Name: " + user.getName() + ", Age:" + user.getAge());
        }   
        
        System.out.println("----------------- Show array User Sort age in ascending order");
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User user, User user1) {
                return user.getAge() - user1.getAge();
            }
        });
        for(User user: users){
            System.out.println("Name: " + user.getName() + ", Age:" + user.getAge());
        }   
                
        System.out.println("----------------- Show random list User");
        List<User> userRandom = new ArrayList<User>();
        for(int i = 0; i < users.size()+3; i++){
            User user = getRandom(users);
            userRandom.add(user);
            users = removeUser(users, user);
        }
        
        for(User user: userRandom){
            System.out.println("Name: " + user.getName() + ", Name:" + user.getAge());
        }   
        
    }    

    public static User getRandom(List<User> listUser){
        Random rand = new Random(); 
        return listUser.get(rand.nextInt(listUser.size()));
    }
    
    public static List<User> removeUser(List<User> listUser, User user){
        listUser.remove(user);
        return listUser;
    }
}
