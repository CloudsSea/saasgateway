package edu.njtu.saasgateway.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.njtu.saasgateway.config.RabbitConfig;
import edu.njtu.saasgateway.mapper.PicMapper;
import edu.njtu.saasgateway.model.Pic;

/**
 * Created by Donghua.Chen on 2018/6/20.
 */
@RestController
@RequestMapping("/pic")
//@Api(tags = "1.1", description = "用户管理", value = "用户管理")
public class PicHandlerController {
	private static final Logger log = LoggerFactory.getLogger(PicHandlerController.class);

	private final RabbitTemplate rabbitTemplate;
    @Autowired
    public PicHandlerController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
    
    @Autowired
    private PicMapper picMapper;

//    @ApiOperation(value = "添加用户（DONE）")
    @PostMapping
    public Map<String, String> post(Long userId,String fileName) {
        log.info("如果是 POST PUT 这种带 @RequestBody 的可以不用写 @ApiImplicitParam");
        String result = "success";
        try {
        	Pic pic = new Pic(userId,fileName);
			picMapper.insertSelective(pic);
			
			this.rabbitTemplate.convertAndSend(RabbitConfig.DEFAULT_BOOK_QUEUE, pic);
	        this.rabbitTemplate.convertAndSend(RabbitConfig.MANUAL_BOOK_QUEUE, pic);
			
		} catch (Exception e) {
			// TODO: handle exception
			result = "error";
			e.printStackTrace();
		}
        Map<String,String> map = new HashMap<String,String>();
        map.put("result",result);
        return map;
    }

//    @ApiOperation(value = "修改用户（DONE）")
    @PutMapping("/{picId}")
    public void put(@PathVariable Long picId, @RequestBody Pic pic) {
        log.info("如果你不想写 @ApiImplicitParam 那么 swagger 也会使用默认的参数名作为描述信息 ");
    }
}
