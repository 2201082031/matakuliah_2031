/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abdi.matakuliahabdi.controller;

import com.abdi.matakuliahabdi.entity.Matakuliah;
import com.abdi.matakuliahabdi.service.MatakuliahService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author M.ABDI
 */
@RestController
@RequestMapping("/api/v1/matakuliah")
public class MatakuliahController {
    @Autowired
    private MatakuliahService matakuliahService;
    
    @GetMapping
    public List<Matakuliah> getAll(){
        return matakuliahService.getAll();
    }
    
    @GetMapping(path = "{id}")
    public Matakuliah getMatakuliahById(@PathVariable("id") Long id){
        return matakuliahService.getMatakuliahById(id); 
    }
    
    @PostMapping
    public void insert(@RequestBody Matakuliah matakuliah){
        matakuliahService.insert(matakuliah); 
    }
    
    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long id){
        matakuliahService.delete(id);
     }
}

