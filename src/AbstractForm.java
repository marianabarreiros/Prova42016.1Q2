/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win-7
 */
public abstract class AbstractForm {
    protected User user;
    
    protected AbstractForm(User user){
        this.user = user;
    }
    
    public boolean isAuthorizedToPerformOperation(User user){
        if(validateUser(user)){
            logOperation();
            logicOfBusiness();
            return true;
        }
        else{
            return false;
        }
    }
    
    protected abstract boolean validateUser(User user);
    protected abstract void logicOfBusiness();

    private void logOperation() {
        System.out.println("Fazendo Log da operação");
    }
}
