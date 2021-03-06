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

package com.teradata.tempto.fulfillment.table.jdbc;

import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;

public interface JdbcTableDataSource
{
    /**
     * Returns iterator over rows to be inserted to table.
     * Object types must match column types in table.
     * Object will be inserted using {@link PreparedStatement#setObject(int, Object)} method.
     *
     * @return iterator over rows to be inserted to table
     */
    Iterator<List<Object>> getDataRows();
}
