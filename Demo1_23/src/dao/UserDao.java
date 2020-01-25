package dao;
import java.util.List;
import entity.MyUser;

public interface UserDao {
    public boolean login(String name,String password);
    public boolean register(MyUser user);
    public List<MyUser> getUserAll();//返回用户信息集合
    public boolean delete(String id);//根据id删除
    public boolean update(String name, String id);
}

