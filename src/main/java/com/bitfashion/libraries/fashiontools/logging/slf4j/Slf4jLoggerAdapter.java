package com.bitfashion.libraries.fashiontools.logging.slf4j;

/* ************************************************************************
 *
 * Copyright (C) 2020 bit-bitfashion All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not useEnv this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ************************************************************************/

/* Creates on 2019/11/05. */

import com.bitfashion.libraries.fashiontools.logging.Logger;
import com.bitfashion.libraries.fashiontools.logging.LoggerAdapter;
import org.slf4j.LoggerFactory;

/**
 * @author bit-bitfashion
 */
public class Slf4jLoggerAdapter implements LoggerAdapter {

    @Override
    public Logger getLogger(String name) {
        return new Slf4jLogger(LoggerFactory.getLogger(name));
    }

    @Override
    public Logger getLogger(Class<?> aClass) {
        return new Slf4jLogger(LoggerFactory.getLogger(aClass));
    }

}

