/*
 * The MIT License
 *
 *   Copyright (c) 2013, benas (md.benhassine@gmail.com)
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */

package io.github.benas.jpopulator.api;

import java.util.List;

/**
 * Interface for java bean populator.
 *
 * @author benas (md.benhassine@gmail.com)
 */
public interface Populator {

    /**
     * Populate a java bean instance for the given type.
     *
     * @param type the type for which a java bean instance will be populated
     * @return a populated instance of the given type
     */
    <T> T populateBean(Class<T> type);

    /**
     * Populate a random number of java bean instances for the given type.
     *
     * @param type the type for which java bean instances will be populated
     * @return a list of populated instances of the given type
     */
    <T> List<T> populateBeans(Class<T> type);

    /**
     * Populate a fixed number of java bean instances for the given type.
     *
     * @param type the type for which java bean instances will be populated
     * @param size the number of instances to populate
     * @return a list of populated instances of the given type
     */
    <T> List<T> populateBeans(Class<T> type, int size);

}
