/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win-7
 */
public class User {
    protected boolean canApply;
    protected String login;
    protected String passaword;

    public User(boolean canApply, String login, String passaword) {
        this.canApply = canApply;
        this.login = login;
        this.passaword = passaword;
    }

    public boolean isAutorized(){
        return canApply;
    }

}
