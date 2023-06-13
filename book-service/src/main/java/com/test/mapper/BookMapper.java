package com.test.mapper;

import com.test.entity.book.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author zzq
 * @date 2023年06月09日 11:01
 */
@Mapper
public interface BookMapper {
 @Select("select * from db_book where bid = #{bid}")
 Book getBookByIdAPI(int bid);

}
