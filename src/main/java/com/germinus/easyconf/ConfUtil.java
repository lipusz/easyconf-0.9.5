/*
 * Copyright 2004-2005 Germinus XXI
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
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
package com.germinus.easyconf;

import org.apache.commons.configuration.Configuration;

import java.util.Iterator;

/**
 * Utility methods
 *
 * @author jferrer
 */
class ConfUtil {
    /**
     * 返回<tt>configuration</tt>的文本表示
     *
     * @param configuration
     * @return
     */
    public static String toString(Configuration configuration) {
        Iterator it = configuration.getKeys();
        StringBuffer result = new StringBuffer();
        result.append("{");
        while (it.hasNext()) {
            String key = (String) it.next();
            result.append(key + "=" + configuration.getProperty(key));
            result.append(", ");
        }
        result.append("}");
        return result.toString();
    }


}
