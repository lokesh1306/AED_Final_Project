/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Worker.Worker;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lokavarapusatishkumar
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccList;

    public UserAccountDirectory() {
        userAccList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccList;
    }
    
    public UserAccount getUserAccount(String username) {
        for (UserAccount ua : userAccList) {
            if (ua.getUsername().equals(username)) {
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Worker employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public void deleteUserAccount(UserAccount inputUserAcc) {
        Iterator<UserAccount> ir = userAccList.iterator();
        while (ir.hasNext()) {
            UserAccount ua = ir.next();
            if (ua.getUsername().equals(inputUserAcc.getUsername())) {
                ir.remove();
            }
        }
    }
    
     public void editUserAccount(String oldName, String newusername, String pwd) {
        for (UserAccount ua : userAccList) {
            if (ua.getUsername().equals(oldName)) {
               ua.setUsername(newusername);
               ua.setPassword(pwd);
            }
        }
    }
}
