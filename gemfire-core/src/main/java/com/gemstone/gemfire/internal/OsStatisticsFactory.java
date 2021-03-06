/*
 * Copyright (c) 2010-2015 Pivotal Software, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
package com.gemstone.gemfire.internal;

import com.gemstone.gemfire.*;

/**
 * Instances of this interface provide methods that create operating system
 * instances of {@link com.gemstone.gemfire.Statistics}. Its for internal use 
 * only.
 *
 * {@link com.gemstone.gemfire.distributed.DistributedSystem} is an OS 
 * statistics factory.
 * <P>
 * @see <A href="package-summary.html#statistics">Package introduction</A>
 *
 * @author Darrel Schneider
 *
 * @since 3.0
 */
public interface OsStatisticsFactory {
  /**
   * Creates and returns a OS {@link Statistics} instance of the given {@link StatisticsType type}, <code>textId</code>, <code>numericId</code>, and <code>osStatFlags</code>..
   * <p>
   * The created instance may not be {@link Statistics#isAtomic atomic}.
   */
  public Statistics createOsStatistics(StatisticsType type, String textId, long numericId, int osStatFlags);
}
