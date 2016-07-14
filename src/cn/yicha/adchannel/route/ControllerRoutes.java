package cn.yicha.adchannel.route;

import cn.yicha.adchannel.controller.ChannelController;
import cn.yicha.adchannel.controller.LoginController;
import cn.yicha.adchannel.controller.IndexController;
import cn.yicha.adchannel.controller.ProductController;

import com.jfinal.config.Routes;

/** 
 * @TODO   路由配置
 * @author yicha
 * @date   2015年10月20日 
 */
public class ControllerRoutes extends Routes {

	@Override
	public void config() {
		// TODO Auto-generated method stub
		add("/", LoginController.class);
		add("/index", IndexController.class);
		add("/channel", ChannelController.class);
		add("/product", ProductController.class);
	}

}