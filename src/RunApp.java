/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win-7
 */
public class RunApp {
    public static void main(String[] args) {
        User user1 = new User(true, "mariana", "1234");

        AbstractForm form = new Form(user1, "mariana", "1234");
        System.out.println(form.isAuthorizedToPerformOperation(user1));
        
    }
}
