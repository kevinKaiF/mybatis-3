/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.executor.keygen;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;

import java.sql.Statement;

/**
 * 主键填充
 * 注意：只有当configuration启用useGeneratedKeys才有效
 *
 * @author Clinton Begin
 */
public interface KeyGenerator {

  /**
   * 执行statement语句之前执行
   *
   * @param executor
   * @param ms
   * @param stmt
   * @param parameter
     */
  void processBefore(Executor executor, MappedStatement ms, Statement stmt, Object parameter);

  /**
   * 执行statement语句之后执行
   * 注意：在statement执行update的时候才会触发，即insert,update
   *
   * @param executor
   * @param ms
   * @param stmt
   * @param parameter
     */
  void processAfter(Executor executor, MappedStatement ms, Statement stmt, Object parameter);

}
