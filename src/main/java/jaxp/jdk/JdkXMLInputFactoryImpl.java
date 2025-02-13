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

import java.io.InputStream;
import java.io.Reader;
import javax.xml.stream.EventFilter;
import javax.xml.stream.StreamFilter;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLReporter;
import javax.xml.stream.XMLResolver;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.XMLEventAllocator;
import javax.xml.transform.Source;

/**
 *
 * @author rmartinc
 */
public class JdkXMLInputFactoryImpl extends XMLInputFactory {

    private final XMLInputFactory wrapped;

    public JdkXMLInputFactoryImpl() {
        wrapped = newDefaultFactory();
    }

    @Override
    public XMLStreamReader createXMLStreamReader(Reader reader) throws XMLStreamException {
        return wrapped.createXMLStreamReader(reader);
    }

    @Override
    public XMLStreamReader createXMLStreamReader(Source source) throws XMLStreamException {
        return wrapped.createXMLStreamReader(source);
    }

    @Override
    public XMLStreamReader createXMLStreamReader(InputStream in) throws XMLStreamException {
        return wrapped.createXMLStreamReader(in);
    }

    @Override
    public XMLStreamReader createXMLStreamReader(InputStream in, String string) throws XMLStreamException {
        return wrapped.createXMLStreamReader(in, string);
    }

    @Override
    public XMLStreamReader createXMLStreamReader(String string, InputStream in) throws XMLStreamException {
        return wrapped.createXMLStreamReader(string, in);
    }

    @Override
    public XMLStreamReader createXMLStreamReader(String string, Reader reader) throws XMLStreamException {
        return wrapped.createXMLStreamReader(string, reader);
    }

    @Override
    public XMLEventReader createXMLEventReader(Reader reader) throws XMLStreamException {
        return wrapped.createXMLEventReader(reader);
    }

    @Override
    public XMLEventReader createXMLEventReader(String string, Reader reader) throws XMLStreamException {
        return wrapped.createXMLEventReader(string, reader);
    }

    @Override
    public XMLEventReader createXMLEventReader(XMLStreamReader reader) throws XMLStreamException {
        return wrapped.createXMLEventReader(reader);
    }

    @Override
    public XMLEventReader createXMLEventReader(Source source) throws XMLStreamException {
        return wrapped.createXMLEventReader(source);
    }

    @Override
    public XMLEventReader createXMLEventReader(InputStream in) throws XMLStreamException {
        return wrapped.createXMLEventReader(in);
    }

    @Override
    public XMLEventReader createXMLEventReader(InputStream in, String string) throws XMLStreamException {
        return wrapped.createXMLEventReader(in, string);
    }

    @Override
    public XMLEventReader createXMLEventReader(String string, InputStream in) throws XMLStreamException {
        return wrapped.createXMLEventReader(string, in);
    }

    @Override
    public XMLStreamReader createFilteredReader(XMLStreamReader reader, StreamFilter sf) throws XMLStreamException {
        return wrapped.createFilteredReader(reader, sf);
    }

    @Override
    public XMLEventReader createFilteredReader(XMLEventReader reader, EventFilter ef) throws XMLStreamException {
        return wrapped.createFilteredReader(reader, ef);
    }

    @Override
    public XMLResolver getXMLResolver() {
        return wrapped.getXMLResolver();
    }

    @Override
    public void setXMLResolver(XMLResolver xmlr) {
        wrapped.setXMLResolver(xmlr);
    }

    @Override
    public XMLReporter getXMLReporter() {
        return wrapped.getXMLReporter();
    }

    @Override
    public void setXMLReporter(XMLReporter xmlr) {
        wrapped.setXMLReporter(xmlr);
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
    public void setEventAllocator(XMLEventAllocator xmlea) {
        wrapped.setEventAllocator(xmlea);
    }

    @Override
    public XMLEventAllocator getEventAllocator() {
        return wrapped.getEventAllocator();
    }

    @Override
    public String toString() {
        return super.toString() + " wrapped=" + wrapped.toString();
    }
}
