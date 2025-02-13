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

import java.io.File;
import java.net.URL;

import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/**
 *
 * @author rmartinc
 *
 */
public class JdkXMLSchemaFactoryImpl extends SchemaFactory {

    private final SchemaFactory wrapped;

    public JdkXMLSchemaFactoryImpl() {
        super();
        wrapped = newDefaultInstance();
    }

    @Override
    public boolean isSchemaLanguageSupported(String string) {
        return wrapped.isSchemaLanguageSupported(string);
    }

    @Override
    public void setErrorHandler(ErrorHandler eh) {
        wrapped.setErrorHandler(eh);
    }

    @Override
    public ErrorHandler getErrorHandler() {
        return wrapped.getErrorHandler();
    }

    @Override
    public void setResourceResolver(LSResourceResolver lsrr) {
        wrapped.setResourceResolver(lsrr);
    }

    @Override
    public LSResourceResolver getResourceResolver() {
        return wrapped.getResourceResolver();
    }

    @Override
    public Schema newSchema(Source[] sources) throws SAXException {
        return wrapped.newSchema(sources);
    }

    @Override
    public Schema newSchema() throws SAXException {
        return wrapped.newSchema();
    }

    @Override
    public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException {
        wrapped.setFeature(name, value);
    }

    @Override
    public void setProperty(String name, Object object) throws SAXNotRecognizedException, SAXNotSupportedException {
        wrapped.setProperty(name, object);
    }

    @Override
    public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException {
        return wrapped.getFeature(name);
    }

    @Override
    public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException {
        return wrapped.getProperty(name);
    }

    @Override
    public Schema newSchema(File schema) throws SAXException {
        return wrapped.newSchema(schema);
    }

    @Override
    public Schema newSchema(Source schema) throws SAXException {
        return wrapped.newSchema(schema);
    }

    @Override
    public Schema newSchema(URL schema) throws SAXException {
        return wrapped.newSchema(schema);
    }

    @Override
    public String toString() {
        return super.toString() + " wrapped=" + wrapped.toString();
    }
}
