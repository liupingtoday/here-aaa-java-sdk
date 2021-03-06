/*
 * Copyright (c) 2018 HERE Europe B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.here.account.oauth2;

import java.util.function.Supplier;

/**
 * An interface that lets you get Access Tokens, for use with HERE Services.
 * A Supplier&lt;String&gt; of Access Tokens.
 *
 * <p>
 * See <a href="https://tools.ietf.org/html/rfc6749#section-7.1">OAuth2.0</a>,
 * and <a href="https://tools.ietf.org/html/rfc6750">OAuth2.0 Bearer Token Usage</a>
 * for details.
 *
 * @author kmccrack
 */
public interface AccessTokenSupplier extends Supplier<String> {

    /**
     * Gets an OAuth2.0 Access Token.
     *
     * @return the access token
     */
    @Override
    String get();

}
