/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.User;

/**
 *
 * @author Admin 88
 */
public interface IUserRepository {
        List<User> getUser(String TaiKhoan, String MatKhau);

}
