package cn.tedu.controller;


import cn.tedu.pojo.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@ConfigurationProperties(prefix = "jdbc")//定义属性前缀
@RestController//保证返回的数据转化为JSON
public class JDBCController2 {
    //批量为属性赋值，属性名一致时自动赋值
    private String username;	//定义数据库用户名
    private String password;    //定义数据库密码
    //为属性赋值时，一定会调用对象的set方法

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @RequestMapping("/getMsgPrefix")
    public String GetMsgValue(){
        User user = new User();
        user.setName("aaa");
        return username+"|"+password;
    }
}
