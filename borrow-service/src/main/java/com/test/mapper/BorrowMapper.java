package com.test.mapper;

import com.test.entity.borrow.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.awt.print.Book;
import java.util.List;

/**
 * @author zzq
 * @date 2023年06月09日 11:47
 */
@Mapper
public interface BorrowMapper {
    @Select("select * from db_borrow where bid = #{bid}")
    List<Borrow> getBorrowByBidAPI(int bid);
    @Select("select * from db_borrow where uid = #{uid}")
    List<Borrow>  getBorrowByUidAPI(int bid);

    @Select("select * from db_borrow where uid = #{uid} and bid = #{bid}")
    Borrow getBorrowByUidAndBidAPI(int uid , int bid);

}
