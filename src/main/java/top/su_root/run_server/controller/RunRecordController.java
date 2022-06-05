package top.su_root.run_server.controller;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import static top.su_root.run_server.utils.ConstUtil.RUN_RECORD;

/**
 * @author zzy
 * @description:
 * @date 2022/5/30 15:09
 */

@Api(tags = RUN_RECORD)
@CrossOrigin
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RunRecordController {
}
