package cn.jinterest.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.jinterest.common.utils.PageUtils;
import cn.jinterest.ware.entity.WmsPurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author JInterest
 * @email hwj2586@163.com
 * @date 2020-10-29 22:48:49
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
