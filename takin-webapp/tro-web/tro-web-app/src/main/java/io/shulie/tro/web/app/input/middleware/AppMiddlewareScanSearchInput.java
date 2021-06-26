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

package io.shulie.tro.web.app.input.middleware;

import io.shulie.tro.common.beans.page.PagingDevice;
import lombok.Data;

/**
 * @author 无涯
 * @Package io.shulie.tro.web.app.request.middleware
 * @date 2021/2/24 5:08 下午
 */
@Data
public class AppMiddlewareScanSearchInput extends PagingDevice {
    private String appName;
    private Integer status;
    private String type;
}