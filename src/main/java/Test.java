
/*
 * Copyright (C), 2002-2016, 苏宁易购电子商务有限公司
 * FileName: XX.java
 * Author:   16080232
 * Date:     2016年8月8日 下午3:07:40
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author hunter(16080232)
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);
    private static Logger logger2 = LoggerFactory.getLogger("fds");
    static {
        logger.debug("[gogo]haha:{}:{}",1,2);
        logger.debug("[gogo]haha111:{}:{}",new Object[]{2,3});
        logger2.debug("fdsfds");
    }

    public static void main(String[] args) {
        for(int i=0;i<10000;i++){
            logger.debug("[gogo]haha:{}:{}",1,2);
            logger.debug("[gogo]haha111:{}:{}",new Object[]{2,3});
            logger2.debug("fdsfds");
        }
        System.out.println("go");
    }

}
