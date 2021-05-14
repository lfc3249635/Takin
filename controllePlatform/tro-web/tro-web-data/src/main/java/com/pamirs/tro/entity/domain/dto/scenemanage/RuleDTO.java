/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pamirs.tro.entity.domain.dto.scenemanage;

import java.math.BigDecimal;

import com.pamirs.tro.entity.domain.vo.scenemanage.RuleVO;
import lombok.Data;

/**
 * @ClassName RuleDTO
 * @Description
 * @Author qianshui
 * @Date 2020/4/18 上午11:00
 */
@Data
public class RuleDTO extends RuleVO {

    private static final long serialVersionUID = 2831535102147741422L;

    public void RuleDTO() {

    }

    public void RuleDTO(Integer indexInfo, Integer condition, BigDecimal during, Integer times) {
        this.setIndexInfo(indexInfo);
        this.setCondition(condition);
        this.setDuring(during);
        this.setTimes(times);
    }
}