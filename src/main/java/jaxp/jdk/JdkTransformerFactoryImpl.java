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

import javax.xml.transform.ErrorListener;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.URIResolver;

/**
 *
 * @author rmartinc
 */
public class JdkTransformerFactoryImpl extends TransformerFactory {

    private final TransformerFactory wrapped;

    public JdkTransformerFactoryImpl() {
        wrapped = newDefaultInstance();
    }

    @Override
    public Transformer newTransformer(Source source) throws TransformerConfigurationException {
        return wrapped.newTransformer(source);
    }

    @Override
    public Transformer newTransformer() throws TransformerConfigurationException {
        return wrapped.newTransformer();
    }

    @Override
    public Templates newTemplates(Source source) throws TransformerConfigurationException {
        return wrapped.newTemplates(source);
    }

    @Override
    public Source getAssociatedStylesheet(Source source, String string, String string1, String string2)
            throws TransformerConfigurationException {
        return wrapped.getAssociatedStylesheet(source, string, string1, string2);
    }

    @Override
    public void setURIResolver(URIResolver urir) {
        wrapped.setURIResolver(urir);
    }

    @Override
    public URIResolver getURIResolver() {
        return wrapped.getURIResolver();
    }

    @Override
    public void setFeature(String string, boolean bln) throws TransformerConfigurationException {
        wrapped.setFeature(string, bln);
    }

    @Override
    public boolean getFeature(String string) {
        return wrapped.getFeature(string);
    }

    @Override
    public void setAttribute(String string, Object o) {
        wrapped.setAttribute(string, o);
    }

    @Override
    public Object getAttribute(String string) {
        return wrapped.getAttribute(string);
    }

    @Override
    public void setErrorListener(ErrorListener el) {
        wrapped.setErrorListener(el);
    }

    @Override
    public ErrorListener getErrorListener() {
        return wrapped.getErrorListener();
    }

    @Override
    public String toString() {
        return super.toString() + " wrapped=" + wrapped.toString();
    }
}
