package javis.app.web.service.impl;

import javis.app.web.entity.SysAuthApi;
import javis.app.web.dao.SysAuthApiMapper;
import javis.app.web.service.ISysAuthApiService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author javis
 * @since 2018-04-22
 */
@Service
public class SysAuthApiServiceImpl extends ServiceImpl<SysAuthApiMapper, SysAuthApi> implements ISysAuthApiService {

}
