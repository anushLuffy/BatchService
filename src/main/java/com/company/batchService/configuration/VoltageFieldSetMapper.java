/**
 * 
 */
package com.company.batchService.configuration;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;

import com.company.batchService.model.Voltage;

/**
 * @author anush
 *
 */
@Component
public class VoltageFieldSetMapper implements FieldSetMapper<Voltage> {
    @Override
    public Voltage mapFieldSet(FieldSet fieldSet) {
        final Voltage voltage = new Voltage();
        voltage.setVolt(fieldSet.readBigDecimal("volt"));
        voltage.setTime(fieldSet.readDouble("time"));
        return voltage;
    }
}