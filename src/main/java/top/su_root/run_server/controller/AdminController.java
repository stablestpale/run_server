package top.su_root.run_server.controller;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import static top.su_root.run_server.utils.ConstUtil.ADMIN;

/**
 * @author zzy
 * @description:
 * @date 2022/6/5 10:54
 */

@Api(tags = ADMIN)
@CrossOrigin
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdminController {
}
