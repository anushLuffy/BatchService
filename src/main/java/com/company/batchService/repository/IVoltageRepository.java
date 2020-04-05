/**
 * 
 */
package com.company.batchService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.batchService.model.Voltage;

/**
 * @author anush
 *
 */
@Repository
public interface IVoltageRepository extends JpaRepository<Voltage, Long> {

}
