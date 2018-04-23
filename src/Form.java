/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win-7
 */
public class Form extends AbstractForm{
    private String login;
    private String passaword;

    public Form(User user, String login, String passaword) {
        super(user);
        this.login = login;
        this.passaword = passaword;
    }
    

    @Override
    protected boolean validateUser(User user) {
        if(user.isAutorized()){
            if((user.login == this.login) && (user.passaword == this.passaword)){
                return true;}
            else{
                return false;}
        }
        else{
            return false;}
    }

    @Override
    protected void logicOfBusiness() {
        System.out.println("Fazendo a lógica de negócio para o Form");
    }

}
