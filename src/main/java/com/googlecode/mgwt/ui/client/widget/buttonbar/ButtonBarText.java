/*
 * Copyright 2014 Daniel Kurka
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
package com.googlecode.mgwt.ui.client.widget.buttonbar;

import com.google.gwt.user.client.ui.HasHTML;

import com.googlecode.mgwt.ui.client.widget.touch.TouchWidget;

public class ButtonBarText extends TouchWidget implements HasHTML {

  private ButtonBarAppearance appearance;

  public ButtonBarText() {
    this(ButtonBar.DEFAULT_APPEARANCE, "");
  }

  public ButtonBarText(String html) {
    this(ButtonBar.DEFAULT_APPEARANCE, html);
  }

  public ButtonBarText(ButtonBarAppearance appearance, String html) {
    this.appearance = appearance;
    setElement(this.appearance.barText().createAndBindUi(this));
    setHTML(html);
  }

  @Override
  public String getText() {
    return getElement().getInnerText();
  }

  @Override
  public void setText(String text) {
    getElement().setInnerText(text);
  }

  @Override
  public String getHTML() {
    return getElement().getInnerHTML();
  }

  @Override
  public void setHTML(String html) {
    getElement().setInnerHTML(html);
  }
}
