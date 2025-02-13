/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna
 * <p/>
 * This program is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

/**
 * To the extent possible under law, Red Hat, Inc. has dedicated all copyright
 * to this software to the public domain worldwide, pursuant to the CC0 Public
 * Domain Dedication. This software is distributed without any warranty.
 * See <http://creativecommons.org/publicdomain/zero/1.0/>.
 */
package jaxp.jdk;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;

import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/**
 *
 * @author rmartinc
 */
public class JdkSAXParserFactoryImpl extends SAXParserFactory {

    private final SAXParserFactory wrapped;

    public JdkSAXParserFactoryImpl() {
        wrapped = newDefaultInstance();
    }

    @Override
    public SAXParser newSAXParser() throws ParserConfigurationException, SAXException {
        return wrapped.newSAXParser();
    }

    @Override
    public void setFeature(String string, boolean bln)
            throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
        wrapped.setFeature(string, bln);
    }

    @Override
    public boolean getFeature(String string)
            throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
        return wrapped.getFeature(string);
    }

    @Override
    public Schema getSchema() {
        return wrapped.getSchema();
    }

    @Override
    public boolean isNamespaceAware() {
        return wrapped.isNamespaceAware();
    }

    @Override
    public boolean isValidating() {
        return wrapped.isValidating();
    }

    @Override
    public boolean isXIncludeAware() {
        return wrapped.isXIncludeAware();
    }

    @Override
    public void setNamespaceAware(boolean awareness) {
        wrapped.setNamespaceAware(awareness);
    }

    @Override
    public void setSchema(Schema schema) {
        wrapped.setSchema(schema);
    }

    @Override
    public void setValidating(boolean validating) {
        wrapped.setValidating(validating);
    }

    @Override
    public void setXIncludeAware(boolean state) {
        wrapped.setXIncludeAware(state);
    }

    @Override
    public String toString() {
        return super.toString() + " wrapped=" + wrapped.toString();
    }
}
