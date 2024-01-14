/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abdi.matakuliahabdi.repository;

import com.abdi.matakuliahabdi.entity.Matakuliah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author M.ABDI
 */
@Repository
public interface MatakuliahRepository extends JpaRepository<Matakuliah , Long> {
    
}
