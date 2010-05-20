/*
 * Copyright (c) 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.data.client.generator;

import com.google.api.data.client.generator.model.Version;

import java.io.PrintWriter;

/**
 * @author Yaniv Inbar
 */
public final class MainPackageFileGenerator extends AbstractHtmlFileGenerator {

  private final Version version;

  MainPackageFileGenerator(Version version) {
    this.version = version;
  }

  public void generate(PrintWriter out) {
    out.println("<body>");
    out.println("Small optional Java library for " + version.client.name
        + " version " + version.id + ".");
    out.println("");
    out.println("<p><b>Warning: this package is experimental, and its content "
        + "may be changed in incompatible ways or possibly entirely removed "
        + "in a future version of the library</b></p>");
    out.println("");
    out.println("@since 2.2");
    out.println("</body>");
    out.close();
  }

  public String getOutputFilePath() {
    return "src/" + version.getPathRelativeToSrc() + "/package.html";
  }
}
