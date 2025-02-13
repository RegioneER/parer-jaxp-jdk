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

import java.io.OutputStream;
import java.io.Writer;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;

/**
 *
 * @author rmartinc
 */
public class JdkXMLOutputFactoryImpl extends XMLOutputFactory {

    private final XMLOutputFactory wrapped;

    public JdkXMLOutputFactoryImpl() {
        wrapped = newDefaultFactory();
    }

    @Override
    public XMLStreamWriter createXMLStreamWriter(Writer writer) throws XMLStreamException {
        return wrapped.createXMLStreamWriter(writer);
    }

    @Override
    public XMLStreamWriter createXMLStreamWriter(OutputStream out) throws XMLStreamException {
        return wrapped.createXMLStreamWriter(out);
    }

    @Override
    public XMLStreamWriter createXMLStreamWriter(OutputStream out, String string) throws XMLStreamException {
        return wrapped.createXMLStreamWriter(out, string);
    }

    @Override
    public XMLStreamWriter createXMLStreamWriter(Result result) throws XMLStreamException {
        return wrapped.createXMLStreamWriter(result);
    }

    @Override
    public XMLEventWriter createXMLEventWriter(Result result) throws XMLStreamException {
        return wrapped.createXMLEventWriter(result);
    }

    @Override
    public XMLEventWriter createXMLEventWriter(OutputStream out) throws XMLStreamException {
        return wrapped.createXMLEventWriter(out);
    }

    @Override
    public XMLEventWriter createXMLEventWriter(OutputStream out, String string) throws XMLStreamException {
        return wrapped.createXMLEventWriter(out, string);
    }

    @Override
    public XMLEventWriter createXMLEventWriter(Writer writer) throws XMLStreamException {
        return wrapped.createXMLEventWriter(writer);
    }

    @Override
    public void setProperty(String string, Object o) throws IllegalArgumentException {
        wrapped.setProperty(string, o);
    }

    @Override
    public Object getProperty(String string) throws IllegalArgumentException {
        return wrapped.getProperty(string);
    }

    @Override
    public boolean isPropertySupported(String string) {
        return wrapped.isPropertySupported(string);
    }

    @Override
    public String toString() {
        return super.toString() + " wrapped=" + wrapped.toString();
    }
}
