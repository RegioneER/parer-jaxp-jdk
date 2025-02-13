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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author rmartinc
 */
public class JdkDatatypeFactoryImpl extends DatatypeFactory {

    private final DatatypeFactory wrapped;

    public JdkDatatypeFactoryImpl() {
        wrapped = newDefaultInstance();
    }

    @Override
    public Duration newDuration(String string) {
        return wrapped.newDuration(string);
    }

    @Override
    public Duration newDuration(long l) {
        return wrapped.newDuration(l);
    }

    @Override
    public Duration newDuration(boolean bln, BigInteger bi, BigInteger bi1, BigInteger bi2, BigInteger bi3,
            BigInteger bi4, BigDecimal bd) {
        return wrapped.newDuration(bln, bi, bi1, bi2, bi3, bi4, bd);
    }

    @Override
    public XMLGregorianCalendar newXMLGregorianCalendar() {
        return wrapped.newXMLGregorianCalendar();
    }

    @Override
    public XMLGregorianCalendar newXMLGregorianCalendar(String string) {
        return wrapped.newXMLGregorianCalendar(string);
    }

    @Override
    public XMLGregorianCalendar newXMLGregorianCalendar(GregorianCalendar gc) {
        return wrapped.newXMLGregorianCalendar(gc);
    }

    @Override
    public XMLGregorianCalendar newXMLGregorianCalendar(BigInteger bi, int i, int i1, int i2, int i3, int i4,
            BigDecimal bd, int i5) {
        return wrapped.newXMLGregorianCalendar(bi, i, i1, i2, i3, i4, bd, i5);
    }

    @Override
    public Duration newDuration(boolean isPositive, int years, int months, int days, int hours, int minutes,
            int seconds) {
        return wrapped.newDuration(isPositive, years, months, days, hours, minutes, seconds);
    }

    @Override
    public Duration newDurationDayTime(boolean isPositive, BigInteger day, BigInteger hour, BigInteger minute,
            BigInteger second) {
        return wrapped.newDurationDayTime(isPositive, day, hour, minute, second);
    }

    @Override
    public Duration newDurationDayTime(boolean isPositive, int day, int hour, int minute, int second) {
        return wrapped.newDurationDayTime(isPositive, day, hour, minute, second);
    }

    @Override
    public Duration newDurationDayTime(long durationInMilliseconds) {
        return wrapped.newDurationDayTime(durationInMilliseconds);
    }

    @Override
    public Duration newDurationDayTime(String lexicalRepresentation) {
        return wrapped.newDurationDayTime(lexicalRepresentation);
    }

    @Override
    public Duration newDurationYearMonth(boolean isPositive, BigInteger year, BigInteger month) {
        return wrapped.newDurationYearMonth(isPositive, year, month);
    }

    @Override
    public Duration newDurationYearMonth(boolean isPositive, int year, int month) {
        return wrapped.newDurationYearMonth(isPositive, year, month);
    }

    @Override
    public Duration newDurationYearMonth(long durationInMilliseconds) {
        return wrapped.newDurationYearMonth(durationInMilliseconds);
    }

    @Override
    public Duration newDurationYearMonth(String lexicalRepresentation) {
        return wrapped.newDurationYearMonth(lexicalRepresentation);
    }

    @Override
    public XMLGregorianCalendar newXMLGregorianCalendar(int year, int month, int day, int hour, int minute, int second,
            int millisecond, int timezone) {
        return wrapped.newXMLGregorianCalendar(year, month, day, hour, minute, second, millisecond, timezone);
    }

    @Override
    public XMLGregorianCalendar newXMLGregorianCalendarDate(int year, int month, int day, int timezone) {
        return wrapped.newXMLGregorianCalendarDate(year, month, day, timezone);
    }

    @Override
    public XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds,
            BigDecimal fractionalSecond, int timezone) {
        return wrapped.newXMLGregorianCalendarTime(hours, minutes, seconds, fractionalSecond, timezone);
    }

    @Override
    public XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, int milliseconds,
            int timezone) {
        return wrapped.newXMLGregorianCalendarTime(hours, minutes, seconds, milliseconds, timezone);
    }

    @Override
    public XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, int timezone) {
        return wrapped.newXMLGregorianCalendarTime(hours, minutes, seconds, timezone);
    }

    @Override
    public String toString() {
        return super.toString() + " wrapped=" + wrapped.toString();
    }
}
