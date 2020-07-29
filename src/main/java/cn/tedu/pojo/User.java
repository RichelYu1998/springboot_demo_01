package cn.tedu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor  //无参
@AllArgsConstructor //全参
@Accessors          //链式加载
public class User {
    private Integer id;
    private String name;
}
