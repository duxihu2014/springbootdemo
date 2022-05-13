# bootdemo
springboot+mybatis+mysql+json


流程：
1.
http://localhost:8080/HelloWorld/api/find

2.控制层
@RequestMapping("/api")
UserController
@RequestMapping("/find")
public String find(){

3.业务层
UserService
调用find()

4.持久层：操作数据库
UserMapper
public User find(int id);
对应
<select id="find" parameterType="int" resultType="smm.springboot_ftl.bean.User">
SELECT ID,USERNAME,PASSWORD,AGE FROM USER WHERE ID=#{0}
</select>
