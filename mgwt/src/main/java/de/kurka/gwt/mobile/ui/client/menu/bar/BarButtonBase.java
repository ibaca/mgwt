/*
 * Copyright 2010 Daniel Kurka
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
package de.kurka.gwt.mobile.ui.client.menu.bar;

import de.kurka.gwt.mobile.ui.client.MGWTStyle;
import de.kurka.gwt.mobile.ui.client.button.ButtonBase;
import de.kurka.gwt.mobile.ui.client.theme.base.ButtonBarCss;

/**
 * @author Daniel Kurka
 *
 */
public class BarButtonBase extends ButtonBase {
	protected final ButtonBarCss css;

	public BarButtonBase() {
		this(MGWTStyle.getDefaultClientBundle().getButtonBarCss());
	}

	public BarButtonBase(ButtonBarCss css) {
		super(css);
		this.css = css;
		this.css.ensureInjected();

		addStyleName(css.barButton());

	}
}
