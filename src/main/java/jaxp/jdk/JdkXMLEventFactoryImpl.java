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

import java.util.Iterator;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.Location;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.Comment;
import javax.xml.stream.events.DTD;
import javax.xml.stream.events.EndDocument;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.EntityDeclaration;
import javax.xml.stream.events.EntityReference;
import javax.xml.stream.events.Namespace;
import javax.xml.stream.events.ProcessingInstruction;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;

/**
 *
 * @author rmartinc
 */
public class JdkXMLEventFactoryImpl extends XMLEventFactory {

    private final XMLEventFactory wrapped;

    public JdkXMLEventFactoryImpl() {
        wrapped = newDefaultFactory();
    }

    @Override
    public void setLocation(Location lctn) {
        wrapped.setLocation(lctn);
    }

    @Override
    public Attribute createAttribute(String string, String string1, String string2, String string3) {
        return wrapped.createAttribute(string, string1, string2, string3);
    }

    @Override
    public Attribute createAttribute(String string, String string1) {
        return wrapped.createAttribute(string, string1);
    }

    @Override
    public Attribute createAttribute(QName qname, String string) {
        return wrapped.createAttribute(qname, string);
    }

    @Override
    public Namespace createNamespace(String string) {
        return wrapped.createNamespace(string);
    }

    @Override
    public Namespace createNamespace(String string, String string1) {
        return wrapped.createNamespace(string, string1);
    }

    @Override
    public StartElement createStartElement(QName qname, Iterator<? extends Attribute> itrtr,
            Iterator<? extends Namespace> itrtr1) {
        return wrapped.createStartElement(qname, itrtr, itrtr1);
    }

    @Override
    public StartElement createStartElement(String string, String string1, String string2) {
        return wrapped.createStartElement(string, string1, string2);
    }

    @Override
    public StartElement createStartElement(String string, String string1, String string2,
            Iterator<? extends Attribute> itrtr, Iterator<? extends Namespace> itrtr1) {
        return wrapped.createStartElement(string, string1, string2, itrtr, itrtr1);
    }

    @Override
    public StartElement createStartElement(String string, String string1, String string2,
            Iterator<? extends Attribute> itrtr, Iterator<? extends Namespace> itrtr1, NamespaceContext nc) {
        return wrapped.createStartElement(string, string1, string2, itrtr, itrtr1, nc);
    }

    @Override
    public EndElement createEndElement(QName qname, Iterator<? extends Namespace> itrtr) {
        return wrapped.createEndElement(qname, itrtr);
    }

    @Override
    public EndElement createEndElement(String string, String string1, String string2) {
        return wrapped.createEndElement(string, string1, string2);
    }

    @Override
    public EndElement createEndElement(String string, String string1, String string2,
            Iterator<? extends Namespace> itrtr) {
        return wrapped.createEndElement(string, string1, string2, itrtr);
    }

    @Override
    public Characters createCharacters(String string) {
        return wrapped.createCharacters(string);
    }

    @Override
    public Characters createCData(String string) {
        return wrapped.createCData(string);
    }

    @Override
    public Characters createSpace(String string) {
        return wrapped.createSpace(string);
    }

    @Override
    public Characters createIgnorableSpace(String string) {
        return wrapped.createIgnorableSpace(string);
    }

    @Override
    public StartDocument createStartDocument() {
        return wrapped.createStartDocument();
    }

    @Override
    public StartDocument createStartDocument(String string, String string1, boolean bln) {
        return wrapped.createStartDocument(string, string1, bln);
    }

    @Override
    public StartDocument createStartDocument(String string, String string1) {
        return wrapped.createStartDocument(string, string1);
    }

    @Override
    public StartDocument createStartDocument(String string) {
        return wrapped.createStartDocument(string);
    }

    @Override
    public EndDocument createEndDocument() {
        return wrapped.createEndDocument();
    }

    @Override
    public EntityReference createEntityReference(String string, EntityDeclaration ed) {
        return wrapped.createEntityReference(string, ed);
    }

    @Override
    public Comment createComment(String string) {
        return wrapped.createComment(string);
    }

    @Override
    public ProcessingInstruction createProcessingInstruction(String string, String string1) {
        return wrapped.createProcessingInstruction(string, string1);
    }

    @Override
    public DTD createDTD(String string) {
        return wrapped.createDTD(string);
    }

    @Override
    public String toString() {
        return super.toString() + " wrapped=" + wrapped.toString();
    }
}
