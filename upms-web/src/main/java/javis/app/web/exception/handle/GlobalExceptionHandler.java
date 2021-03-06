package javis.app.web.exception.handle;

import javis.app.common.contants.ResultEnum;
import javis.app.common.exception.BusinessException;
import javis.app.common.response.ServerResult;
import javis.app.common.response.SysResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Javis
 * @desc  统一异常处理
 * @date 2017-11-14
 * @time 下午11:01
 */
@ControllerAdvice
@RestController
@Log4j2
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ServerResult handle(Exception e) {
        if (e instanceof BusinessException) {
            BusinessException exception = (BusinessException) e;
            return SysResponse.error(exception);
        }
        log.error("系统异常：{}", e);
        return SysResponse.error(ResultEnum.SYSTEM_EXCEPTION);
    }
}
