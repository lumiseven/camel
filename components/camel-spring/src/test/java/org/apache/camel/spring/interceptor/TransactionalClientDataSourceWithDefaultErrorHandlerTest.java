/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.spring.interceptor;

import org.junit.jupiter.api.BeforeEach;

/**
 * Using the default error handler = DeadLetterChannel to unit test that this works out of the box
 * also, that Camel doesn't break.
 */
public class TransactionalClientDataSourceWithDefaultErrorHandlerTest extends TransactionalClientDataSourceTest {

    @Override
    @BeforeEach
    public void setUp() throws Exception {
        super.setUp();
        useTransactionErrorHandler = false;
    }
    
}
