/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.openapi.build;

/**
 * @author Vladislav.Soroka
 * @since 4/29/2016
 */
public interface BuildChunkStatusNotification {

  /**
   *
   * @param aborted  true if the build chunk has been cancelled.
   * @param errors   error count
   * @param warnings warning count
   * @param buildContext context for the build chunk
   */
  void finished(boolean aborted, int errors, int warnings, final BuildContext buildContext);
}
