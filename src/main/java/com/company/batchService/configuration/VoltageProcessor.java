/**
 * 
 */
package com.company.batchService.configuration;


import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.company.batchService.model.Voltage;
/**
 * @author anush
 *
 */
public class VoltageProcessor implements ItemProcessor<Voltage, Voltage>{

    @Override
    public Voltage process(final Voltage voltage) {
        final BigDecimal volt = voltage.getVolt();
        final double time = voltage.getTime();

        final Voltage processedVoltage = new Voltage();
        processedVoltage.setVolt(volt);
        processedVoltage.setTime(time);
        return processedVoltage;
    }
}
