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

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/**
 *
 * @author rmartinc
 */
public class JdkXMLReaderImpl implements XMLReader {

    private final XMLReader wrapped;

    public JdkXMLReaderImpl() {
        try {
            wrapped = SAXParserFactory.newDefaultInstance().newSAXParser().getXMLReader();
        } catch (ParserConfigurationException | SAXException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public boolean getFeature(String string) throws SAXNotRecognizedException, SAXNotSupportedException {
        return wrapped.getFeature(string);
    }

    @Override
    public void setFeature(String string, boolean bln) throws SAXNotRecognizedException, SAXNotSupportedException {
        wrapped.setFeature(string, bln);
    }

    @Override
    public Object getProperty(String string) throws SAXNotRecognizedException, SAXNotSupportedException {
        return wrapped.getProperty(string);
    }

    @Override
    public void setProperty(String string, Object o) throws SAXNotRecognizedException, SAXNotSupportedException {
        wrapped.setProperty(string, o);
    }

    @Override
    public void setEntityResolver(EntityResolver er) {
        wrapped.setEntityResolver(er);
    }

    @Override
    public EntityResolver getEntityResolver() {
        return wrapped.getEntityResolver();
    }

    @Override
    public void setDTDHandler(DTDHandler dtdh) {
        wrapped.setDTDHandler(dtdh);
    }

    @Override
    public DTDHandler getDTDHandler() {
        return wrapped.getDTDHandler();
    }

    @Override
    public void setContentHandler(ContentHandler ch) {
        wrapped.setContentHandler(ch);
    }

    @Override
    public ContentHandler getContentHandler() {
        return wrapped.getContentHandler();
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
    public void parse(InputSource is) throws IOException, SAXException {
        wrapped.parse(is);
    }

    @Override
    public void parse(String string) throws IOException, SAXException {
        wrapped.parse(string);
    }

    @Override
    public String toString() {
        return super.toString() + " wrapped=" + wrapped.toString();
    }
}
