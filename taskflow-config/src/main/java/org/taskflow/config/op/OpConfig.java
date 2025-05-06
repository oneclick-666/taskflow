package org.taskflow.config.op;

import lombok.Data;
import org.taskflow.config.op.param.OpParamConfig;

import java.util.Map;

/**
 * OP节点配置
 * 包括：入参配置，全局配置等
 * Created by ytyht226 on 2022/11/23.
 */
@Data
public class OpConfig {
    /**
     * OP参数配置
     */
    protected OpParamConfig opParamConfig;
    /**
     * 其它配置
     */
    protected Map<String, Object> extMap;
}