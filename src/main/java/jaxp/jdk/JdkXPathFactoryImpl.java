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

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;
import javax.xml.xpath.XPathFunctionResolver;
import javax.xml.xpath.XPathVariableResolver;

/**
 *
 * @author rmartinc
 */
public class JdkXPathFactoryImpl extends XPathFactory {

    private final XPathFactory wrapped;

    public JdkXPathFactoryImpl() {
        wrapped = newDefaultInstance();
    }

    @Override
    public boolean isObjectModelSupported(String string) {
        return wrapped.isObjectModelSupported(string);
    }

    @Override
    public void setFeature(String string, boolean bln) throws XPathFactoryConfigurationException {
        wrapped.setFeature(string, bln);
    }

    @Override
    public boolean getFeature(String string) throws XPathFactoryConfigurationException {
        return wrapped.getFeature(string);
    }

    @Override
    public void setXPathVariableResolver(XPathVariableResolver xpvr) {
        wrapped.setXPathVariableResolver(xpvr);
    }

    @Override
    public void setXPathFunctionResolver(XPathFunctionResolver xpfr) {
        wrapped.setXPathFunctionResolver(xpfr);
    }

    @Override
    public XPath newXPath() {
        return wrapped.newXPath();
    }

    @Override
    public String toString() {
        return super.toString() + " wrapped=" + wrapped.toString();
    }
}
