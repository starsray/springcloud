package com.cloud.account.mapper;

import com.cloud.entity.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}