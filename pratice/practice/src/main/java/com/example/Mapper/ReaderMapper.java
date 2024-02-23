package com.example.Mapper;

import com.example.pojo.Reader;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface ReaderMapper {
    @Select("select * from reader where name = #{name} and password = #{password}")
    Reader getByUsernameAndPassword(Reader reader);
    @Insert("insert into reader(name,password,information,image) " +
            "values(#{name},#{password},#{infoemation},#{image})")
    void save(Reader reader);

    void update(Reader reader);
}
