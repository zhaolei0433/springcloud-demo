package com.example.feignclient.service.feign;

import com.example.feignclient.model.Result;
import com.example.feignclient.model.UserInfo;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhaolei
 * Create: 2020/2/18 15:18
 * Modified By:
 * Description:
 */
@FeignClient(name = "UserService", fallbackFactory = IUserService.UserServiceFallback.class)
public interface IUserService {

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userId}")
    Result<UserInfo> getUserById(@PathVariable("userId") Integer userId);

    @Component
    class UserServiceFallback implements FallbackFactory<IUserService>{

        @Override
        public IUserService create(Throwable throwable) {
            return userId -> new Result<>(throwable);
        }
    }

    /*@Component
    class UserServiceFallback implements IUserService{

        @Override
        public Result<UserInfo> getUserById(Integer userId) {
            return new Result<>();
        }
    }*/

}
