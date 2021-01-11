package com.antra.genshinimpact.controllers;


import com.antra.genshinimpact.domain.Weapon;
import com.antra.genshinimpact.exceptions.ErrorResponse;
import com.antra.genshinimpact.exceptions.WeaponException;
import com.antra.genshinimpact.service.WeaponService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Slf4j
@CrossOrigin("*")
@RestController
@RequestMapping("/weapon")
public class WeaponController {

    private WeaponService weaponService;

    @Autowired
    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    /*
    * FindAll
    * */
    @GetMapping("/all")
    public ResponseEntity<Set<Weapon>> findAll(){
        return new ResponseEntity<>(weaponService.findAll(), HttpStatus.OK);
    }
    /*
    * 演示如何把后端API数据 渲染到前端
    * */
    @GetMapping({"", "/", "/show"})
    public String findAll(Model model){
        Set<Weapon> weapons = weaponService.findAll();
        model.addAttribute("weapons", weapons);
        return "weapons/index";
    }
    /*
    * FindById
    * */
    @GetMapping("/{uid}") //localhost:8080/weapon/{uid}
    public ResponseEntity<Weapon> findById(@PathVariable("uid") Long id){

        Weapon current = weaponService.findById(id);

        if (current == null) {
            throw new WeaponException("这把武器不存在");
        }

        return new ResponseEntity<>(weaponService.findById(id), HttpStatus.OK);
    }

    /*
    * Delete
    * */
    @DeleteMapping("/{uid}")
    public ResponseEntity<String> deleteById(@PathVariable("uid") Long id) {
        Weapon weapon = weaponService.findById(id);

        if (weapon == null) {
            throw new WeaponException("这把武器不存在");
        }

        weaponService.deleteWeaponId(id);
        StringBuilder sb = new StringBuilder();
        sb.append("成功删除了 <" + weapon.getName() + ">");
        return new ResponseEntity<>(sb.toString(), HttpStatus.OK);
    }

    /*
    * Update
    * */
    @PutMapping(value = "/{uid}", consumes = "application/json")
    public ResponseEntity<Weapon> updateWeapon(@PathVariable("uid") Long id, @RequestBody Weapon weapon) {
        Weapon old = weaponService.findById(id);
        old.setAp(weapon.getAp());
        old.setLevel(weapon.getLevel());
        old.setName(weapon.getName());
        old.setRare(weapon.getRare());
        old.setTalent(weapon.getTalent());

        weaponService.updateWeapon(old);

        return new ResponseEntity<>(old, HttpStatus.OK);
    }

    @PostMapping(value = "/create", consumes = "application/json")
    public ResponseEntity<String> createWeapon(@RequestBody Weapon weapon){
        weaponService.saveWeapon(weapon);
        return new ResponseEntity<>("创建成功"+weapon.getName(), HttpStatus.CREATED);
    }


    @ExceptionHandler(WeaponException.class)
    public ResponseEntity<ErrorResponse> weaponException(Exception ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorCode(HttpStatus.NOT_FOUND.value());
        errorResponse.setErrorMessage(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

}
