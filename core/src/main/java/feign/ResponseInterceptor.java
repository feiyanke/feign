/*
 * Copyright 2012-2022 The Feign Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package feign;

import java.util.function.Function;

/**
 * Zero or One {@code ResponseInterceptor} may be configured for purposes such as verify or modify
 * headers of response, verify the business status of decoded object. Once interceptors are applied,
 * {@link ResponseInterceptor#aroundDecode(Response, Function)} is called around decode method
 * called
 */
public interface ResponseInterceptor {

  /**
   * Called for response around decode, user can use supplied {@link Function} decoder function to
   * decode response data.
   *
   * @param response
   * @param decoder
   * @return
   */
  void aroundDecode(Response response, Function<Response, Object> decoder);

}
