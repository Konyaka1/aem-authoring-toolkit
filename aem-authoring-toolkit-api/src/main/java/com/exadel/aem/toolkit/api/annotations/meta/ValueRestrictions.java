/*
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
package com.exadel.aem.toolkit.api.annotations.meta;

/**
 * Contains value restrictions processed by built-in {@link Validator} implementations
 * @see ValueRestriction
 */
@SuppressWarnings("unused")
public class ValueRestrictions {
    public static final String NUMBER = "NumberValidator";
    public static final String POSITIVE = "PositiveNumberValidator";
    public static final String NON_NEGATIVE = "NonNegativeNumberValidator";
    public static final String NOT_BLANK = "NotBlankValidator";
    public static final String ALL_NOT_BLANK = "AllNotBlankValidator";
    public static final String JCR_PATH = "JcrPathValidator";
    private ValueRestrictions() {}
}
