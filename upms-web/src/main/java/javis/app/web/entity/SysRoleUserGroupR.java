package javis.app.web.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import javis.app.web.base.BaseEntity;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户登录记录表
 * </p>
 *
 * @author javis
 * @since 2018-04-22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_role_user_group_r")
public class SysRoleUserGroupR extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户组id
     */
    @TableField("user_group_id")
    private Integer userGroupId;
    /**
     * 角色id
     */
    @TableField("role_id")
    private Integer roleId;


}
