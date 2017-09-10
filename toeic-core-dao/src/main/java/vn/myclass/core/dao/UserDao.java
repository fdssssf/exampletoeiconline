package vn.myclass.core.dao;

import vn.myclass.core.data.dao.GenericDao;
import vn.myclass.core.persistence.entity.RoleEntity;
import vn.myclass.core.persistence.entity.UserEntity;

/**
 * Created by Admin on 9/7/2017.
 */
public interface UserDao extends GenericDao<Integer, UserEntity> {
    Object[] checkLogin(String name, String password);
}
