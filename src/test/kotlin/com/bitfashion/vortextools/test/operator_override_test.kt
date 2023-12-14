package com.bitfashion.vortextools.test

/* ************************************************************************
 *
 * Copyright (C) 2020 bit-fashion All rights reserved.
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

/* Creates on 2023/6/21. */

data class _Point(private var x: Float, private var y: Float) {
    operator fun times(vec: _Point): _Point =
            _Point(x * vec.x, y * vec.y)
}

fun main() {
    println(_Point(2.0f, 3.0f) * _Point(1.0f, 5.0f))
}