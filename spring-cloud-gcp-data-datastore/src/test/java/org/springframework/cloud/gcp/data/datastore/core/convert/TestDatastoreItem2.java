/*
 *  Copyright 2018 original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.cloud.gcp.data.datastore.core.convert;

import java.math.BigInteger;

/**
 * @author Dmitry Solomakha
 */
class TestDatastoreItem2 {
	private String stringField;

	private BigInteger unsupportedField;

	public String getStringField() {
		return this.stringField;
	}

	public void setStringField(String stringField) {
		this.stringField = stringField;
	}

	public BigInteger getUnsupportedField() {
		return this.unsupportedField;
	}

	public void setUnsupportedField(BigInteger unsupportedField) {
		this.unsupportedField = unsupportedField;
	}
}