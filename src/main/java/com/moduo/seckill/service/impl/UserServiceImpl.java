package com.moduo.seckill.service.impl;

import com.moduo.seckill.pojo.User;
import com.moduo.seckill.mapper.UserMapper;
import com.moduo.seckill.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Wuzicong
 * @since 2021-09-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
