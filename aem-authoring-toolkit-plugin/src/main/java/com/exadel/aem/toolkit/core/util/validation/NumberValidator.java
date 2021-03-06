/*
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
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
package com.exadel.aem.toolkit.core.util.validation;

import com.exadel.aem.toolkit.api.annotations.meta.Validator;

/**
 *  {@link Validator} implementation for testing that provided value is of numeric type
 */
public class NumberValidator implements Validator {
    private static final String MSG_NUMBER_EXPECTED = "numeric value expected";

    /**
     * Tests that the provided value is of numeric type
     * @param obj Generic value
     * @return True or false
     */
    @Override
    public boolean test(Object obj) {
        try {
            Double.valueOf(obj.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * {@inheritDoc}. In {@code NumberValidator}, defines the allow-all kind of predicate
     */
    @Override
    public boolean isApplicableTo(Object obj) {
        return true;
    }

    /**
     * {@inheritDoc}. In {@code NumberValidator}, defines the zero-change function
     */
    @Override
    public Object getFilteredValue(Object obj) {
        return obj;
    }

    @Override
    public String getWarningMessage() {
        return MSG_NUMBER_EXPECTED;
    }
}
